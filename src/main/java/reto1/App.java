package reto1;

import reto1.logica.Viabilidad;

public class App {
    public static void main( String[] args ) {

        Viabilidad resultadoInversion = new Viabilidad (0,0,0);

        System.out.println(resultadoInversion.inversion(12,2000000,5));

        Viabilidad resultadoInversion2 = new Viabilidad (0, 0, 0);

        System.out.println(resultadoInversion2.inversion(11,2005000.0,4));
        

    }
}
