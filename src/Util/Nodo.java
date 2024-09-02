package Util;

public class Nodo<T> {
    private Nodo<T> siguiente;
    private T dato;

    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
