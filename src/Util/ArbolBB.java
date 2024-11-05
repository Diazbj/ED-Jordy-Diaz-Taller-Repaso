package Util;

public class ArbolBB {

    private NodoA raiz;
    private int tam;

    public ArbolBB() {
        this.raiz = null;
    }

    public void insertar(int valor) {
        NodoA nuevo = new NodoA(valor);
        if (raiz == null) {
            this.raiz = nuevo;
            return;
        }
        NodoA nivel = raiz;
        NodoA padreTem = null;
        while (true) {
            padreTem = nivel;
            if(valor<nivel.getValor()){
                nivel=nivel.getIzquierdo();
                if(nivel==null){

                    padreTem.setIzquierdo(nivel);
                    return;

                }
            } else if (valor>nivel.getValor()) {
                nivel=nivel.getDerecho();
                if(nivel==null){
                    padreTem.setDerecho(nivel);
                    return;
                }
                
            }else {
                return;
            }
        }
    }

    public NodoA getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoA raiz) {
        this.raiz = raiz;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
}
