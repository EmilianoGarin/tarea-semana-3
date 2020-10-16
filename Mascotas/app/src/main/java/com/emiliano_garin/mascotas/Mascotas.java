package com.emiliano_garin.mascotas;

public class Mascotas {
    private String nombre;
    private int foto;
    private int cont;

    public Mascotas (String nombre, int foto, int cont){
        this.nombre=nombre;
        this.foto=foto;
        this.cont=cont;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
}
