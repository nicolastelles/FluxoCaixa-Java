package com.fatec.Fluxo_de_Caixa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.Fluxo_de_Caixa.entities.category;
import com.fatec.Fluxo_de_Caixa.repositories.CategoryRepository;


@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@GetMapping
	public ResponseEntity<List<category>> findAll() {
		List<category> list = categoryRepository.findAll();
		//ok intancia resposta 200 http
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<category> findById(@PathVariable Long id) {
		category cat = categoryRepository.findById(id);
		return ResponseEntity.ok().body(cat);
	}
}