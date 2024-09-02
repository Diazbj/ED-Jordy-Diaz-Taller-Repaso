package Ejecutables;

import Modelo.Turno;

import java.util.PriorityQueue;

public class EjecutableComparables {
    public static void main(String[] args){

        Turno turno1=new Turno(10,1,3);
        Turno turno2=new Turno(1,3,2);
        Turno turno3=new Turno(5,2,2);

        PriorityQueue<Turno> turnos =new PriorityQueue<>();
        turnos.offer(turno1);
        turnos.offer(turno2);
        turnos.offer(turno3);
//        Turno t1=turnos.remove();
//        Turno t2=turnos.remove();
//        Turno t3=turnos.remove();
//
//        System.out.println(t1.getSecuencia() +"  y  "+ t2.getSecuencia() + " y "+ t3.getSecuencia() );
        int tam =turnos.size();
        for (int ind=0;ind< tam;ind++){
            Turno turnoSacado=turnos.remove();
            System.out.println(turnoSacado.getSecuencia());
        }



    }
}
