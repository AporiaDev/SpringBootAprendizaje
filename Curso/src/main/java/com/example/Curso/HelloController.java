package com.example.Curso;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping(value = "/saludo" , produces = MediaType.APPLICATION_JSON_VALUE)
    public String Hello(){
        return "Hola mundo";
    }

}
