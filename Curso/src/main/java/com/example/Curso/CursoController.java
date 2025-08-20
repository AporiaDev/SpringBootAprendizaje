package com.example.Curso;



import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@RestController

public class CursoController {
    
    
    private List<Curso> cursos = new ArrayList<>();

    @PostConstruct
    public void init(){
        cursos.add(new Curso("Java", "Tarde",  14));
    }
    
    @GetMapping(value = "/curso" ,  produces = MediaType.APPLICATION_JSON_VALUE)
    public Curso getCurso(){
        return new Curso("Python", "manana", 14);
    }

    //Metodo lista de cursos
    @GetMapping(value = "/cursos" , produces =  MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> getCursos(){
        return cursos;
    }



}
