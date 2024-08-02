package com.atividade.service.interfaces;

import com.atividade.entity.Aluno;
import com.atividade.entity.Endereco;
import com.atividade.model.AlunoDTO;
import com.atividade.model.EnderecoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AlunoServiceInt {

    Aluno cadastrarAluno(AlunoDTO alunoDTO);

    Aluno buscarAluno(Long id);

    List<Aluno> buscarTodosAlunos();

    Aluno atualizarAluno(AlunoDTO alunoDTO, Long id);

    void deletarAluno(Long id);
}
