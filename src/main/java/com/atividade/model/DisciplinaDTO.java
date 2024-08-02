package com.atividade.model;

import com.atividade.entity.Professor;

import java.util.List;

public record DisciplinaDTO(String nome,
                            List<Professor>listaDeProfessores) {
}
