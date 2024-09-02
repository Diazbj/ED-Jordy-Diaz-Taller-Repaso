package Modelo;

public class Turno implements Comparable<Turno>{

    private int secuencia;
    private int prioridad;
    private int tipo;

    public Turno(int secuencia, int prioridad, int tipo) {
        this.prioridad = prioridad;
        this.secuencia = secuencia;
        this.tipo = tipo;
    }

    @Override
    public int compareTo(Turno turnoEnComparacion) {
//        if (this.secuencia>turnoEnComparacion.getSecuencia()){
//            return 1;
//        } else if (this.secuencia<turnoEnComparacion.getSecuencia()) {
//            return -1;
//
//        }
//        return 0;
        return this.secuencia - turnoEnComparacion.getSecuencia();
    }

    public int getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(int secuencia) {
        this.secuencia = secuencia;
    }
    public int getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
