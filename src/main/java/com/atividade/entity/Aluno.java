package com.atividade.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Aluno{

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private String telefone;

    @OneToOne
    @JoinColumn(nullable = false)
    private Endereco endereco;

    public Aluno(String email, String nome, String telefone, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }
}
