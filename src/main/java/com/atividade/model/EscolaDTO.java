package com.atividade.model;

import com.atividade.entity.Curso;
import com.atividade.entity.Endereco;
import com.atividade.entity.Professor;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.List;

public record EscolaDTO(String nome,
                        Endereco endereco,
                        String email,
                        List<Professor> listaDeProfessores,
                        List<Curso> listaCursos) {
}
