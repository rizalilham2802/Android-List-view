package net.mukhamadrizal.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SimpleListActivity extends AppCompatActivity {

    private ListView lvItem;
    private String[] players = new String[]{
            "Cristiano Ronaldo", "Paulo Dybala", "Mario Mandžukić",
            "Miralem Pjanić", "Sami Khedira", "Emre Can", "Claudio Marchisio",
            "Medhi Benatia", "Giorgio Chiellini", "Leonardo Bonuci",
            "Wojciech Szczęsny"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list);

        lvItem = (ListView) findViewById(R.id.lv_simple);
        ArrayAdapter<String> simpleAdapter = new ArrayAdapter<String>(SimpleListActivity.this,
                android.R.layout.simple_list_item_1, android.R.id.text1, players);
        lvItem.setAdapter(simpleAdapter);
    }
}