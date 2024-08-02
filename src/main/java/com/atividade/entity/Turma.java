package com.atividade.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Turma {

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Escola escola;

    @OneToMany
    @JoinColumn(name = "turma_id")
    private List<Aluno> listaDeAlunos;
}
