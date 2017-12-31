package com.example.als.appbaludocomlista;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by als on 22/11/2017.
 */

public class AdapterAlunos extends BaseAdapter {
    List<Aluno> alunos;
    Context context;

    public AdapterAlunos(List<Aluno> alunos, Context context) {
        this.alunos = alunos;
        this.context = context;
    }

    @Override
    public int getCount() {
        return alunos.size();
    }

    @Override
    public Object getItem(int i) {
        return alunos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View resultView = LayoutInflater.from(context).inflate(R.layout.item_aluno,viewGroup,false);
        TextView tvNome = resultView.findViewById(R.id.tvNome);
        TextView tvCgu = resultView.findViewById(R.id.tvCgu);

        Aluno aluno = alunos.get(i);
        tvNome.setText(aluno.getNome());
        tvCgu.setText(aluno.getCgu());

        return null;
    }
}
