package com.atividade.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class Professor {

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private String telefone;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Escola escola;

    @ManyToMany
    @JoinTable(name = "professor_disciplina", joinColumns = @JoinColumn(name = "professor_id"),
            inverseJoinColumns = @JoinColumn(name = "disciplina_id"))
    private List<Disciplina> listaDeDisciplinas;

    @OneToOne
    @JoinColumn(nullable = false)
    private Endereco endereco;

}
