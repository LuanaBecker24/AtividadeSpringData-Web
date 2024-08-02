package com.atividade.controller;

import com.atividade.entity.Endereco;
import com.atividade.model.EnderecoDTO;
import com.atividade.service.implement.EnderecoServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/endereco")
public class EnderecoController {

    private EnderecoServiceImpl enderecoService;

    @PostMapping
    public ResponseEntity<Endereco> cadastrarEnderecos(@RequestBody EnderecoDTO enderecoDTO){
        return new ResponseEntity<>(enderecoService.salvarEndereco(enderecoDTO), HttpStatus.OK);
    }

    @GetMapping
    List<Endereco> pegarTodosEnderecos(){
        return enderecoService.buscarTodosEnderecos();
    }

    @PutMapping("/{id}")
    public Endereco atualizarEndereco(@RequestBody EnderecoDTO enderecoDTO, @PathVariable Long id){
        return enderecoService.atualizarEndereco(enderecoDTO, id);
    }

    @GetMapping("/{id}")
    public Endereco buscarEndereco(@PathVariable Long id) throws Exception {
        return enderecoService.buscarUm(id);
    }

    @DeleteMapping("/{id}")
    public void deletarEndereco(@PathVariable Long id){
        enderecoService.deletarEndereco(id);
    }

}
