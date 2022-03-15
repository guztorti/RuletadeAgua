/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package services;

import entities.Juego;
import entities.Jugador;
import entities.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author gustavotorti
 */
public class RuletaServices {
     
     Scanner scn = new Scanner(System.in).useDelimiter("\n");
          
     public Juego llenarJuego(){
          ArrayList<Jugador> jugadores = new ArrayList();
          jugadores = new ArrayList();
          System.out.println("Ingrese la cantidad de jugadores");
          int cantJugadores = Math.min(6, Math.max(1, scn.nextInt()));
          for (int i = 0; i < cantJugadores; i++) {
               int id = i;
               String nombre = "Jugador "+id;
               boolean mojado = false;
               jugadores.add(new Jugador(id, nombre, mojado ));
          }
          return new Juego(jugadores, new RevolverDeAgua());
     }     

     public String ronda(Juego juego){
          String salida = "" + "Posición actual: "+ juego.getRevolver().getPosActual() +
                  ", posición agua: "+juego.getRevolver().getPosAgua()+"\n";
          for (Jugador jugadorX : juego.getJugadores()) {
               if(jugadorX.disparo(juego.getRevolver())){
                    salida += "El "+jugadorX.getNombre()+ " se mojó\n"; 
               }else {
                    salida += "El "+jugadorX.getNombre()+ " se salvó, no se mojó\n";
               }
          }
          return salida;
     }
          public int llenarRevolver(RevolverDeAgua arma1) {
          try {
               arma1.setPosActual((int) (Math.random() * 6));
               arma1.setPosAgua((int) (Math.random() * 6));
          } catch (Exception e) {
               return 0;
          }
          return 1;
     }

     public boolean mojar(RevolverDeAgua arma1) {
          return Objects.equals(arma1.getPosActual(), arma1.getPosAgua());
     }

     public int siguienteChorro(RevolverDeAgua arma1) {
          if (arma1.getPosActual() == 6) {
               return 0;
          }
          return arma1.getPosActual() + 1;
          
     }     
     

}
