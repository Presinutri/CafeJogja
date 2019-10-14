package com.voc.cafejogja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import static com.voc.cafejogja.CafeData.getListData;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCafe;
    private ArrayList<Cafe> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCafe = findViewById(R.id.rv_cafe);
        rvCafe.setHasFixedSize(true);

        list.addAll(CafeData.getListData());

        getSupportActionBar().setTitle("List Cafe Jogja");
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvCafe.setLayoutManager(new LinearLayoutManager(this));
        ListCafeAdapter listCafeAdapter = new ListCafeAdapter(list);
        rvCafe.setAdapter(listCafeAdapter);
        Log.d("LISTMU",list.get(0).getNama().toString());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.profil,menu);
        return true;
    }

    public void goProfile(MenuItem item) {
        Intent intent = new Intent(this, Profil2.class);
        startActivity(intent);
    }
}
