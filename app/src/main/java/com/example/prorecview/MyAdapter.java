package com.example.prorecview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.myviewholder>
{
    ArrayList<Model>modellocation;

    public MyAdapter(ArrayList<Model>modellocation)
    {
        this.modellocation=modellocation;
    }
    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.ui_view,parent,false);

        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {

        Model model=modellocation.get(position);
        holder.image_view.setImageResource(model.getImage_view());
        holder.txt_one.setText(model.getTxt_one());
        holder.txt_two.setText(model.getTxt_two());
    }

    @Override
    public int getItemCount() {
        return modellocation.size();
    }

    public static class myviewholder extends RecyclerView.ViewHolder{

        ImageView image_view;
        TextView txt_one,txt_two;


        public myviewholder(@NonNull View itemView) {
            super(itemView);

            image_view=itemView.findViewById(R.id.image_view);
            txt_one=itemView.findViewById(R.id.txt_one);
            txt_two=itemView.findViewById(R.id.txt_two);

        }
    }
}
