package Util;

public class NodoA {
    private int valor;
    private NodoA izquierdo;
    private NodoA derecho;

    public NodoA(int valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoA getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoA izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoA getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoA derecho) {
        this.derecho = derecho;
    }
}
