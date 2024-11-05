package Util;

public class ListaEnlazada<T> implements Colecciones<T> {
    private Nodo<T> cabeza;

    public ListaEnlazada() {

        this.cabeza = null;
    }
    @Override
    public void agregar(T elemento) {
        Nodo<T> n = new Nodo<>(elemento);

        if (this.cabeza == null) {
            this.cabeza = n;
        } else {
            Nodo<T> actual = this.cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(n);
        }
    }

    public void imprimir() {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }

    public void eliminarUltimo() {
        if (cabeza == null) {
            // La lista está vacía
            System.out.println("La lista está vacía, no se puede eliminar.");
            return;
        }

        if (cabeza.getSiguiente() == null) {
            // Solo hay un elemento en la lista
            cabeza = null;
        } else {
            // Más de un elemento en la lista
            Nodo<T> actual = cabeza;
            Nodo<T> anterior = null;

            // Recorremos la lista hasta llegar al último nodo
            while (actual.getSiguiente() != null) {
                anterior = actual;
                actual = actual.getSiguiente();
            }

            // Eliminar el último nodo
            anterior.setSiguiente(null);
        }


    }
    public int calcularTamaño() {
        int contador = 0;
        Nodo<T> actual = cabeza;  // Comenzamos desde la cabeza

        // Recorremos la lista
        while (actual != null) {
            contador++;  // Contamos cada nodo
            actual = actual.getSiguiente();  // Avanzamos al siguiente nodo
        }

        return contador;  // Devolvemos el total de nodos
    }

    public IteradorListaEnlazada<T> iterador() {
        IteradorListaEnlazada iterador = new IteradorListaEnlazada<>(this);

        return iterador;
    }

    public Nodo<T> getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo<T> cabeza) {
        this.cabeza = cabeza;
    }
    
}