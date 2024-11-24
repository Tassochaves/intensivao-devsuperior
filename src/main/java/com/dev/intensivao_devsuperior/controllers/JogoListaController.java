package com.dev.intensivao_devsuperior.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.intensivao_devsuperior.dto.JogoListaDTO;
import com.dev.intensivao_devsuperior.dto.JogoMinDTO;
import com.dev.intensivao_devsuperior.services.JogoListaService;
import com.dev.intensivao_devsuperior.services.JogoService;

@RestController
@RequestMapping(value = "/listas")
public class JogoListaController {

    @Autowired
    private JogoListaService jogoListaService;

    @Autowired
    private JogoService jogoService;

    @GetMapping
    public List<JogoListaDTO> listaJogos(){
        return jogoListaService.buscaTodasListasJogos();
    }

    @GetMapping("/{listaId}/jogos")
    public List<JogoMinDTO> retornaPorLista(@PathVariable Long listaId){
        return jogoService.buscarPorLista(listaId);
    }
}
