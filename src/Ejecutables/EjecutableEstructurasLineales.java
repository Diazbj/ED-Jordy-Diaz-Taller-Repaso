package Ejecutables;

import Modelo.Factura;

import java.util.*;

public class EjecutableEstructurasLineales {



    public static void main(String[] args){


        ArrayList<String> ciudades=new ArrayList<String>();
        LinkedList<String> nombres=new LinkedList<>();
        PriorityQueue<String> palabras=new PriorityQueue<>();
        Stack<String> piLa=new Stack<>();
        HashMap<String,String> diccionario =new HashMap<>();

        int[][] num=new int[3][3];
        Factura[][] facturas=new Factura[5][2];
        ArrayList<Factura> facturas2= new ArrayList<>();

        ciudades.add("Cali");
        ciudades.add("Armenia");
        ciudades.add("Bogota");
        ciudades.add(3,"Medellin");

        ciudades.add(1,"Amazonas");
        //ciudades.add(20,"Nariño");

        ciudades.set(4,"Florencia");
//        int tamaño =ciudades.size()-1;
//        ciudades.remove(tamano);

        ciudades.removeLast();

        for (String nombreCiudad:ciudades){

            // System.out.println(nombreCiudad);

        }

        LinkedList<String> linkCiudades=ConsumirMatrizCiudades(CrearMatrizDeCiudades());

        for(String elementosCiudades:linkCiudades){
            System.out.println(elementosCiudades);
        }


    }
    public static String[][] CrearMatrizDeCiudades(){

        String[][] matrizCiudades={{"Lima","Cusco"},{"pereira","medellin"}};

        return matrizCiudades;
    }

    public static LinkedList<String> ConsumirMatrizCiudades(String[][] matrizCiudades){

        LinkedList<String> matrizALinked=new LinkedList<>();

        for(String[] ciudadfila : matrizCiudades){
            for(String elemento : ciudadfila){

                matrizALinked.add(elemento);

            }
        }

        return matrizALinked;

    }

    public int Sumar(int operadorA,int operadorB){

        return operadorA+operadorB;

    }



    public class Contenedor<TipoDesconcido>{
        public void agregar(TipoDesconcido elemento){

        }
    }
    Contenedor<String> datos=new Contenedor<>();
    //datos.agregar("juan");
}
