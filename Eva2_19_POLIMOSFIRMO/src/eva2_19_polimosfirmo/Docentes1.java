/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_19_polimosfirmo;


public class Docentes1 extends Persona {
  public String Plaza;

  public Docentes1(){
    super();
    this.Plaza = "----";
  }
  public Docentes1(String Plaza , String nombre, String apellido , int edad){
    super();
    this.Plaza = Plaza;
  }
  public Docentes1(String Plaza) {
    this.Plaza = Plaza;
  }

  public String getPlaza() {
    return Plaza;
  }

  public void setPlaza(String Plaza) {
    this.Plaza = Plaza;
  }

    void imprimirDatos() {
        
    }
  
  
}
