package com.atividade.service.implement;

import com.atividade.entity.Aluno;
import com.atividade.entity.Endereco;
import com.atividade.model.AlunoDTO;
import com.atividade.repository.AlunoRepository;
import com.atividade.service.interfaces.AlunoServiceInt;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoServiceImpl implements AlunoServiceInt {

    private final AlunoRepository alunoRepository;

    @Override
    public Aluno cadastrarAluno(AlunoDTO alunoDTO) {
        Aluno aluno = new Aluno(alunoDTO.email(), alunoDTO.nome(), alunoDTO.telefone(), alunoDTO.endereco());
        return alunoRepository.save(aluno);
    }

    @Override
    public Aluno buscarAluno(Long id) {
        return alunoRepository.findById(id).get();
    }

    @Override
    public List<Aluno> buscarTodosAlunos() {
        return alunoRepository.findAll();
    }

    @Override
    public Aluno atualizarAluno(AlunoDTO alunoDTO, Long id) {
        try {
            Aluno aluno = buscarAluno(id);
            BeanUtils.copyProperties(alunoDTO, aluno);
            return alunoRepository.save(aluno);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void deletarAluno(Long id) {
        if (!alunoRepository.existsById(id)){
            throw new RuntimeException("Aluno não encontrado!");
        }
        alunoRepository.deleteById(id);
    }

}
