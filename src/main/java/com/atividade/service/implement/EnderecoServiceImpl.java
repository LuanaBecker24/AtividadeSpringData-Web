package com.atividade.service.implement;

import com.atividade.entity.Endereco;
import com.atividade.model.EnderecoDTO;
import com.atividade.repository.EnderecoRepository;
import com.atividade.service.interfaces.EnderecoServiceInt;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EnderecoServiceImpl implements EnderecoServiceInt {

    private final EnderecoRepository enderecoRepository;

    @Override
    public Endereco salvarEndereco(EnderecoDTO enderecoDTO) {
        Endereco endereco = new Endereco(enderecoDTO.cep(), enderecoDTO.rua(), enderecoDTO.numero(), enderecoDTO.cidade(), enderecoDTO.estado(), enderecoDTO.bairro());
        return enderecoRepository.save(endereco);
    }

    @Override
    public List<Endereco> buscarTodosEnderecos() {
        return enderecoRepository.findAll();
    }

    @Override
    public void validarEndereco(Long id) {
        if (!enderecoRepository.existsById(id)){
            throw new RuntimeException("Endereço não encontrado!");
        }
    }

    public Endereco atualizarEndereco(EnderecoDTO enderecoDTO, Long id){
        try {
            Endereco endereco = buscarUm(id);
            BeanUtils.copyProperties(enderecoDTO, endereco);
            return enderecoRepository.save(endereco);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Endereco buscarUm(Long id) throws Exception {
        Optional<Endereco> optional = enderecoRepository.findById(id);
        if (optional.isPresent()){
            return optional.get();
        } else {
            throw new RuntimeException("Usuário não encontrado!");
        }
    }

    @Override
    public void deletarEndereco(Long id) {
        if (!enderecoRepository.existsById(id)){
            throw new RuntimeException("Endereço não encontrado!");
        }
        enderecoRepository.deleteById(id);
    }

}
