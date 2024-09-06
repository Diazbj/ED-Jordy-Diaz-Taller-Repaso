package Util;

import java.util.NoSuchElementException;

public class ListaEnlazada<T> implements Colecciones<T> {
    private Nodo<T> cabeza;
    private int tamaño;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    public void agregar(T elemento) {
        Nodo<T> n = new Nodo<>(elemento);

        if (this.cabeza == null) {
            this.cabeza = n;
        } else {
            if(this.cabeza.getSiguiente() != null) {
                this.cabeza = this.cabeza.getSiguiente();
            }
            this.cabeza.setSiguiente(n);
        }
    }


//    public void agregar(T elemento) {
//        Nodo<T> nuevoNodo = new Nodo<>(elemento);
//
//        if (cabeza == null) {
//            cabeza = nuevoNodo;
//        } else {
//            Nodo<T> temp = cabeza;
//            while (temp.getSiguiente() != null) {
//                temp = temp.getSiguiente();
//            }
//            temp.setSiguiente(nuevoNodo);
//        }
//
//        tamaño++;
//    }

//    public boolean eliminar(T elemento) {
//        if (cabeza == null) return false;
//
//        if (cabeza.getDato().equals(elemento)) {
//            cabeza = cabeza.getSiguiente();
//            tamaño--;
//            return true;
//        }
//
//        Nodo<T> anterior = cabeza;
//        Nodo<T> actual = cabeza.getSiguiente();
//
//        while (actual != null && !actual.getDato().equals(elemento)) {
//            anterior = actual;
//            actual = actual.getSiguiente();
//        }
//
//        if (actual != null) {
//            anterior.setSiguiente(actual.getSiguiente());
//            tamaño--;
//            return true;
//        }
//
//        return false;
//    }
//
//    public T eliminarPorPosicion(int posicion) throws IndexOutOfBoundsException {
//        if (posicion < 0 || posicion >= tamaño) {
//            throw new IndexOutOfBoundsException("Posición inválida");
//        }
//
//        if (posicion == 0) {
//            T elementoEliminado = cabeza.getDato();
//            cabeza = cabeza.getSiguiente();
//            tamaño--;
//            return elementoEliminado;
//        }
//
//        Nodo<T> anterior = cabeza;
//        for (int i = 0; i < posicion - 1; i++) {
//            anterior = anterior.getSiguiente();
//        }
//
//        T elementoEliminado = anterior.getSiguiente().getDato();
//        anterior.setSiguiente(anterior.getSiguiente().getSiguiente());
//        tamaño--;
//
//        return elementoEliminado;
//    }
//
//    public int getTamaño() {
//        return tamaño;
//    }
//
//    public boolean isEmpty() {
//        return cabeza == null;
//    }
//
//    public void imprimir() {
//        Nodo<T> actual = cabeza;
//        while (actual != null) {
//            System.out.println(actual.getDato());
//            actual = actual.getSiguiente();
//        }
//    }
//
//    private static class Nodo<T> {
//        private T dato;
//        private Nodo<T> siguiente;
//
//        public Nodo(T dato) {
//            this.dato = dato;
//            this.siguiente = null;
//        }
//
//        public T getDato() {
//            return dato;
//        }
//
//        public void setSiguiente(Nodo<T> siguiente) {
//            this.siguiente = siguiente;
//        }
//
//        public Nodo<T> getSiguiente() {
//            return siguiente;
//        }
//    }
}