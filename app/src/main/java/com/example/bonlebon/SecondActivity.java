package com.example.bonlebon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button politiques = findViewById(R.id.portee);

        politiques.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Properly create an Intent to start SecondActivity
                Intent intent = new Intent(SecondActivity.this, ThirtActivity.class);
                startActivity(intent);
            }
        });

        Button def = findViewById(R.id.definitions);

        def.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Properly create an Intent to start SecondActivity
                Intent intent = new Intent(SecondActivity.this, FourtActivity.class);
                startActivity(intent);
            }
        });

        Button coll = findViewById(R.id.collecte);

        coll.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Properly create an Intent to start SecondActivity
                Intent intent = new Intent(SecondActivity.this, FifthActivity.class);
                startActivity(intent);
            }
        });

        Button fin = findViewById(R.id.fins);

        fin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Properly create an Intent to start SecondActivity
                Intent intent = new Intent(SecondActivity.this, SixthActivity.class);
                startActivity(intent);
            }
        });

        Button lim = findViewById(R.id.limite);

        lim.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Properly create an Intent to start SecondActivity
                Intent intent = new Intent(SecondActivity.this, SeventhActivity.class);
                startActivity(intent);
            }
        });

        Button cons = findViewById(R.id.consentement);

        cons.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Properly create an Intent to start SecondActivity
                Intent intent = new Intent(SecondActivity.this, EighthActivity.class);
                startActivity(intent);
            }
        });

        Button back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                finish();
            }
        });

    }
}
