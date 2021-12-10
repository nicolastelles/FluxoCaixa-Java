package com.fatec.Fluxo_de_Caixa;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fatec.Fluxo_de_Caixa.entities.Product;
import com.fatec.Fluxo_de_Caixa.entities.category;
import com.fatec.Fluxo_de_Caixa.repositories.CategoryRepository;
import com.fatec.Fluxo_de_Caixa.repositories.ProductRepository;

@SpringBootApplication
public class FluxoDeCaixaApplication implements CommandLineRunner{
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(FluxoDeCaixaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		category cat1 = new category(1L, "Cartão");
		category cat2 = new category(2L, "Dinheiro");
		
		Product p1 = new Product(1L, "Entrada", 2200.00, cat1);
		Product p2 = new Product(2L, "Saída", 120.00, cat2);
		Product p3 = new Product(3L, "Entrada", 2800.00, cat1);
		Product p4 = new Product(4L, "Saída", 100.00, cat2);
		
		cat1.getProducts().addAll(Arrays.asList(p1, p3));
		cat2.getProducts().addAll(Arrays.asList(p2, p4));
		
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
		productRepository.save(p1);
		productRepository.save(p2);
		productRepository.save(p3);
		productRepository.save(p4);
		
	}

}
