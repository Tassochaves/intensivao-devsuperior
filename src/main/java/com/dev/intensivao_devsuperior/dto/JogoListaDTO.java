package com.dev.intensivao_devsuperior.dto;

import com.dev.intensivao_devsuperior.entities.JogoLista;

public class JogoListaDTO {

    private Long id;
    private String nome;

    public JogoListaDTO(){}

    public JogoListaDTO(JogoLista jogoLista){
        this.id = jogoLista.getId();
        this.nome = jogoLista.getNome();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    
}
