package com.atividade.service.interfaces;

import com.atividade.entity.Curso;
import com.atividade.entity.Disciplina;
import com.atividade.model.CursoDTO;
import com.atividade.model.DisciplinaDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CursoServiceInt {

    Curso cadastrarCurso(CursoDTO cursoDTO);

    List<Curso> buscarTodos();

}
