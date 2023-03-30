package com.project.cine.cinebilheteria.controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/filmes")
@RestController


public class FilmeController {

    @GetMapping
    public void getAll(){

    }
    @GetMapping("/{id}")
    public void getById(@PathVariable Long id){

    }
    @PostMapping
    public void save(){

    }
    @PutMapping("/{id}")
    public void update(){

    }
    @DeleteMapping("/{id}")
    public void delete(){


    }
}
