package com.example.als.appbaludocomlista;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by als on 22/11/2017.
 */

public class RepositorioAlunos {
    private static List<Aluno> alunos = new ArrayList<>();

    public static List<Aluno> getAlunos() {
        return alunos;
    }
}
