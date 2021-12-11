package com.fatec.Fluxo_de_Caixa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.Fluxo_de_Caixa.entities.Lancamento;
import com.fatec.Fluxo_de_Caixa.repositories.LancamentoRepository;


@RestController
@RequestMapping(value = "/lancamentos")
public class UserResource {
	
	
	@Autowired
	private LancamentoRepository categoryRepository;
	

	
	@GetMapping
	public ResponseEntity<List<Lancamento>> findAll() {
		List<Lancamento> list = categoryRepository.findAll();
		//ok intancia resposta 200 http
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Lancamento> findById(@PathVariable Long id) {
		Lancamento cat = categoryRepository.findById(id).get();
		return ResponseEntity.ok().body(cat);
	}
}