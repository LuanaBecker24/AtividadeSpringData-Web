package com.atividade.model;

import com.atividade.entity.Disciplina;
import com.atividade.entity.Endereco;
import com.atividade.entity.Escola;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.List;

public record ProfessorDTO(String nome,
                           String email,
                           String telefone,
                           Escola escola,
                           List<Disciplina> listaDeDisciplinas,
                           Endereco endereco) {
}
