package Ejecutables;

import Util.ArbolBB;

public class EjecutableArbolBB {

    public static void main(String[] args) {

        ArbolBB arbol = new ArbolBB();

        arbol.insertar(100);
        arbol.insertar(200);
        arbol.insertar(300);

        System.out.println(arbol.getRaiz().getIzquierdo().getValor());
    }

}
