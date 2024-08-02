package com.atividade.model;

import com.atividade.entity.Aluno;
import com.atividade.entity.Escola;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.List;

public record TurmaDTO(String nome,
                       Escola escola,
                       List<Aluno> listaDeAlunos) {
}
