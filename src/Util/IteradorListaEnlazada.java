package Util;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteradorListaEnlazada<T> implements Iterator<T> {

    private Nodo<T> actual;  // Nodo actual para la iteración
    private ListaEnlazada<T> lista;  // Referencia a la lista

    public IteradorListaEnlazada(ListaEnlazada<T> lista) {
        this.lista = lista;  // Inicializa el iterador con la lista
        this.actual = lista.getCabeza();  // Comienza desde la cabeza de la lista
    }

    @Override
    public boolean hasNext() {
        return actual != null;  // Devuelve true si hay un nodo actual
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();  // Lanza excepción si no hay más elementos
        }
        T dato = actual.getDato();  // Obtiene el dato del nodo actual
        actual = actual.getSiguiente();  // Avanza al siguiente nodo
        return dato;  // Devuelve el dato
    }

}
