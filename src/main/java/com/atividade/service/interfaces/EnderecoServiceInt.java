package com.atividade.service.interfaces;

import com.atividade.entity.Endereco;
import com.atividade.model.EnderecoDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EnderecoServiceInt {

    Endereco salvarEndereco(EnderecoDTO enderecoDTO);

    List<Endereco> buscarTodosEnderecos();

    void validarEndereco(Long id);

    Endereco atualizarEndereco(EnderecoDTO enderecoDTO, Long id);

    Endereco buscarUm (Long id) throws Exception;

    void deletarEndereco(Long id);
}
