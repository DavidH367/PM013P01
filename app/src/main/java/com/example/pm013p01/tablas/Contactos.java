package com.example.pm013p01.tablas;

public class Contactos {

    public Integer id;
    public String pais;
    public String nombres;
    public Integer telefono;
    public String nota;

    public Contactos(){

//todos

    }

    public Contactos(Integer id, String nombres, String pais, Integer telefono, String nota) {
        this.id = id;
        this.pais = pais;
        this.nombres = nombres;
        this.telefono = telefono;
        this.nota = nota;
    }

    //constructor de clase

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
}
