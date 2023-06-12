package com.project.cine.cinebilheteria.service;

import com.project.cine.cinebilheteria.model.entity.Genero;
import com.project.cine.cinebilheteria.repository.GeneroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class GeneroService {
    private final GeneroRepository generoRepository;

    public List<Genero> getAll(){
        return null;
    }
    public Genero getById(Long id){
        return null;
    }
    public Genero save(Genero genero){
        return null;
    }
    public Genero update(Long id, Genero genero ){
        return null;
    }
    public void delete(Long id){

    }
}