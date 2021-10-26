package com.example.modul2_kel10;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;

import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import java.util.ArrayList;

public class NamaNIMActivity extends AppCompatActivity {
    ListView simpleList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nama_nimactivity);
        ArrayList<Data> arrayList = new ArrayList<>();
        arrayList.add(new Data("Ilyasa Aliadjrun","21120119130058"));
        arrayList.add(new Data("Ahmad Rafly Pradana","21120119130085"));
        arrayList.add(new Data("Liem, Christopher Jaya Mulyawan","21120119130073"));
        arrayList.add(new Data("Gunawan Prasetya","21120119120025"));
        simpleList = (ListView)findViewById(R.id.simpleListView);
        Adapter adapter = new Adapter(this,R.layout.activity_listview,arrayList);
        simpleList.setAdapter(adapter);

    }
}