package com.fatec.Fluxo_de_Caixa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.Fluxo_de_Caixa.entities.Product;
import com.fatec.Fluxo_de_Caixa.repositories.ProductRepository;


@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	
	@Autowired
	private ProductRepository categoryRepository;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = categoryRepository.findAll();
		//ok intancia resposta 200 http
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product cat = categoryRepository.findById(id);
		return ResponseEntity.ok().body(cat);
	}
}