package com.dev.intensivao_devsuperior.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.intensivao_devsuperior.dto.JogoListaDTO;
import com.dev.intensivao_devsuperior.services.JogoListaService;

@RestController
@RequestMapping(value = "/listas")
public class JogoListaController {

    @Autowired
    private JogoListaService jogoListaService;

    @GetMapping
    public List<JogoListaDTO> listaJogos(){
        return jogoListaService.buscaTodasListasJogos();
    }
}
