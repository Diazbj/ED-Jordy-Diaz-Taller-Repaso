package Ejecutables;

import Modelo.Turno;
import Util.ComparadorPorPrioridad;
import Util.ComparadorPorTipo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class EjecutableVariosComparadores {

    public static void main(String[] args) {

        ArrayList<Turno> turnos = new ArrayList<>();

        Turno turno1=new Turno(10,1,7);
        Turno turno2=new Turno(1,3,1);
        Turno turno3=new Turno(5,2,4);

        turnos.add(turno1);
        turnos.add(turno2);
        turnos.add(turno3);


        System.out.println("Orden por prioridad");

        turnos.sort(new ComparadorPorPrioridad()) ;
        for (Turno turno : turnos) {
            System.out.println(turno.getPrioridad());
        }

        Collections.sort(turnos, new ComparadorPorTipo());
        System.out.println("Orden por tipo");

        for (Turno turno : turnos) {
            System.out.println(turno.getPrioridad());
        }

        PriorityQueue<Turno> turnos2 = new PriorityQueue<>(new ComparadorPorPrioridad());
        turnos2.add(turno1);
        turnos2.add(turno2);
        turnos2.add(turno3);

        System.out.println("Orden priority por prioridad");
        int tam=turnos2.size();
        for (int i=0;i<tam;i++) {
            System.out.println(turnos2.poll().getPrioridad());
        }

    }
}
