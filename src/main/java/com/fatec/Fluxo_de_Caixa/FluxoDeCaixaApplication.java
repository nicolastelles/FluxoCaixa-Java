package com.fatec.Fluxo_de_Caixa;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fatec.Fluxo_de_Caixa.entities.Product;
import com.fatec.Fluxo_de_Caixa.entities.User;
import com.fatec.Fluxo_de_Caixa.entities.category;
import com.fatec.Fluxo_de_Caixa.repositories.CategoryRepository;
import com.fatec.Fluxo_de_Caixa.repositories.ProductRepository;
import com.fatec.Fluxo_de_Caixa.repositories.UserRepository;

@SpringBootApplication
public class FluxoDeCaixaApplication implements CommandLineRunner{
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(FluxoDeCaixaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		User user1 = new User(null,"Nicolas","nico-telles@hotmail.com","1234","981819292","Rua dos Aprovados - n°10");
		User user2 = new User(null,"Gerson","gerson@fatec.com","1234","977777777","Avenida dos Aprovados - n°100");
		
		category cat1 = new category(null, "Cartão");
		category cat2 = new category(null, "Dinheiro");
		
		
		
		Product p1 = new Product(null, "Entrada", 2200.00, cat1);
		Product p2 = new Product(null, "Saída", 120.00, cat2);
		Product p3 = new Product(null, "Entrada", 2800.00, cat1);
		Product p4 = new Product(null, "Saída", 100.00, cat2);
		
		cat1.getProducts().addAll(Arrays.asList(p1, p3));
		cat2.getProducts().addAll(Arrays.asList(p2, p4));
		
		userRepository.save(user1);
		userRepository.save(user2);
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
		productRepository.save(p1);
		productRepository.save(p2);
		productRepository.save(p3);
		productRepository.save(p4);
		
	}

}
