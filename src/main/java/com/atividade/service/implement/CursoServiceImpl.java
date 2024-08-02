package com.atividade.service.implement;

import com.atividade.entity.Curso;
import com.atividade.entity.Disciplina;
import com.atividade.model.CursoDTO;
import com.atividade.repository.CursoRepository;
import com.atividade.service.interfaces.CursoServiceInt;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CursoServiceImpl implements CursoServiceInt {

    private final CursoRepository cursoRepository;

    @Override
    public Curso cadastrarCurso(CursoDTO cursoDTO) {
        Curso curso = new Curso(cursoDTO.nome());
        return cursoRepository.save(curso);
    }

    @Override
    public List<Curso> buscarTodos() {
        return cursoRepository.findAll();
    }
}
