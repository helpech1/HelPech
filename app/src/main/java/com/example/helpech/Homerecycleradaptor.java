package com.example.helpech;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Homerecycleradaptor extends RecyclerView.Adapter<Homerecycleradaptor.Viewholder>{
    List<String> data;


    @NonNull
    @Override
    public Homerecycleradaptor.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull Homerecycleradaptor.Viewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class Viewholder extends RecyclerView.ViewHolder{
        public Viewholder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
