/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
*/
package ejercicio_01;

import Servicios.Servicios;

/**
 *
 * @author Walter
 */
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa crea Personas que pueden adoptar perros:");
        Servicios Serv = new Servicios();
        
        System.out.println("\nSe crearan 2 personas:");
        for(int i=0;i<2;i++){
            System.out.println((i+1)+"º persona:");
            Serv.CrearPersona();
        }
        
        System.out.println("\nSe crearan 2 perros:");
        for(int i=0;i<2;i++){
            System.out.println((i+1)+"º perro:");
            Serv.CrearPerro();
        }
        
        System.out.print("\nLa 1ra persona ");
        Serv.AdoptarPerro(1);
        
        System.out.print("\nLa 2da persona ");
        Serv.AdoptarPerro(2);
        
        Serv.MostrarPersona();
        //Serv.MostrarPerro();
    }
    
}
