package com.dev.intensivao_devsuperior.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pertence")
public class Pertence {

    @EmbeddedId
    private PertencePK id = new PertencePK();

    private Integer posicao;

    public Pertence(){}

    public Pertence(Jogo jogo, JogoLista jogoLista, Integer posicao) {
        this.id.setJogo(jogo);
        this.id.setJogoLista(jogoLista);
        this.posicao = posicao;
    }

    public PertencePK getId() {
        return id;
    }

    public void setId(PertencePK id) {
        this.id = id;
    }

    public Integer getPosicao() {
        return posicao;
    }

    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pertence other = (Pertence) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
    
}
