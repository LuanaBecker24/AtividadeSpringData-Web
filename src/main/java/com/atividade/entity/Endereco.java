package com.atividade.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Endereco {

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rua;

    private Integer numero;

    private String cidade;

    private String estado;

    private String bairro;

    private Long cep;

    public Endereco(Long cep, String rua, Integer numero, String cidade, String estado, String bairro) {
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.bairro = bairro;
    }
}
