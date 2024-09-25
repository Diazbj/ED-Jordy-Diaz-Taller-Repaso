package Ejecutables;

import Util.IteradorListaEnlazada;
import Util.ListaEnlazada;
import Util.Nodo;

import java.util.Iterator;

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

        System.out.println(lista.calcularTamaño());

        lista.eliminarUltimo();
        System.out.println("Elementos en la lista:");
        lista.imprimir();

        System.out.println(lista.calcularTamaño());

        IteradorListaEnlazada<Integer> iteradorLista = lista.iterador();

        

        System.out.println("Elementos en la lista con iterador:");
        while (iteradorLista.hasNext()) {
            System.out.println(iteradorLista.next());
        }
    }
}