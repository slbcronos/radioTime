package com.slcomputacion.radiotime.modelo;

public class Favoritos {
    public void adicione(Audio audio){
        if (audio.getClasificacion()>=8){
            System.out.println("Casificacion: " + audio.getTitulo()+"-> Favoritos de todos los tiempos¡¡¡¡¡");
        }else {
            System.out.println("Casificacion: " + audio.getTitulo()+"-> nuevos favoritos");

        }

    }
}
