package com.leaoartes.listadejogos.adapter;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.leaoartes.listadejogos.R;
import com.leaoartes.listadejogos.model.ModelListGames;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Timer;

public class AdapterGamesList extends RecyclerView.Adapter<AdapterGamesList.MyViewHolder> {

    private List<ModelListGames> mDataset;
    public ImageView image;


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
        final ModelListGames modelList = mDataset.get(position);

        holder.imageViewLeft.setImageResource(modelList.getImageViewLeft());
        //holder.imageViewRight.setImageResource(modelList.getImageViewRight());


        //ASyncTask para melhorar imagens
        if (holder.asyncTask != null){
            holder.asyncTask.cancel(true);
            holder.asyncTask = null;
        }

        //evitando que a imagem pisque em um scroll rapido
        holder.imageViewLeft.setImageResource(modelList.getImageViewLeft());

        final ImageView image = holder.imageViewLeft;

        holder.asyncTask = new AsyncTask<Void, Void, Bitmap>() {
            @Override
            protected Bitmap doInBackground(Void... voids) {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    //reduzir a qualidade da imagem
                    options.inSampleSize = 30024;

                    return BitmapFactory.decodeStream(new FileInputStream(String.valueOf(image)), null, options);
                }catch (FileNotFoundException e){
                    e.printStackTrace();
                }
                return null;
            }
            @Override
            protected void onPostExecute(Bitmap bitmap){
                //image.setImageBitmap(bitmap);
                image.setImageResource(modelList.getImageViewLeft());
            }
        };
        holder.asyncTask.execute();
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
     public ImageView imageViewLeft;
     public TextView textViewCardTitle, textViewCardDescription;
        public AsyncTask<Void, Void, Bitmap> asyncTask;

        public MyViewHolder(View itemView){
            super(itemView);

            imageViewLeft = itemView.findViewById(R.id.imageViewLeft);
            textViewCardTitle = itemView.findViewById(R.id.textViewCardTitle);
            textViewCardDescription = itemView.findViewById(R.id.textViewCardDescription);

        }
    }

    public AdapterGamesList(List<ModelListGames> myDataset){
        mDataset = myDataset;
    }

}
