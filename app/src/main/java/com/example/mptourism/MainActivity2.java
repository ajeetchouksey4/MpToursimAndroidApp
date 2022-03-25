package com.example.mptourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button bpl = findViewById(R.id.bhopal);
        Button indr = findViewById(R.id.indore);
        Button gwal = findViewById(R.id.gwalior);
        Button jbl = findViewById(R.id.jabalpur);

        bpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, BhoaplTask.class);
                startActivity(intent);
            }
        });

        indr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, IndoreTask.class);
                startActivity(intent);
            }
        });

        gwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, GwaliorTask.class);
                startActivity(intent);
            }
        });

        jbl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, JabalpurTask.class);
                startActivity(intent);
            }
        });
    }
}