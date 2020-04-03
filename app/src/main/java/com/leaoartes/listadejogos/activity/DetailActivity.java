package com.leaoartes.listadejogos.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.leaoartes.listadejogos.R;
import com.leaoartes.listadejogos.model.ModelListGames;

import java.util.List;

public class DetailActivity extends AppCompatActivity {

    public TextView textViewCardTitle, textViewCardDescription;
    public ImageView imageViewCardGames;

    private List<ModelListGames> listGamesAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        listItemClicked();

        textViewCardTitle = findViewById(R.id.textViewCardTitle);
        textViewCardDescription = findViewById(R.id.textViewCardDescription);
        imageViewCardGames = findViewById(R.id.imageViewCardGame);



    }

    public void listItemClicked(){

        if(getIntent().hasExtra("title") && getIntent().hasExtra("description") && getIntent().hasExtra("imagefull")){

            String title = getIntent().getStringExtra("title");
            String description = getIntent().getStringExtra("description");

            setItems(title, description);
        }

    }

    public void setItems(String title, String description){

        textViewCardTitle = findViewById(R.id.textViewCardTitle);
        textViewCardTitle.setText(title);

        textViewCardDescription = findViewById(R.id.textViewCardDescription);
        textViewCardDescription.setText(description);

        imageViewCardGames = findViewById(R.id.imageViewCardGame);
        Bundle bundle = this.getIntent().getExtras();
        int imageCard = bundle.getInt("imagefull");
        imageViewCardGames.setImageResource(imageCard);

    }


}
