package com.example.als.appbaludocomlista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroActivity extends AppCompatActivity {
    EditText etNome;
    EditText etCgu;
    Button btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        etNome = findViewById(R.id.etNome);
        etCgu = findViewById(R.id.etCgu);
        btnCadastrar = findViewById(R.id.btnCadastrar);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RepositorioAlunos.getAlunos().add(getAluno());
                CadastroActivity.this.finish();
            }
        });
    }

    private Aluno getAluno(){
        Aluno aluno = new Aluno();
        aluno.setNome(etNome.getText().toString());
        aluno.setCgu(etCgu.getText().toString());
        return aluno;
    }
}
