package com.atividade.model;

import com.atividade.entity.Endereco;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public record AlunoDTO (String nome,
                       String email,
                       String telefone,
                       Endereco endereco) {
}
