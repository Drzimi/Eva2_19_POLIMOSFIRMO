
package eva2_19_polimosfirmo;


public class Estudiante extends Persona{
  public String noControl;
public Estudiante (){//Constructor default
  super();//Llamada al constructor de la super clase 
  this.noControl ="-----";
  
}

  public Estudiante(String noControl) {
    this.noControl = noControl;
  }
 public Estudiante(String nombre, String apellido , int edad , String noControl){
   super();
   this.noControl = noControl;
 }
  public String getNoControl() {
    return noControl;
  }

  public void setNoControl(String noControl) {
    this.noControl = noControl;
  }

    void imprimirDatos() {
        
    }
  
  
}
