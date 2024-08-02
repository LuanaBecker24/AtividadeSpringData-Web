package com.atividade.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Curso {

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany
    @JoinTable(name = "curso_disciplina", joinColumns = @JoinColumn(name = "curso_id"),
    inverseJoinColumns = @JoinColumn(name = "disciplina_id"))
    private List<Disciplina> listaDeDisciplinas;

    public Curso(String nome) {
        this.nome = nome;
    }
}
