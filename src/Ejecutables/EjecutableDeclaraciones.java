package Ejecutables;

public class EjecutableDeclaraciones {

    public static void main(String[] args) {
        declararNumerosEnteros();
        declararNumerosDecimales();
        declararTextos();
        declararArreglos();

    }

    public static void declararNumerosEnteros(){

        int entero1 =10;
        int entero2 =20;
        int entero3 =30;
        int entero4 =4;

        System.out.println(entero1*entero2*entero3*entero4);
    }

    public static void declararNumerosDecimales(){

        double decimal1=2.3;
        double decimal2=43.3;
        double decimal3=5.3;
        double decimal4=0.3;

        System.out.println(decimal1*decimal2*decimal3*decimal4);

    }

    public static void declararTextos(){

        char letra1='a';
        char letra2='b';

        System.out.println(String.format("%s y %s", letra1, letra2));

        String texto1="hola";
        String texto2="mundo";

        System.out.println(texto1 + texto2);

    }

    public static void declararArreglos(){

        int numeros [] = {1,2,3,4};
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(+numeros [i]);
        }
        System.out.println();

        long numero1[]= {23423,54534,656464};
        for (int i = 0; i < numero1.length; i++) {
            System.out.print(+ numero1 [i]);
        }
        System.out.println();
        char letra[] = {'a', 'b', 'c'};
        for (int i = 0; i < letra.length; i++) {
            System.out.print(+letra [i]);
        }
        System.out.println();
        String palabra[]= new String[3];
        palabra[0]="pedro";
        palabra[1]="hipotenusa";
        palabra[2]="Divide";
        for (int i = 0; i < palabra.length; i++) {
            System.out.print(palabra [i] + " ");
        }
        System.out.println();

}


}
