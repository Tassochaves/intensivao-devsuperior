package com.dev.intensivao_devsuperior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.dev.intensivao_devsuperior.entities.JogoLista;

public interface JogoListaRepository extends JpaRepository<JogoLista, Long>{

    @Modifying
    @Query(nativeQuery = true, value = "UPDATE tb_pertence SET posicao = :novaPosicao WHERE jogo_lista_id = :listaId AND jogo_id = :jogoId")
    void atualizaPosicao(Long listaId, Long jogoId, Integer novaPosicao);
}
