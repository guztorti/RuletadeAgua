/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package entities;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gustavotorti
 */
public class Juego {

     private ArrayList<Jugador> jugadores;
     private RevolverDeAgua revolver;

     public Juego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
          this.jugadores = jugadores;
          this.revolver = revolver;
     }

     public Juego() {
     }

     public ArrayList<Jugador> getJugadores() {
          return jugadores;
     }

     public void setJugadores(ArrayList<Jugador> jugadores) {
          this.jugadores = jugadores;
     }

     public RevolverDeAgua getRevolver() {
          return revolver;
     }

     public void setRevolver(RevolverDeAgua revolver) {
          this.revolver = revolver;
     }
     
     

}
