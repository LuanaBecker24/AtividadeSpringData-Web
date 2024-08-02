package com.atividade.service.interfaces;

import com.atividade.entity.Disciplina;
import com.atividade.model.DisciplinaDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DisciplinaServiceInt {

    Disciplina cadastrarDisciplina(DisciplinaDTO disciplinaDTO);

    List<Disciplina> buscarTodas();

}
