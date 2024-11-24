package com.dev.intensivao_devsuperior.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.intensivao_devsuperior.dto.JogoListaDTO;
import com.dev.intensivao_devsuperior.entities.JogoLista;
import com.dev.intensivao_devsuperior.repositories.JogoListaRepository;

@Service
public class JogoListaService {

    @Autowired
    private JogoListaRepository jogoListaRepository;

    @Transactional(readOnly = true)
    public List<JogoListaDTO> buscaTodasListasJogos(){

        List<JogoLista> listaJogos = jogoListaRepository.findAll();
        return listaJogos.stream().map(resultado -> new JogoListaDTO(resultado)).toList();
    }
}
