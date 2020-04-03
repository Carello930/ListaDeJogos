package com.leaoartes.listadejogos.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
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
        layoutManager = new GridLayoutManager(getApplicationContext(), 2);
        recyclerView.setLayoutManager(layoutManager);

        //Configura um adaptador(Alimenta os dados para a lista e configura os novos itens)
        this.addValueGames();
        mAdapterRecycleView = new AdapterGamesList(gamesListAll);
        recyclerView.setAdapter(mAdapterRecycleView);
        recyclerView.setHasFixedSize(true);


    }
        //Adicionar valores para a lista
        public void addValueGames(){

            ModelListGames modelListGames = new ModelListGames(R.drawable.assassinscreedodyssey);
            this.gamesListAll.add(modelListGames);

            modelListGames = new ModelListGames(R.drawable.battlefield);
            this.gamesListAll.add(modelListGames);

            modelListGames = new ModelListGames(R.drawable.daysgone);
            this.gamesListAll.add(modelListGames);

            modelListGames = new ModelListGames(R.drawable.fifa);
            this.gamesListAll.add(modelListGames);

            modelListGames = new ModelListGames(R.drawable.godofwar);
            this.gamesListAll.add(modelListGames);

            modelListGames = new ModelListGames(R.drawable.granturismo);
            this.gamesListAll.add(modelListGames);

            modelListGames = new ModelListGames(R.drawable.homefront);
            this.gamesListAll.add(modelListGames);

            modelListGames = new ModelListGames(R.drawable.horizonzerodawn);
            this.gamesListAll.add(modelListGames);

            modelListGames = new ModelListGames(R.drawable.infamous);
            this.gamesListAll.add(modelListGames);

            modelListGames = new ModelListGames(R.drawable.nioh);
            this.gamesListAll.add(modelListGames);

            modelListGames = new ModelListGames(R.drawable.playerunknownsbattlegrounds);
            this.gamesListAll.add(modelListGames);

            modelListGames = new ModelListGames(R.drawable.residentevil);
            this.gamesListAll.add(modelListGames);

            modelListGames = new ModelListGames(R.drawable.spiderman);
            this.gamesListAll.add(modelListGames);

            modelListGames = new ModelListGames(R.drawable.starwarsjedi);
            this.gamesListAll.add(modelListGames);

            modelListGames = new ModelListGames(R.drawable.theevilwithin);
            this.gamesListAll.add(modelListGames);

        }

    }

