/**
 author Daniel Hilarion
 */
package principios.solid; 

import static principios.solid.Operaciones.a;
import static principios.solid.Operaciones.b;

public class PrincipiosSOLID {

    public static void main(String[] args) {
      
        //Objeto de tipo Santiago que implementa las funciones de la interfaz Operaciones
        System.out.println("Santiago relializo las siguientes operaciones");
        Santiago santiago = new Santiago();
        System.out.println(" - El resultado de la suma entre " + a + " y " + b + " es: " + santiago.sumar());
        System.out.println(" - El resultado de la mutiplicacion entre " + a + " y " + b + " es: " + santiago.multiplicar());
        
        System.out.println("\n");
        
        //Objeto de tipo Leonardo que implementa la funciones de la interfaz Operaciones
        System.out.println("Leonardo relializo las siguientes operaciones");
        Leonardo leonardo = new Leonardo();
        System.out.println(" - El resultado de la resta entre entre " + a + " y " + b + " es: " + leonardo.restar());
        System.out.println(" - El resultado de la división entre entre " + a + " y " + b + " es: " + leonardo.dividir());
    }
    
}
