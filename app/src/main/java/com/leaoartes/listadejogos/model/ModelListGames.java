package com.leaoartes.listadejogos.model;

import android.widget.ImageView;

public class ModelListGames {

    private int imageViewLeft, imageViewRight;

    public ModelListGames(){

    }

    public ModelListGames(int imageViewRight, int imageViewLeft){

        this.imageViewLeft = imageViewLeft;
        this.imageViewRight = imageViewRight;

    }

    public int getImageViewLeft() {
        return imageViewLeft;
    }

    public void setImageViewLeft(int imageViewLeft) {
        this.imageViewLeft = imageViewLeft;
    }

    public int getImageViewRight() {
        return imageViewRight;
    }

    public void setImageViewRight(int imageViewRight) {
        this.imageViewRight = imageViewRight;
    }
}
