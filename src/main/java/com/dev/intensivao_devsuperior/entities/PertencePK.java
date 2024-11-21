package com.dev.intensivao_devsuperior.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class PertencePK {
    //Implementação da chave primaria composta da entidade Pertence.

    @ManyToOne
    @JoinColumn(name = "jogo_id")
    private Jogo jogo;

    @ManyToOne
    @JoinColumn(name = "jogo_lista_id")
    private JogoLista jogoLista;

    public PertencePK(){}

    public PertencePK(Jogo jogo, JogoLista jogoLista) {
        this.jogo = jogo;
        this.jogoLista = jogoLista;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public JogoLista getJogoLista() {
        return jogoLista;
    }

    public void setJogoLista(JogoLista jogoLista) {
        this.jogoLista = jogoLista;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((jogo == null) ? 0 : jogo.hashCode());
        result = prime * result + ((jogoLista == null) ? 0 : jogoLista.hashCode());
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
        PertencePK other = (PertencePK) obj;
        if (jogo == null) {
            if (other.jogo != null)
                return false;
        } else if (!jogo.equals(other.jogo))
            return false;
        if (jogoLista == null) {
            if (other.jogoLista != null)
                return false;
        } else if (!jogoLista.equals(other.jogoLista))
            return false;
        return true;
    }

    
}
