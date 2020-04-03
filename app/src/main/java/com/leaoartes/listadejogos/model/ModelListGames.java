package com.leaoartes.listadejogos.model;


import android.widget.TextView;

import org.w3c.dom.Text;


public class ModelListGames {

    private int imageViewLeft, imageViewFull;
    private String textViewCardTitle, textViewCardDescription;

    public ModelListGames(){

    }


    public ModelListGames(int imageViewLeft, int imageViewFull, String textViewCardTitle, String textViewCardDescription){

        this.imageViewLeft = imageViewLeft;
        this.imageViewFull = imageViewFull;
        this.textViewCardTitle = textViewCardTitle;
        this.textViewCardDescription = textViewCardDescription;

    }

    public int getImageViewLeft() {
        return imageViewLeft;
    }

    public void setImageViewLeft(int imageViewLeft) {
        this.imageViewLeft = imageViewLeft;
    }

    public int getImageViewFull() {
        return imageViewFull;
    }

    public void setImageViewFull(int imageViewFull) {
        this.imageViewFull = imageViewFull;
    }

    public String getTextViewCardTitle() {
        return textViewCardTitle;
    }

    public void setTextViewCardTitle(String textViewCardTitle) {
        this.textViewCardTitle = textViewCardTitle;
    }

    public String getTextViewCardDescription() {
        return textViewCardDescription;
    }

    public void setTextViewCardDescription(String textViewCardDescription) {
        this.textViewCardDescription = textViewCardDescription;
    }
}
