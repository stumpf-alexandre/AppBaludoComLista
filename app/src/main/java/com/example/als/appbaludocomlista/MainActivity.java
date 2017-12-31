package com.example.als.appbaludocomlista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button butaoBaludo;
    ListView listViewBaludo;
    List<Aluno> listaAlunos = RepositorioAlunos.getAlunos();
    AdapterAlunos adapter = new AdapterAlunos(listaAlunos,this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butaoBaludo = findViewById(R.id.butaoBaludo);
        listViewBaludo = findViewById(R.id.listViewBaludo);
        listViewBaludo.setAdapter(adapter);

        butaoBaludo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencao = new Intent(MainActivity.this,CadastroActivity.class);
                MainActivity.this.startActivity(intencao);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        adapter.notifyDataSetChanged();
    }
}
