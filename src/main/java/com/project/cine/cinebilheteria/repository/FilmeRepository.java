package com.project.cine.cinebilheteria.repository;

import com.project.cine.cinebilheteria.model.entity.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FilmeRepository extends JpaRepository<Filme,Long> {

}
