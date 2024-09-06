package Ejecutables;

import Util.ListaEnlazada;
import Util.Nodo;

public class EjecutableMiListaEnlazada {
    public static void main(String[] args) {
        ListaEnlazada<Integer> lista = new ListaEnlazada<>();

        // Agregar elementos a la lista
        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);
        lista.agregar(40);

        // Imprimir los elementos de la lista
        System.out.println("Elementos en la lista:");
        lista.imprimir();

        lista.eliminar(35);
        System.out.println("Elementos en la lista:");
        lista.imprimir();

        lista.eliminarPorPosicion(2);
        System.out.println("Elementos en la lista:");
        lista.imprimir();
    }
}
