package com.fatec.Fluxo_de_Caixa.repositories;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.fatec.Fluxo_de_Caixa.entities.category;

@Component
public class CategoryRepository {

	private Map<Long,category> map = new HashMap<>();
	
	
	public void save(category obj) {
		map.put(obj.getId(),obj);
	}

	public category findById(Long id) {
		return map.get(id);
	}
	
	public List<category> findAll() {
		return new ArrayList<category>(map.values());
	}
}

