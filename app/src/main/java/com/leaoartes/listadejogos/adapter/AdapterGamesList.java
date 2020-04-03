package com.leaoartes.listadejogos.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.leaoartes.listadejogos.R;
import com.leaoartes.listadejogos.model.ModelListGames;

import java.util.List;

public class AdapterGamesList extends RecyclerView.Adapter<AdapterGamesList.MyViewHolder> {

    private List<ModelListGames> mDataset;

    //Criar novas views (Chamando LayoutManager)
    @NonNull
    @Override
    public AdapterGamesList.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_games_layout, parent, false);

        MyViewHolder vh = new MyViewHolder(itemView);
        return (vh);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ModelListGames modelList = mDataset.get(position);

        holder.imageViewLeft.setImageResource(modelList.getImageViewLeft());
        holder.imageViewRight.setImageResource(modelList.getImageViewRight());
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
     public ImageView imageViewLeft, imageViewRight;

        public MyViewHolder(View itemView){
            super(itemView);

            imageViewLeft = itemView.findViewById(R.id.imageViewLeft);
            imageViewRight = itemView.findViewById(R.id.imageViewRight);
        }
    }

    public AdapterGamesList(List<ModelListGames> myDataset){
        mDataset = myDataset;
    }


    //Criar uma nova View invocando o LayoutManager

}
