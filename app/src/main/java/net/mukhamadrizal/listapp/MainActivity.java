package net.mukhamadrizal.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSimple = (Button)  findViewById(R.id.button_simple_list);
        btnSimple.setOnClickListener(this);

        Button btnCustom = (Button) findViewById(R.id.button_custom_list);
        btnCustom.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        Class<?> actionClass = null;
        if (v.getId() == R.id.button_simple_list){
            actionClass = SimpleListActivity.class;
        }else if(v.getId() == R.id.button_custom_list){
            actionClass = CustomListActivity.class;
        }

        Intent menuIntent = new Intent(MainActivity.this,actionClass);
        startActivity(menuIntent);
    }
}