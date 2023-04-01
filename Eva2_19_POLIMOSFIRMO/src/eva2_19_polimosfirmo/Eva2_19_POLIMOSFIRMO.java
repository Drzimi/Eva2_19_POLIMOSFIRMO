/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_19_polimosfirmo;

/**
 *
 * @author invitado
 */
public class Eva2_19_POLIMOSFIRMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante Estu = new Estudiante("DAS", "ASD", 45, "239183920");
        Estu.imprimirDatos();
        Docentes1 Doce = new Docentes1("das", "asd", "asd", 321);
        Doce.imprimirDatos();
        
        //En Resumen esto es polimorfismo:
        Persona persona = Docentes1;
        Persona persona2 = Estudiante
    }
    
}
