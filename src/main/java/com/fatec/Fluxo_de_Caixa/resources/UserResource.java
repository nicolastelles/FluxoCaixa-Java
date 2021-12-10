package com.fatec.Fluxo_de_Caixa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.Fluxo_de_Caixa.entities.User;
import com.fatec.Fluxo_de_Caixa.repositories.UserRepository;


@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	
	@Autowired
	private UserRepository categoryRepository;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = categoryRepository.findAll();
		//ok intancia resposta 200 http
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User cat = categoryRepository.findById(id).get();
		return ResponseEntity.ok().body(cat);
	}
}