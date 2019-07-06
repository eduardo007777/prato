package com.ifpi.ted2019.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifpi.ted2019.domain.Prato;

@Repository

public interface PratoRepository extends JpaRepository<Prato, Integer>{

}
