package com.atividade.service.implement;

import com.atividade.entity.Curso;
import com.atividade.entity.Disciplina;
import com.atividade.entity.Endereco;
import com.atividade.model.CursoDTO;
import com.atividade.model.EnderecoDTO;
import com.atividade.repository.CursoRepository;
import com.atividade.service.interfaces.CursoServiceInt;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Curso buscarUm(Long id) throws Exception {
        Optional<Curso> optional = cursoRepository.findById(id);
        if(optional.isPresent()){
            return optional.get();
        } else {
            throw new RuntimeException("Curso não encontrado!");
        }
    }

    @Override
    public Curso atualizarCurso(CursoDTO cursoDTO, Long id) {
        try{
            Curso curso = buscarUm(id);
            BeanUtils.copyProperties(curso, cursoDTO);
            return cursoRepository.save(curso);

        } catch (Exception e){
            System.out.println(e.getMessage());
            return  null;
        }
    }

}
