package com.fatec.Fluxo_de_Caixa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fatec.Fluxo_de_Caixa.entities.category;
import com.fatec.Fluxo_de_Caixa.repositories.CategoryRepository;

@SpringBootApplication
public class FluxoDeCaixaApplication implements CommandLineRunner{
	@Autowired
	private CategoryRepository categoryRepository;
	public static void main(String[] args) {
		SpringApplication.run(FluxoDeCaixaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		category cat1 = new category(1L, "Cartão");
		category cat2 = new category(2L, "Dinheiro");
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
		
	}

}
