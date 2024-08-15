package Ejecutables;

import Modelo.Factura;

public class EjecutableFactura {

    public static void main(String[] args) {
        double suma = 0;
        double promedio = 0;

        Factura[][] matrizFacturas = new Factura[3][3];

        for(int i = 0; i < matrizFacturas.length; i++){
            for(int j = 0; j < matrizFacturas[0].length; j++){
                matrizFacturas[i][j] = new Factura((i+1)*(j+1));
                System.out.println(matrizFacturas[i][j].getValorTotal());
            }
        }

        for(Factura[] fila : matrizFacturas){
            for(Factura factura: fila){
                suma+= factura.getValorTotal();
            }
        }

        promedio = suma/(matrizFacturas.length*matrizFacturas[0].length);

        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);


    }
}
