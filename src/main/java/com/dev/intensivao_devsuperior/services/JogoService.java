package com.dev.intensivao_devsuperior.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.intensivao_devsuperior.dto.JogoMinDTO;
import com.dev.intensivao_devsuperior.entities.Jogo;
import com.dev.intensivao_devsuperior.repositories.JogoRepository;

@Service
public class JogoService {

    @Autowired
    private JogoRepository jogoRepository;

    public List<JogoMinDTO> buscarTodosJogos(){

        List<Jogo> listaJogos = jogoRepository.findAll();
        return listaJogos.stream().map(resultado -> new JogoMinDTO(resultado)).toList();
    }
}
