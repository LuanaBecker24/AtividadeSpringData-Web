package com.atividade.controller;

import com.atividade.entity.Disciplina;
import com.atividade.model.DisciplinaDTO;
import com.atividade.service.implement.DisciplinaServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/disciplina")
public class DisciplinaController {

    private final DisciplinaServiceImpl disciplinaService;

    @PostMapping
    public ResponseEntity<Disciplina> cadastrarDisciplina(@RequestBody DisciplinaDTO disciplinaDTO){
        return new ResponseEntity<>(disciplinaService.cadastrarDisciplina(disciplinaDTO), HttpStatus.OK);
    }

    @GetMapping
    List<Disciplina> buscarTodos(){
        return disciplinaService.buscarTodas();
    }

}
