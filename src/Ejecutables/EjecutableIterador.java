package Ejecutables;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class EjecutableIterador {

    public static void main(String[] args) {

        ArrayList<String> ciudades = new ArrayList<>();

        LinkedList<Integer> numeros = new LinkedList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);


        

        ListIterator<Integer> iterNumeros=numeros.listIterator(4);

        while (iterNumeros.hasNext()) {
            System.out.println(iterNumeros.next());
        }

        

//        ListIterator<String> ciudadIter=ciudades.listIterator();
//


        ciudades.add("armenia");
        ciudades.add("madrid");
        ciudades.add("scott");

        Iterator<String> iteCiudades = ciudades.iterator();
        //PARCIAL por que usar arraylist o colleccion o utilizar linkedlist


        boolean hay=iteCiudades.hasNext();
        System.out.println(hay);


        String ciudades1=iteCiudades.next();
        System.out.println(ciudades1);

        String ciudades2=iteCiudades.next();
        System.out.println(ciudades2);



        String ciudades3=iteCiudades.next();
        System.out.println(ciudades3);


    }
}
