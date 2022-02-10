package com.example.finallproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CardMainActivity extends RecyclerView.Adapter<CardMainActivity.MyViewHolder>  {

    private ArrayList<DataModel> dataSet;

    public CardMainActivity(ArrayList<DataModel> dataSet) {

        this.dataSet = dataSet;
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;

        public MyViewHolder (View itemView )
        {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.card_view);
            textViewName = ( TextView) itemView.findViewById(R.id.item_title);
            imageViewIcon = (ImageView) itemView.findViewById(R.id.item_image);

        }

    }

    @NonNull
    @Override
    public CardMainActivity.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View view = LayoutInflater.from(parent.getContext() ).inflate(R.layout.activity_card_main , parent ,false);

        CardMainActivity.MyViewHolder myViewHolder = new CardMainActivity.MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CardMainActivity.MyViewHolder viewHolder, int listPosition) {

//        TextView textViewName = viewHolder.textViewName;
//        ImageView imageView = viewHolder.imageViewIcon;
//        CardView cardView = viewHolder.cardView;
//
//        textViewName.setText(dataSet.get(listPosition).getName());
//        imageView.setImageResource(dataSet.get(listPosition).getImage());
        viewHolder.textViewName.setText(dataSet.get(listPosition).getName());
        viewHolder.imageViewIcon.setImageResource(dataSet.get(listPosition).getImage());


    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

}