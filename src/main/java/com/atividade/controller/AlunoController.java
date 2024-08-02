package com.atividade.controller;

import com.atividade.entity.Aluno;
import com.atividade.model.AlunoDTO;
import com.atividade.service.implement.AlunoServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/aluno")
public class AlunoController {

    private AlunoServiceImpl alunoService;

    @PostMapping
    public ResponseEntity<Aluno> cadastrarAluno(@RequestBody AlunoDTO alunoDTO){
        return new ResponseEntity<>(alunoService.cadastrarAluno(alunoDTO), HttpStatus.OK);
    }

    @GetMapping
    List<Aluno> buscarAlunos(){
        return alunoService.buscarTodosAlunos();
    }

    @PutMapping("/{id}")
    public Aluno atualizarAluno(@RequestBody AlunoDTO alunoDTO, @PathVariable Long id){
        return alunoService.atualizarAluno(alunoDTO, id);
    }

    @GetMapping("/{id}")
    public Aluno buscarAluno(@PathVariable Long id){
        return alunoService.buscarAluno(id);
    }

    @DeleteMapping("/{id}")
    public void deletarAluno(@PathVariable Long id){
        alunoService.deletarAluno(id);
    }


}
