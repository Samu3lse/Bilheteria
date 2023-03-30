package com.project.cine.cinebilheteria.controller;

import com.project.cine.cinebilheteria.service.FilmeService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/filmes")
@RestController
@RequiredArgsConstructor

public class FilmeController {

    FilmeService filmeService;

    @GetMapping
    public void getAll(){
    filmeService.getAll();
    }

    @GetMapping("/{id}")
    public void getById(@PathVariable Long id){
    filmeService.getById(id);
    }

    @PostMapping
    public void save(){
    filmeService.save();
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id){
    filmeService.update(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
    filmeService.delete(id);

    }
}
