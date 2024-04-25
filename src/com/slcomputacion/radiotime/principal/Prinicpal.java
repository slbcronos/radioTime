package com.slcomputacion.radiotime.principal;

import com.slcomputacion.radiotime.modelo.Cancion;
import com.slcomputacion.radiotime.modelo.Favoritos;
import com.slcomputacion.radiotime.modelo.Podcast;

public class Prinicpal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Enter Sadman");
        miCancion.setCantante("Metallica");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Salvador");
        miPodcast.setTitulo("Las mejores rolas de los 90's");

        //para mi cancion
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 200; i++) {
            miCancion.reproduce();
        }
        //para podcast
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("*****************************************************************");
        System.out.println("Total de Reproducciones: \t"+miCancion.getTotalReproducciones());
        System.out.println("Total de me Gusta: \t\t\t"+miCancion.getTotalDeMeGusta()+"\n");

        Favoritos favoritos = new Favoritos();
        favoritos.adicione(miCancion);
        favoritos.adicione(miPodcast);

    }
}
