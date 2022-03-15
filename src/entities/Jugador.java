/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package entities;

import services.RuletaServices;

/**
 *
 * @author gustavotorti
 */
public class Jugador {

     private Integer id;
     private String nombre;
     private Boolean mojado;

     public Jugador() {
     }

     public Jugador(Integer id, String nombre, Boolean mojado) {
          this.id = id;
          this.nombre = nombre;
          this.mojado = mojado;
     }
     public String getNombre(){
          return this.nombre;
     }
     
     public boolean disparo( RevolverDeAgua r){
          RuletaServices rs = new RuletaServices();
          boolean seMojo = rs.mojar(r);
          r.setPosActual(rs.siguienteChorro(r));
          return seMojo;
     }
}
