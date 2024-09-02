package Util;

public class ListaEnlazada<T> implements Colecciones<T>{
    private Nodo<T> cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    @Override
    public void agregar(T elemento) {

        Nodo<T> n =new Nodo<>(elemento);
        this.cabeza = n;

        if (this.cabeza == null) {

        }

    }



}
