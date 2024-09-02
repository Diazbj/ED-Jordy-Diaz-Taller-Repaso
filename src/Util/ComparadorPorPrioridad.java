package Util;

import Modelo.Turno;

import java.util.Comparator;

public class ComparadorPorPrioridad implements Comparator<Turno> {

    @Override
    public int compare(Turno t1, Turno t2) {

        return t1.getPrioridad() - t2.getPrioridad();

    }


}
