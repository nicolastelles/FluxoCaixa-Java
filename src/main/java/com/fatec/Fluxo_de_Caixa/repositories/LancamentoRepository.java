package com.fatec.Fluxo_de_Caixa.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatec.Fluxo_de_Caixa.entities.Lancamento;

@Repository
public interface LancamentoRepository extends JpaRepository <Lancamento,Long>{


}

