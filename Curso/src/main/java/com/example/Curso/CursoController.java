package com.example.Curso;



import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@RestController

public class CursoController {
    
    
    private List<Curso> cursos = new ArrayList<>();

    @PostConstruct
    public void init(){
        cursos.add(new Curso("Java", "Tarde", 14));
        cursos.add(new Curso("Python", "Mañana", 15));
        cursos.add(new Curso("C++", "Noche", 16));
        cursos.add(new Curso("JavaScript", "Tarde", 17));
        cursos.add(new Curso("Kotlin", "Mañana", 18));
        cursos.add(new Curso("Swift", "Noche", 19));
        cursos.add(new Curso("Go", "Tarde", 20));
        cursos.add(new Curso("Ruby", "Mañana", 21));
        cursos.add(new Curso("PHP", "Noche", 22));
        cursos.add(new Curso("C#", "Tarde", 23));
        cursos.add(new Curso("TypeScript", "Mañana", 24));
        cursos.add(new Curso("Rust", "Noche", 25));
        cursos.add(new Curso("Scala", "Tarde", 26));
        cursos.add(new Curso("R", "Mañana", 27));
        cursos.add(new Curso("SQL", "Noche", 28));
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

    @GetMapping(value = "/cursos/{name}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> buscaCursos(@PathVariable("name")  String nombre ){

        List<Curso> aux = new ArrayList<>();

        for(Curso c : cursos){
            if(c.getName().contains(nombre)){
                aux.add(c);
            }
        }
        return aux;

    }

    @PostMapping(path = "/curso", consumes = MediaType.APPLICATION_JSON_VALUE ,  produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Curso> crearCurso(@RequestBody Curso curso){
        cursos.add(curso);
        return ResponseEntity.status(HttpStatus.CREATED).body(curso);////////////Entendedr mas el funcionamiento de https
    }

    
    @PutMapping(path = "/curso", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> actCursos(@RequestBody Curso curso){
        for(int i = 0; i < cursos.size(); i++){
            if(cursos.get(i).getName().equals(curso.getName()){
                cursos.set(i, curso);
            }
        }return cursos;
    }
    @DeleteMapping(path = "/curso/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void borrarCurso(@PathVariable ("name") String nombre){
        cursos.removeIf(c->c.getName().equals(nombre));
    }
    



}
