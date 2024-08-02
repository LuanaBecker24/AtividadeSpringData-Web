package com.atividade.controller;

import com.atividade.entity.Curso;
import com.atividade.model.CursoDTO;
import com.atividade.service.implement.CursoServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/curso")
public class CursoController {

    private final CursoServiceImpl cursoService;

    @PostMapping
    public ResponseEntity<Curso> cadastrarCurso(@RequestBody CursoDTO cursoDTO){
        return new ResponseEntity<>(cursoService.cadastrarCurso(cursoDTO), HttpStatus.OK);
    }

    @GetMapping
    List<Curso> buscarTodos(){
        return cursoService.buscarTodos();
    }

}
