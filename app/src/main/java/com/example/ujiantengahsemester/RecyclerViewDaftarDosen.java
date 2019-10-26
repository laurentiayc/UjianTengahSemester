package com.example.ujiantengahsemester;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.ujiantengahsemester.Adapter.DosenAdapter;
import com.example.ujiantengahsemester.Model.Dosen;

import java.util.ArrayList;

public class RecyclerViewDaftarDosen extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DosenAdapter dosenAdapter;
    private ArrayList<Dosen> dosenList;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.create,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.menu1){
            Intent intent = new Intent(RecyclerViewDaftarDosen.this,CreateDosenActivity.class);
            startActivity(intent);
        }
        return  true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_daftar_dosen);
        this.setTitle("SI KRS - Hai Admin");
        tambahData();

        recyclerView = findViewById(R.id.rvDosen);
        dosenAdapter = new DosenAdapter(dosenList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecyclerViewDaftarDosen.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(dosenAdapter);
    }

    private void tambahData(){
        dosenList = new ArrayList<>();
        dosenList.add(new Dosen("001","Wimmie Handiwidjojo", "Drs., MIT ","whanz@staff.ukdw.ac.id","Jl. Sagan",R.drawable.wimmie));
        dosenList.add(new Dosen("002","Yetli Oslan", "S.Kom., M.T.","yetli@staff.ukdw.ac.id","Jl. Godean",R.drawable.yetli));
        dosenList.add(new Dosen("003","Jong Jek Siang", "Drs., M.Sc.","jjs@staff.ukdw.ac.id","Jl. Magelang",R.drawable.jjs));
        dosenList.add(new Dosen("004","Budi Sutedjo Dharma Oetomo", "S.Kom., M.M.","budi@staff.ukdw.ac.id","Jl. Timoho",R.drawable.budi));
        dosenList.add(new Dosen("005","Argo Wibowo", "S.T., M.T.","argo@staff.ukdw.ac.id","Jl. Godean",R.drawable.argo));
    }
}