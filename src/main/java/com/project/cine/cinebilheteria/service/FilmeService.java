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
        return filme;
    }

    public Filme save(Filme filme) {

        Filme filmeSaved = filmeRepository.save(filme);
        return filmeSaved;
    }

    public Filme update(Long id, Filme filme) {
//        Método update:

//        verificação: Verificar se o filme passado pelo usuário já existe no banco.
//                Se sim ( comando alterar )
//        Se não ( Adicionar filme)

        return  filme;
    }

    public void delete(Long id) {
        filmeRepository.deleteById(id);
    }

}