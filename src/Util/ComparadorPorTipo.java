package Util;

import Modelo.Turno;

import java.util.Comparator;

public class ComparadorPorTipo implements Comparator<Turno> {

    @Override
    public int compare(Turno t1, Turno t2) {

        return t1.getTipo()-t2.getTipo();
    }
}
