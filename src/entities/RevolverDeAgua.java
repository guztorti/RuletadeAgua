/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package entities;

import java.util.Objects;

/**
 *
 * @author gustavotorti
 */
public class RevolverDeAgua {

     private Integer posActual;
     private Integer posAgua;

     public RevolverDeAgua(Integer posActual, Integer posAgua) {
          this.posActual = posActual;
          this.posAgua = posAgua;
     }

     public RevolverDeAgua() {
     }

     public Integer getPosActual() {
          return posActual;
     }

     public void setPosActual(Integer posActual) {
          this.posActual = posActual;
     }

     public Integer getPosAgua() {
          return posAgua;
     }

     public void setPosAgua(Integer posAgua) {
          this.posAgua = posAgua;
     }

     @Override
     public String toString() {
          return "Revolver de agua{" + "posición actual=" + posActual + ", posición del agua=" + posAgua + '}';
     }

}
