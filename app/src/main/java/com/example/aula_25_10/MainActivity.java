package com.example.aula_25_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    protected Button botaoenviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoenviar = findViewById(R.id.buttonEnviar);

        botaoenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Aluno objAluno = new Aluno("Ichigo", 20);
                Intent intent = new Intent(getApplicationContext(),Activity2.class);
                intent.putExtra("objeto", objAluno);
                startActivity(intent);
            }
        });
    }
}