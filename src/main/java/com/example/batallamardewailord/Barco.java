package com.example.batallamardewailord;

import javafx.scene.image.ImageView;

public class Barco {
    String nombre;

    ImageView imagen;

    int velocidad;

    int potenciaFuego;

    int vida;

    int sonar;

    String equipo;

    int posX, posY = 0;
    int movX, movY = 5;

    public Barco(String nombre, int velocidad, int potenciaFuego, int vida, int sonar, String equipo, ImageView fotoBarco){
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.potenciaFuego = potenciaFuego;
        this.vida = vida;
        this.sonar = sonar;
        this.equipo = equipo;
        this.imagen = fotoBarco;

    }

    /*public Barco(String nombre, String equipo){
        if(nombre.equals("Destructor")){ Desctructor Sharpedo
            this.nombre = nombre;
            this.velocidad = 5;
            this.potenciaFuego = 50;
            this.vida = 80;
            this.sonar = 15;
            this.equipo = equipo;
        } else if(nombre.equals("Acorazado")){ Wailord
            this.nombre = nombre;
            this.velocidad = 3;
            this.potenciaFuego = 80;
            this.vida = 120;
            this.sonar = 20;
            this.equipo = equipo;
        } else if(nombre.equals("Submarino")){ Wailmer
            this.nombre = nombre;
            this.velocidad = 2;
            this.potenciaFuego = 60;
            this.vida = 30;
            this.sonar = 20;
            this.equipo = equipo;
        } else if(nombre.equals("Lancha")){ Lumineon
            this.nombre = nombre;
            this.velocidad = 10;
            this.potenciaFuego = 20;
            this.vida = 10;
            this.sonar = 12;
            this.equipo = equipo;
        }
    }*/

    public void mover(){
        
    }

}
