/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import entities.Juego;
import services.RuletaServices;

/**
 *
 * @author gustavotorti
 */
public class principal {

     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
          // TODO code application logic here
          
          RuletaServices rs = new RuletaServices();
          Juego juego = rs.llenarJuego();
          rs.llenarRevolver(juego.getRevolver());
          System.out.println(rs.ronda(juego));
          
     }
     
}
