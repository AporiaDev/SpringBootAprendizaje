package com;

public class Curso {

    //Features

    private String name;
    private String horario;
    private int id;

    // Constructor
    public Curso(String name,  String horario, int id){
        
        name = this.name;
        horario = this.horario;
        id = this.id;

    }

    //Setters and Getters

    public void setName(String name){
        name = this.name;
    }
    public String getName(){
        return name;
    }

    public void setHorario(String horario){
        horario = this.horario;
    }
    public String getHorario(){
        return horario;
    }

    public void setId(int id){
        id = this.id;
    }
    public int getId(){
        return id;
    }
    
}
