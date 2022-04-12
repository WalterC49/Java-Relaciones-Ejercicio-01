/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import Enumeraciones.TamanioPerro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class Servicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Persona> Personas = new ArrayList();
    ArrayList<Perro> Perros = new ArrayList();
    
    public void CrearPersona(){
        String nombre;
        String apellido;
        Integer edad;
        Integer dni;
        System.out.print("Ingrese su nombre: ");
        nombre=leer.next();
        System.out.print("Ingrese su apellido: ");
        apellido=leer.next();
        System.out.print("Ingrese la edad: ");
        edad=leer.nextInt();
        System.out.print("Ingrese su DNI: ");
        dni=leer.nextInt();
        Personas.add(new Persona(nombre, apellido, edad, dni, null));
    }
    
    public void CrearPerro(){
        String nombre;
        String raza;
        Integer edad;
        TamanioPerro tamanio = null;
        int op;
        boolean listo=false;
        System.out.print("Ingrese su nombre: ");
        nombre=leer.next();
        System.out.print("Ingrese su raza: ");
        raza=leer.next();
        System.out.print("Ingrese su edad: ");
        edad=leer.nextInt();
        do{
            System.out.println("Ingrese su tamaño:"
                + "\n1- Toy o Enano."
                + "\n2- Pequeño."
                + "\n3- Mediano."
                + "\n4- Grande."
                + "\n5- Gigante.");
            System.out.print("Opción: ");
            op=leer.nextInt();
            switch(op){
                case 1:
                    tamanio=TamanioPerro.TOY_O_ENANO;
                    listo=true;
                    break;
                case 2: 
                    tamanio=TamanioPerro.PEQUENIO;
                    listo=true;
                    break;
                case 3:
                    tamanio=TamanioPerro.MEDIANO;
                    listo=true;
                    break;
                case 4:
                    tamanio=TamanioPerro.GRANDE;
                    listo=true;
                    break;
                case 5:
                    tamanio=TamanioPerro.GIGANTE;
                    listo=true;
                    break;
                default:
                    System.out.println("Opción no valida intenta de vuelta.");
            }
        }while(!listo);
        Perros.add(new Perro(nombre, raza, edad, tamanio));
    }
    /*
    public int ElegirPersona(){
        int op;
        boolean listo=false;
        do{
            int n=0;
            System.out.println("Elija una persona:");
            for (Persona i : Personas) {
                System.out.print((n+1)+"- ");
                System.out.println(i.getNombre());
                n++;  
            }
            System.out.print("Opción: ");
            op=leer.nextInt();
            switch(op){
                case 1:
                    listo=true;
                    break;
                case 2:
                    listo=true;
                    break;
                default:
                    System.out.println("Opción no valida.");
            }
        }while(!listo);
        return op;
    }
    */
    public void AdoptarPerro(int num){
        boolean listo=false;
        do{
            int n=0;
            System.out.println(Personas.get(num-1).getNombre()+" adoptará un perro elija uno.");
            for (Perro i : Perros) {
                System.out.print((n+1)+"- ");
                System.out.println(i);
                n++;  
            }
            System.out.print("Opción: ");
            int op=leer.nextInt();
            switch(op){
                case 1:
                    Personas.get(num-1).setPerro(Perros.get(op-1));
                    Perros.remove(op-1);
                    listo=true;
                    break;
              case 2:
                    Personas.get(num-1).setPerro(Perros.get(op-1));
                    Perros.remove(op-1);
                    listo=true;
                    break;
                default:
                    System.out.println("Opción no valida.");
            }
        }while(!listo);
    }
    
    public void MostrarPersona(){
        System.out.println("\nMostrando personas:");
        for (Persona i : Personas) {
            System.out.println(i);
        }
    }
    /*
    public void MostrarPerro(){
        System.out.println("\nMostrando perros:");
        for (Perro i : Perros) {
            System.out.println(i);
        }
    }
    */
}
