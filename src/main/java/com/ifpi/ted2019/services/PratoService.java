package com.ifpi.ted2019.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifpi.ted2019.domain.Prato;
import com.ifpi.ted2019.repositories.PratoRepository;

@Service
public class PratoService {
	@Autowired
	private PratoRepository pratoRepository;
	public Prato buscar(Integer id) {
		Optional<Prato> object = pratoRepository.findById(id);
		return object.orElse(null);
	}
	
}
