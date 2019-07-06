package com.ifpi.ted2019.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ifpi.ted2019.domain.Prato;
import com.ifpi.ted2019.services.PratoService;

@RestController
@RequestMapping(value = "/pratos")
public class PratoResource {
	
	private PratoService service;
	@RequestMapping(value ="/{id}" ,method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Prato object = service.buscar(id);
		return ResponseEntity.ok().body(object);
			
	}
}