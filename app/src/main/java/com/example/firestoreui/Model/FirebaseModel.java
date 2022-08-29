package com.example.firestoreui.Model;

import static com.example.firestoreui.Model.Immutable.COLLECTION_USER;

import androidx.annotation.NonNull;

import com.example.firestoreui.Activity.MainActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;

public class FirebaseModel {
    private static FirebaseModel single_instance = null;
    private final FirebaseFirestore db;

    // check  instance
    public FirebaseModel() {
        db = FirebaseFirestore.getInstance();
    }

    public static FirebaseModel getInstance() {
        if (single_instance == null)
            single_instance = new FirebaseModel();
        return single_instance;
    }

    public void addUser(MainActivity mainActivity, User user){
        db.collection(COLLECTION_USER).document()
                .set(user)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()){
                            System.out.println("Data inserted");
                            mainActivity.updateUI(task.isSuccessful());
                        }
                        else{
                            System.out.println("Data not inserted");
                        }
                    }
                });
    }

}

