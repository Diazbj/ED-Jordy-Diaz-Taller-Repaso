package Ejecutables;
import Modelo.Persona;

import java.util.Arrays;
import java.util.Comparator;

public class EjecutablePersona {

    public static void main(String[] args) {

        Persona[] personas=new Persona[8];
        

        personas[0]=new Persona("juan",28);
        personas[1]=new Persona("Felipe",16);
        personas[2]=new Persona("Jenn",24);
        personas[3]=new Persona("Maria",9);
        personas[4]=new Persona("Alejandro",38);
        personas[5]=new Persona("Andres",26);
        personas[6]=new Persona("Carlos",25);
        personas[7]=new Persona("pedro",8);

        ordenarPorEdad2(personas);


        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + ", " + persona.getEdad());
        }

        int edadBusqueda = 8; // buscar una persona de 8 años
        Persona resultado = buscarPorEdad(personas, edadBusqueda, 0, personas.length - 1);
        if (resultado != null) {
            System.out.println("Persona encontrada: " + resultado.getNombre() + ", " + resultado.getEdad());
        } else {
            System.out.println("No se encontró ninguna persona de esa edad.");
        }


    }

    public static void ordenarPorEdad1(Persona[] personas){

        boolean  intercambio;

        do{

            intercambio=false;
            for(int i=0;i<personas.length-1;i++){
                if(personas[i].getEdad()>personas[i+1].getEdad()){
                    Persona temp=personas[i];
                    personas[i]=personas[i+1];
                    personas[i+1]=temp;
                    intercambio=true;

                }
            }
        }while(intercambio);
    }

    public static void ordenarPorEdad2(Persona[] personas){
        Arrays.sort(personas, (p1, p2) -> Integer.compare(p1.getEdad(), p2.getEdad()));
    }

    public static Persona buscarPorEdad(Persona[] personas, int edadBuscada, int inicio, int fin) {
        if (inicio > fin) {
            return null; // No se encontró la persona
        }

        int medio = inicio + (fin - inicio) / 2;

        if (personas[medio].getEdad() == edadBuscada) {
            return personas[medio];
        } else if (edadBuscada < personas[medio].getEdad()) {
            return buscarPorEdad(personas, edadBuscada, inicio, medio - 1);
        } else {
            return buscarPorEdad(personas, edadBuscada, medio + 1, fin);
        }
    }

}
