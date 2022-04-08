/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class Servicios {
    Scanner leer = new Scanner(System.in);
    ArrayList<Persona> Personas = new ArrayList();
    ArrayList<Perro> Perros = new ArrayList();
    
    public void CrearPersona(){
        String nombre;
        String apellido;
        Integer edad;
        Integer dni;
        System.out.println("Ingrese su nombre: ");
        nombre=leer.nextLine();
        apellido=leer.nextLine();
        edad=leer.nextInt();
        dni=leer.nextInt();
        Personas.add(new Persona(nombre, apellido, edad, dni, null));
    }
    
    public void CrearPerro(){
        String nombre;
        String raza;
        Integer edad;
        String tamanio;
        System.out.println("Ingrese el nombre: ");
        nombre=leer.nextLine();
        raza=leer.nextLine();
        edad=leer.nextInt();
        tamanio=leer.nextLine();
        Perros.add(new Perro(nombre, raza, edad, tamanio));
    }
    
    public void AdoptarPerro(){
        int n=0;
        System.out.println(Personas.get(0).getNombre()+" adoptará un perro elija uno.");
        for (Perro i : Perros) {
            System.out.print((n+1)+"- ");
            System.out.println(i);
            n++;
        }
        int op=1;
        switch(op){
        
        }
        
    }
    
}
