package com.dev.intensivao_devsuperior.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.intensivao_devsuperior.dto.JogoListaDTO;
import com.dev.intensivao_devsuperior.entities.JogoLista;
import com.dev.intensivao_devsuperior.projections.JogoMinProjection;
import com.dev.intensivao_devsuperior.repositories.JogoListaRepository;
import com.dev.intensivao_devsuperior.repositories.JogoRepository;

@Service
public class JogoListaService {

    @Autowired
    private JogoListaRepository jogoListaRepository;

    @Autowired
    private JogoRepository jogoRepository;

    @Transactional(readOnly = true)
    public List<JogoListaDTO> buscaTodasListasJogos(){

        List<JogoLista> listaJogos = jogoListaRepository.findAll();
        return listaJogos.stream().map(resultado -> new JogoListaDTO(resultado)).toList();
    }

    @Transactional
    public void mover(Long listaId, int indexOrigem, int indexDestino){
        List<JogoMinProjection> lista = jogoRepository.buscarPorLista(listaId);

        JogoMinProjection objeto = lista.remove(indexOrigem);
        lista.add(indexDestino, objeto);

        int indexMinimo = indexOrigem < indexDestino ? indexOrigem : indexDestino;
        int indexMaximo = indexOrigem < indexDestino ? indexDestino : indexOrigem;

        for(int i = indexMinimo; i <= indexMaximo; i++){
            jogoListaRepository.atualizaPosicao(listaId, lista.get(i).getId(), i);
        }
    }
}
