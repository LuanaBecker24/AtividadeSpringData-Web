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
public class Disciplina {

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany(mappedBy = "listaDeDisciplinas")
    private List<Professor> listaDeProfessores;

    public Disciplina(String nome) {
        this.nome = nome;
    }
}
