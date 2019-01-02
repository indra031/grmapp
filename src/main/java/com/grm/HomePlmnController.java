package com.grm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grm.model.HomePlmn;
import com.grm.repository.HomePlmnRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HomePlmnController {
	@Autowired
	HomePlmnRepository repository;

	@GetMapping(path = "/homeplmn")
	public Iterable<HomePlmn> getAll() {
		return repository.findAll();
	}
}
