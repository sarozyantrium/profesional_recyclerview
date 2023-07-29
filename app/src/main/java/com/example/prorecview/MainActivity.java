package com.example.prorecview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recview;
    //RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recview=(RecyclerView) findViewById(R.id.recview);
        //calling the created method .without calling this method we cannot show this to screen even after writing all code;
        rec();


    }

    public void rec()
    {
        recview.setHasFixedSize(true);
        recview.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Model>modellocation=new ArrayList<>();

        modellocation.add(new Model("BENTEN","This is a ben ten",R.drawable.benten));
        modellocation.add(new Model("DOREMON","This is Doremon",R.drawable.doremon));
        modellocation.add(new Model("MICKY MOUSE ","This is micky mouse",R.drawable.mickymouse));
        modellocation.add(new Model("MOTU PATLU","This is motu patlu",R.drawable.motupatlu)) ;
        modellocation.add(new Model("Naruto","This is Naruto",R.drawable.naruto));
        modellocation.add(new Model("Nemo","This is Nemo",R.drawable.nemo));
        modellocation.add(new Model("NINJA","This is Ninja",R.drawable.oggyandcockroch));
        modellocation.add(new Model("PRANAV","This is Pranav",R.drawable.pranav));
        modellocation.add(new Model("TOM & JERRY","This is Tom & Jerry",R.drawable.tomandjerry));
        modellocation.add(new Model("SAROJ","This is Saroj",R.drawable.saroj));
        modellocation.add(new Model("SS","This is SS",R.drawable.ss));
        modellocation.add(new Model("SSS","This is SSS",R.drawable.sss));

        MyAdapter myAdapter=new MyAdapter(modellocation);
        recview.setAdapter(myAdapter);

    }
}