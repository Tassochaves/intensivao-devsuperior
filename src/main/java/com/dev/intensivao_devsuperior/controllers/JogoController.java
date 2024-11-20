package com.dev.intensivao_devsuperior.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.intensivao_devsuperior.dto.JogoMinDTO;
import com.dev.intensivao_devsuperior.services.JogoService;

@RestController
@RequestMapping(value = "/jogos")
public class JogoController {

    @Autowired
    private JogoService jogoService;

    @GetMapping
    public List<JogoMinDTO> listaOsJogos(){
        return jogoService.buscarTodosJogos();
    }
}
