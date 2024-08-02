package com.atividade.model;

import com.atividade.entity.Disciplina;
import jakarta.persistence.OneToMany;

import java.util.List;

public record CursoDTO(String nome,
                       List<Disciplina>listaDeDisciplinas) {

}
