package com.project.cine.cinebilheteria.service;

import com.project.cine.cinebilheteria.model.entity.Filme;
import com.project.cine.cinebilheteria.repository.FilmeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor


public class FilmeService {

   private final FilmeRepository filmeRepository ;
   public List<Filme> getAll(){
   List<Filme> filmes = new ArrayList<>();
   Filme filme1 = new Filme("Casa Monstro",1l);
   Filme filme2 = new Filme("The Chosen",2l);
   filmes.add(filme1);
   filmes.add(filme2);

   return filmes;

   }

   public Filme getById(Long id){
      Filme filme = new Filme("Casa Monstro",1l);
      Filme filmeGetById = filmeRepository.getById(id);
      return filmeGetById;
   }

   public Filme save(Filme filme){
      Filme filmeSavad = filmeRepository.save(filme);
      return filmeSavad;
   }

   public Filme update(Long id , Filme filme){
      return filme;
   }

   public void delete(Long id){

   }

}
