package com.atividade.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Escola {

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne
    @JoinColumn(nullable = false)
    private Endereco endereco;

    private String email;

    @OneToMany(mappedBy = "escola")
    private List<Professor> listaDeProfessores;

    @OneToMany
    @JoinColumn(name = "escola_id")
    private List<Curso> listaCursos;

}
