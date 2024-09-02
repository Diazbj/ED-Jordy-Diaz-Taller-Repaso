package Util;

public class ListaEnlazada<T> implements Colecciones<T>{
    private Nodo<T> cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    @Override
    public void agregar(T elemento) {

        Nodo<T> nuevoNodo =new Nodo<>(elemento);

        if (this.cabeza == null) {

            this.cabeza = nuevoNodo;

        }else {
            // Si la lista no está vacía, recorrer hasta el último nodo
            Nodo<T> temp = this.cabeza;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            // Enlazar el último nodo con el nuevo nodo
            temp.setSiguiente(nuevoNodo);
        }

    }

    // Método para imprimir los elementos de la lista
    public void imprimir() {
        Nodo<T> actual = cabeza;

        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }



}
