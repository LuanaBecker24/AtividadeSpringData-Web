package com.atividade.model;

public record EnderecoDTO(String rua,
                          Integer numero,
                          String cidade,
                          String estado,
                          String bairro,
                          Long cep) {
}
