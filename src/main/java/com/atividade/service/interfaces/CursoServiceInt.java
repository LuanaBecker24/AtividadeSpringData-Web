package com.atividade.service.interfaces;

import com.atividade.entity.Curso;
import com.atividade.model.CursoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CursoServiceInt {

    Curso cadastrarCurso(CursoDTO cursoDTO);

    List<Curso> buscarTodos();

    Curso buscarUm(Long id) throws Exception;

    Curso atualizarCurso(CursoDTO cursoDTO, Long id);

}
