package com.leaoartes.listadejogos.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.leaoartes.listadejogos.R;
import com.leaoartes.listadejogos.adapter.AdapterGamesList;
import com.leaoartes.listadejogos.model.ModelListGames;
import com.leaoartes.listadejogos.onClickListener.RecyclerItemClickListener;

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

        //Evento de click
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {

                                //Chamar outra activity
                                Intent cardview = new Intent(MainActivity.this,
                                        DetailActivity.class);
                                ModelListGames modelListGames = gamesListAll.get(position);

                                //Enviar String para outra activity
                                cardview.putExtra("title", modelListGames.getTextViewCardTitle());
                                cardview.putExtra("description", modelListGames.getTextViewCardDescription());

                                //Enviar imagem para outra activity
                                Bundle bundle = new Bundle();
                                bundle.putInt("imagefull", modelListGames.getImageViewFull());
                                cardview.putExtras(bundle);
                                startActivity(cardview);

                            }

                            @Override
                            public void onLongItemClick(View view, int position) {

                            }

                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            }
                        }
                )
                        );

    }
        //Adicionar valores para a lista
        public void addValueGames(){

            ModelListGames modelListGames = new ModelListGames(R.drawable.assassinscreedodyssey, R.drawable.assassinscreedodysseyfull, "Assassin's Creed Odyssey","Assassin's Creed Odyssey é um jogo eletrônico de RPG de ação produzido pela Ubisoft Quebec e publicado pela Ubisoft. É o décimo primeiro título principal da série Assassin's Creed e foi lançado em 5 de Outubro de 2018, para Microsoft Windows, PlayStation 4, Xbox One e Nintendo Switch. (Plataformas PS4, Xbox One, Computador e Switch)" );
            this.gamesListAll.add(modelListGames);

            modelListGames = new ModelListGames(R.drawable.battlefield, R.drawable.battlefieldfull, "Battlefield 1", "Battlefield 1 é um jogo eletrônico de tiro em primeira pessoa ambientado na Primeira Guerra Mundial, desenvolvido pela EA DICE e publicada pela Electronic Arts. É o décimo quarto jogo da franquia Battlefield. Foi lançado em outubro de 2016 para Microsoft Windows, PlayStation 4 e Xbox One.(Plataformas PS4, Xbox One, Computador e Switch)");
            this.gamesListAll.add(modelListGames);

            modelListGames = new ModelListGames(R.drawable.daysgone, R.drawable.daysgonefull, "Days Gone", "Days Gone é um jogo eletrônico de ação-aventura e sobrevivência desenvolvido pela SIE Bend Studio e publicado pela Sony Interactive Entertainment, sendo lançado exclusivamente para PlayStation 4 em 26 de abril de 2019.");
            this.gamesListAll.add(modelListGames);

            modelListGames = new ModelListGames(R.drawable.fifa, R.drawable.fifafull,  "FIFA 20", "FIFA 20 é um jogo eletrônico de futebol desenvolvido e publicado pela EA Sports, lançado mundialmente em 27 de setembro de 2019. Este é o vigésimo sétimo título da série FIFA e o quarto a usar o mecanismo de jogo da Frostbite para Xbox One, PS4 e PC.");
            this.gamesListAll.add(modelListGames);

            modelListGames = new ModelListGames(R.drawable.godofwar, R.drawable.godofwarfull,  "God of War III", "God of War III é um jogo eletrônico de ação-aventura e hack and slash desenvolvido pela Santa Monica Studio e publicado pela Sony Computer Entertainment. Foi lançado em 16 de março de 2010 para PlayStation 3.");
            this.gamesListAll.add(modelListGames);

            modelListGames = new ModelListGames(R.drawable.granturismo, R.drawable.granturismofull,  "Gran Turismo Sport", "Gran Turismo Sport é um jogo eletrônico simulador de corrida desenvolvido pela Polyphony Digital e publicado pela Sony Interactive Entertainment. É o sétimo título principal da série Gran Turismo e foi lançado exclusivamente para PlayStation 4 em outubro de 2017.");
            this.gamesListAll.add(modelListGames);

            modelListGames = new ModelListGames(R.drawable.homefront, R.drawable.homefrontfull,  "Homefront: The Revolution", "Homefront: The Revolution é um videogame de tiro em primeira pessoa desenvolvido pela Dambuster Studios e publicado pela Deep Silver para Microsoft Windows, PlayStation 4 e Xbox One. É a reinicialização / sequela do Homefront lançando em 17 de maio de 2016.");
            this.gamesListAll.add(modelListGames);

            modelListGames = new ModelListGames(R.drawable.horizonzerodawn, R.drawable.horizonzerodawnfull,  "Horizon Zero Dawn", "Horizon Zero Dawn é um jogo eletrônico RPG de ação desenvolvido pela Guerrilla Games e publicado pela Sony Interactive Entertainment lançado em 28 de fevereiro de 2017.");
            this.gamesListAll.add(modelListGames);

            modelListGames = new ModelListGames(R.drawable.infamous, R.drawable.infamousfull,  "Infamous: Second Son", "Infamous Second Son é um jogo eletrônico de ação-aventura produzido pela Sucker Punch Productions e publicado pela Sony Computer Entertainment em exclusivo para a PlayStation 4 em 21 de Março de 2014. ");
            this.gamesListAll.add(modelListGames);

            modelListGames = new ModelListGames(R.drawable.nioh, R.drawable.niohfull,  "Nioh 2", "Nioh 2 é um jogo eletrônico de RPG de ação desenvolvido pela Team Ninja e publicado pela Koei Tecmo no Japão e pela Sony Interactive Entertainment internacionalmente. É uma pré-sequência de Nioh e foi lançado em 13 de março de 2020 para PlayStation 4.");
            this.gamesListAll.add(modelListGames);

            modelListGames = new ModelListGames(R.drawable.playerunknownsbattlegrounds, R.drawable.playerunknownsbattlegroundsfull,  "PlayerUnknown's Battlegrounds", "PlayerUnknown's Battlegrounds é um jogo eletrônico multiplayer desenvolvido pela PUBG Corp., subsidiária da produtora coreana Bluehole, utilizando o motor de jogo Unreal Engine 4 foi lançado em 30 de julho de 2016.");
            this.gamesListAll.add(modelListGames);

            modelListGames = new ModelListGames(R.drawable.residentevil, R.drawable.residentevilfull,  "Resident Evil 2", "Resident Evil 2, chamado no Japão de Biohazard RE:2, é um jogo eletrônico de survival horror desenvolvido e publicado pela Capcom, sendo um remake do jogo original de 1998. Os jogadores controlam o policial novato Leon foi lançado em 25 de janeiro de 2019.");
            this.gamesListAll.add(modelListGames);

            modelListGames = new ModelListGames(R.drawable.spiderman, R.drawable.spidermanfull,  "Spider-Man", "Spider-Man é um jogo eletrônico de ação-aventura desenvolvido pela Insomniac Games e publicado pela Sony Interactive Entertainment lançado em 7 de setembro de 2018.");
            this.gamesListAll.add(modelListGames);

            modelListGames = new ModelListGames(R.drawable.starwarsjedi, R.drawable.starwarsjedifull,  "Star Wars Jedi: Fallen Order", "Star Wars Jedi: Fallen Order é um jogo eletrônico de ação-aventura desenvolvido pela Respawn Entertainment e publicado pela Electronic Arts foi lançado em 15 de novembro de 2019.");
            this.gamesListAll.add(modelListGames);

            modelListGames = new ModelListGames(R.drawable.theevilwithin, R.drawable.theevilwithinfull,  "The Evil Within", "The Evil Within, chamado no Japão de PsychoBreak, é um jogo eletrônico de terror de sobrevivência desenvolvido pela Tango Gameworks e publicado pela Bethesda Softworks. Foi lançado mundialmente em outubro de 2014 para Microsoft Windows, PlayStation 3, PlayStation 4, Xbox 360 e Xbox One.");
            this.gamesListAll.add(modelListGames);

        }

    }

