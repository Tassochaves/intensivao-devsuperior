package com.dev.intensivao_devsuperior.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dev.intensivao_devsuperior.entities.Jogo;
import com.dev.intensivao_devsuperior.projections.JogoMinProjection;

public interface JogoRepository extends JpaRepository<Jogo, Long>{

    @Query(nativeQuery = true, value = """
		SELECT tb_jogo.id, tb_jogo.titulo, tb_jogo.ano, tb_jogo.img_url AS imgUrl,
		tb_jogo.descricao_curta AS descricaoCurta, tb_pertence.posicao
		FROM tb_jogo
		INNER JOIN tb_pertence ON tb_jogo.id = tb_pertence.jogo_id
		WHERE tb_pertence.jogo_lista_id = :listaId
		ORDER BY tb_pertence.posicao
			""")
    List<JogoMinProjection> buscarPorLista(Long listaId);
}
