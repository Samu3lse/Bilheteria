package com.project.cine.cinebilheteria.service;

import com.project.cine.cinebilheteria.model.entity.Filme;
import com.project.cine.cinebilheteria.repository.FilmeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class FilmeService {

    private final FilmeRepository filmeRepository;

    public List<Filme> getAll() {
        List<Filme> filmes = filmeRepository.findAll();
        return filmes;
    }

    public Filme getById(Long id) {
        Filme filme = filmeRepository.getById(id);

        if(filme != null){
            return filme;
        }else{
            return null;
        }
    }

    public Filme save(Filme filme) {

        Filme filmeSaved = filmeRepository.save(filme);
        return filmeSaved;
    }

    public Filme update(Long id, Filme filme) {
//
        Filme filmeFromDataBase = this.filmeRepository.getById(id);
        if(filmeFromDataBase != null){
            filme.setId(id);

            filmeRepository.save(filme);
        }
        return  filme;
    }

    public void delete(Long id) {
        Filme filme = this.getById(id);

        if(filme != null)
        { filmeRepository.deleteById(id);
        }else{
            System.out.println();;
        }
    }

}