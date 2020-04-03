package com.leaoartes.listadejogos.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.leaoartes.listadejogos.R;
import com.leaoartes.listadejogos.adapter.AdapterGamesList;

public class MainActivity extends AppCompatActivity {

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
        mAdapterRecycleView = new AdapterGamesList();
        recyclerView.setAdapter(mAdapterRecycleView);

    }
}
