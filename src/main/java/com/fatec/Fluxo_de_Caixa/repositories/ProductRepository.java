package com.fatec.Fluxo_de_Caixa.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatec.Fluxo_de_Caixa.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository <Product,Long>{


}

