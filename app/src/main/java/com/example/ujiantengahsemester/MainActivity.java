package com.example.ujiantengahsemester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getSupportActionBar().hide();

        Button btnSignIn = (Button) findViewById(R.id.btnSignIn);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HomeAdmin.class);
                startActivity(intent);
            }
       });

        Button btnSignDosen = (Button)findViewById(R.id.btnSignInDosen);
        btnSignDosen.setOnClickListener(new View.OnClickListener() {
          @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HomeDosen.class);
                startActivity(intent);
            }
        });
     }
}