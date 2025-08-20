package com.example.Curso;

public class Curso {

    //Features

    private String name;
    private String horario;
    private int id;

    public Curso(){

    }
    // Constructor
    public Curso(String name,  String horario, int id){
        
        this.name = name;
        this.horario = horario;
        this.id = id;

    }

    //Setters and Getters

    public void setName(String name){
       this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setHorario(String horario){
        this.horario = horario;
    }
    public String getHorario(){
        return horario;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    
}
