package com.addetal.top10colombia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ListElement> elements;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    public void init() {
        elements = new ArrayList<>();
        elements.add(new ListElement("#fcee0b", "1. SHAKIRA", "B/QUILLA" + "\r\n" + "Pop, Urbano, Dance...", "2.979.599 oyentes",
                "1. She Wolf"+ "\r\n"+
                        "2. Whenever, Wherever" + "\r\n" +
                        "3. Hips Don't Lie" + "\r\n" +
                        "4. Hips Don't Lie (feat. Wyclef Jean)" + "\r\n" +
                        "5. Waka Waka (This Time for Africa)"));
        elements.add(new ListElement("#110bfc", "2. JUANES", "MEDELLIN"  + "\r\n\r" + "Pop", "773.746 oyentes",
                "1. La Camisa Negra"+ "\r\n"+
                        "2. A Dios Le Pido" + "\r\n" +
                        "3. Nada Valgo Sin Tu Amor" + "\r\n" +
                        "4. Volverte A Ver"+ "\r\n" +
                        "5. Para Tu Amor"));
        elements.add(new ListElement("#e81e09", "3. INQUISITION", "CALI" + "\r\n\r" + "Raw Black Metal", "65.176 oyentes",
                "1. Luciferian Ray"+ "\r\n"+
                        "2. Desolate Funeral Chant" + "\r\n" +
                        "3. From Chaos They Came"  + "\r\n" +
                        "4. Spirit Of The Black Star" + "\r\n" +
                        "5. Astral Path To Supreme Majesties"));
        elements.add(new ListElement("#fcee0b", "4. CARLOS VIVES", "SANTA MARTA" + "\r\n\r" + "Pop, Vallenato...", "376.671 oyentes",
                "1. La Bicicleta" + "\r\n"+
                        "2. Colombia, Mi Encanto" + "\r\n" +
                        "3. Robarte Un Beso" + "\r\n" +
                        "4. Canción Bonita" + "\r\n" +
                        "5. El Teke Teke"));
        elements.add(new ListElement("#110bfc", "5. FONSECA", "BOGOTA" + "\r\n" + "Latín Pop", "144.172 oyentes",
                "1. Te Mando Flores" + "\r\n"+
                        "2. Arroyito" + "\r\n" +
                        "3. Hace Tiempo" + "\r\n" +
                        "4. Como Me Mira" + "\r\n" +
                        "5. Enredame"));
        elements.add(new ListElement("#e81e09", "6. CABAS", "BARRANQUILLA"+"\r\n" +"Pop, Rock Caribeño", "82.774 oyentes",
                "1. Bonita" + "\r\n"+
                        "2. Mi BomBom" + "\r\n" +
                        "3. Tu Boca" + "\r\n" +
                        "4. Enamorándonos" + "\r\n" +
                        "5. Increíble"));
        elements.add(new ListElement("#fcee0b", "7. FRUKO Y SUS TESOS", "MEDELLÍN" +"\r\n" + "Salsa", "123.665 oyentes",
                "1. El Preso" + "\r\n"+
                        "2. El Caminante" + "\r\n" +
                        "3. Tronco Seco" + "\r\n" +
                        "4. Los Charcos" + "\r\n" +
                        "5. Procura"));
        elements.add(new ListElement("#110bfc", "8. AMPUTATED GENITALS", "BOGOTA" +"\r\n" + "Brutal Death", "4.955 oyentes",
                "1. Stepfather Child Molester"
                + "\r\n"+
                        "2. Garavito Attacks Again" + "\r\n" +
                        "3. Geriatric Blood Storm" + "\r\n" +
                        "4. Indigested With Human Heads" + "\r\n" +
                        "5. Bloody Justice"));
        elements.add(new ListElement("#e81e09", "9. GRUPO NICHE", "CALI" +"\r\n" +"Salsa", "158.205 oyentes",
                "1. Sin Sentimientos" + "\r\n"+
                        "2. Gotas De Lluvia" + "\r\n" +
                        "3. Una Aventura" + "\r\n" +
                        "4. Cali Pachanguero" + "\r\n" +
                        "5. Busca Por Dentro"));
        elements.add(new ListElement("#fcee0b", "10. PERNETT", "BARRANQUILLA"+"\r\n" +"Folclor Progresivo", "16.197 oyentes",
                "1. Hoy Es Mañana" + "\r\n"+
                        "2. The Caribbean Raver" + "\r\n" +
                        "3. Óptimo Positivo" + "\r\n" +
                        "4. El Pajarito - Ben Matik instrumental edit" + "\r\n" +
                        "5. Fruta Madura"));



        ListAdapter listAdapter = new ListAdapter(elements, this, this::moveToDescription);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
        recyclerView.setAdapter(listAdapter);

    }

    public void moveToDescription(ListElement item){
        Intent intent = new Intent(this, DescriptionActivity.class);
        intent.putExtra("ListElement", item);//681458 33542 2 8942 625
        startActivity(intent);
    }


}