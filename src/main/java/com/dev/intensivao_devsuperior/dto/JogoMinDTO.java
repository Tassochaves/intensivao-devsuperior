package com.dev.intensivao_devsuperior.dto;

import com.dev.intensivao_devsuperior.entities.Jogo;
import com.dev.intensivao_devsuperior.projections.JogoMinProjection;

public class JogoMinDTO {

    private Long id;
    private String titulo;
    private Integer ano;
    private String imgUrl;
    private String descricaoCurta;

    public JogoMinDTO(){}

    public JogoMinDTO(Jogo jogo) {
        this.id = jogo.getId();
        this.titulo = jogo.getTitulo();
        this.ano = jogo.getAno();
        this.imgUrl = jogo.getImgUrl();
        this.descricaoCurta = jogo.getDescricaoCurta();
    }

    public JogoMinDTO(JogoMinProjection projection) {
        this.id = projection.getId();
        this.titulo = projection.getTitulo();
        this.ano = projection.getAno();
        this.imgUrl = projection.getImgUrl();
        this.descricaoCurta = projection.getDescricaoCurta();
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getDescricaoCurta() {
        return descricaoCurta;
    }

    
    
}
