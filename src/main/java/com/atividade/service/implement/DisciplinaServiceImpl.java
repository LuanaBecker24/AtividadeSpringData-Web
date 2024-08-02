package com.atividade.service.implement;

import com.atividade.entity.Disciplina;
import com.atividade.model.DisciplinaDTO;
import com.atividade.repository.DisciplinaRepository;
import com.atividade.service.interfaces.DisciplinaServiceInt;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DisciplinaServiceImpl implements DisciplinaServiceInt {

    private final DisciplinaRepository disciplinaRepository;

    @Override
    public Disciplina cadastrarDisciplina(DisciplinaDTO disciplinaDTO) {
        Disciplina disciplina = new Disciplina(disciplinaDTO.nome());
        return disciplinaRepository.save(disciplina);
    }

    @Override
    public List<Disciplina> buscarTodas() {
        return disciplinaRepository.findAll();
    }
}
