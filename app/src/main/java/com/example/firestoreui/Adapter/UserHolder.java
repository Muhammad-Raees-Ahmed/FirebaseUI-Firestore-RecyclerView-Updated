package com.example.firestoreui.Adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firestoreui.R;


public class UserHolder extends RecyclerView.ViewHolder {
    TextView textViewName;
    TextView textViewfName;
    TextView textViewAge;
    CardView cardView,cardView1;
    public UserHolder(@NonNull View itemView) {
        super(itemView);
        textViewName = itemView.findViewById(R.id.text_view_name);
        textViewfName = itemView.findViewById(R.id.text_view_fName);
        textViewAge = itemView.findViewById(R.id.text_view_age);
        cardView=itemView.findViewById(R.id.card);
        cardView1=itemView.findViewById(R.id.delete);
    }
}
