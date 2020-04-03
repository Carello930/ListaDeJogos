package com.leaoartes.listadejogos.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.leaoartes.listadejogos.R;
import com.leaoartes.listadejogos.adapter.AdapterGamesList;
import com.leaoartes.listadejogos.model.ModelListGames;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<ModelListGames> gamesListAll = new ArrayList<>();

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapterRecycleView;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //encontrar o ID do recycleview
        recyclerView = findViewById(R.id.recyclerView);

        //Configurar gerenciador de Layout
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //Configura um adaptador(Alimenta os dados para a lista e configura os novos itens)
        this.addValueGames();
        mAdapterRecycleView = new AdapterGamesList(gamesListAll);
        recyclerView.setAdapter(mAdapterRecycleView);


    }
        //Adicionar valores para a lista
        public void addValueGames(){

            ModelListGames modelListGames = new ModelListGames(R.drawable.assassinscreedodyssey, R.drawable.assassinscreedodyssey);
            this.gamesListAll.add(modelListGames);

            modelListGames = new ModelListGames(R.drawable.battlefield, R.drawable.battlefield);
            this.gamesListAll.add(modelListGames);
        }

    }

