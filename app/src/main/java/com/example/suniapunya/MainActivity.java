package com.example.suniapunya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Model> main_list;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_list=new ArrayList<>();
        recyclerView=findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        main_list.add(new Model(R.drawable.antman,"Ant Man and The Wasp","Ant-Man and the Wasp adalah film superhero Amerika Serikat tahun 2018 yang disutradarai oleh Peyton Reed dan diproduseri oleh Kevin Feige dan Stephen Broussard. Naskah film ini ditulis oleh Chris McKenna, Erik Sommers, Paul Rudd, Andrew Barrer dan Gabriel Ferrari berdasarkan komik Ant-Man karya Stan Lee, Larry Lieber dan Jack Kirby serta komik Wasp karya Stan Lee, Ernie Hart dan Jack Kirby. Film ini dibintangi oleh Paul Rudd, Evangeline Lilly, Michael Peña, Walton Goggins, Hannah John-Kamen, Michelle Pfeiffer, Laurence Fishburne dan Michael Douglas."));
        main_list.add(new Model(R.drawable.endgame,"Avengers End Game","Avengers Endgame Setelah peristiwa yang menghancurkan dalam Avengers:Infinity War (2018), alam semesta kacau balau karena aksi si Mad Titan, Thanos. Dengan bantuan sekutu yang tersisa, Avengers harus berkumpul sekali lagi untuk membatalkan tindakan Thanos dan mengembalikan kedamaian alam semesta untuk semua, tak peduli konsekuensi apa yang menunggu, masih menjadi rahasia avengers mengembalikan keadaan alam semesta."));
        main_list.add(new Model(R.drawable.infinity,"Avengers Infinity War","Avengers Infinity War adalah film superhero yang berasal dari Amerika Serikat tahun 2018 beranggotakan tim superhero Avengers yang diproduksi oleh Marvel Studios dan didistribusikan oleh Walt Disney Studios Motion Pictures. Film ini adalah sekuel dari The Avengers dan Avengers: Age of Ultron, serta merupakan film kesembilan belas dalam Marvel Cinematic Universe (MCU). Film ini disutradarai oleh Anthony dan Joe Russo, dengan naskah ditulis oleh Christopher Markus & Stephen McFeely, dan menampilkan para pemeran seperti Robert Downey Jr."));
        main_list.add(new Model(R.drawable.doctor,"Doctor Strange","Doctor Strange adalah sebuah film pahlawan super Amerika yang menampilkan karakter Marvel Comics dengan nama yang sama, diproduksi oleh Marvel Studios dan didistribusikan oleh Walt Disney Motion Pictures. Film ini merupakan film ke-14 dari Marvel Cinematic Universe (MCU). Film ini disutradarai oleh Scott Derickson, yang menulis skenario adalah C. Robert Cargill dari sebuah cerita oleh duo dan Jon Spahits, dan dibintangi oleh Benedict Cumberbatch, Chiwetel Ejiofor, Rachel McAdams, Benedict Wong, Michael Stuhlbarg, Benjamin Bratt, Scott Adkins, Mads Mikkelsen, dan Tilda Swinton."));
        main_list.add(new Model(R.drawable.ragnarok,"Thor Ragnarok","Thor: Ragnarok adalah film pahlawan super berdasarkan karakter Marvel Comics, Thor, dan diproduksi oleh Marvel Studios serta didistribusikan oleh Walt Disney Studios Motion Pictures. Film ini adalah sekuel dari Thor dan Thor: The Dark World serta merupakan film kedelapan belas dari Marvel Cinematic Universe (MCU). Film ini disutradarai oleh Taika Waititi dengan skenario dari Eric Pearson, serta dibintangi oleh Chris Hemsworth, Tom Hiddleston, Cate Blanchett, Idris Elba, Jeff Goldblum, Tessa Thompson, Karl Urban, Mark Ruffalo dan Anthony Hopkins."));
        main_list.add(new Model(R.drawable.thenun,"The Nun","The Nun adalah sebuah film horor supernatural gotik Amerika yang disutradarai oleh Corin Hardy[2] dan ditulis oleh Gary Dauberman, dari sebuah cerita oleh Dauberman and James Wan.[3] Sempalan dari The Conjuring 2 tahun 2016, dan seri kelima dalam The Conjuring Universe, film ini dibintangi oleh Demián Bichir, Taissa Farmiga, dan Jonas Bloquet. Alur cerita mengisahkan seorang pastor dan novisiat Katolik ketika mereka menemukan rahasia yang tidak suci di Rumania tahun 1952."));
        adapter=new CustomAdapter(main_list,getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
}