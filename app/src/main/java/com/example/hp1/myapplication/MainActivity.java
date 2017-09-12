package com.example.hp1.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView lvSchedule;
    ArrayList<String> arrSchedule = new ArrayList<>();
ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrSchedule.add("Math");
        arrSchedule.add("Computers");

        lvSchedule = (ListView) findViewById(R.id.lvSchedule);
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrSchedule);

        lvSchedule.setAdapter(arrayAdapter);


    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Toast.makeText(this, arrSchedule.get(i),Toast.LENGTH_SHORT).show();

    }
}
