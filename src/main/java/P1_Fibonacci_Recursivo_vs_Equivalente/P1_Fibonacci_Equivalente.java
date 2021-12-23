package P1_Fibonacci_Recursivo_vs_Equivalente;

import java.util.Scanner;

public class P1_Fibonacci_Equivalente {

    public static void main(String[] args) {

        long TInicio, TFin, tiempo; //Variables para determinar el tiempo de ejecución
        TInicio = System.currentTimeMillis(); //Tomamos la hora en que inicio el algoritmo y la almacenamos en la variable inicio
        
        int n = 0;
        do {
            try {
                Scanner leer = new Scanner(System.in);
                System.out.print("Introduzca número entero positivo n: ");
                n = leer.nextInt();
                if (n < 0) {
                    System.out.println("   Error! debe ser número positivo y mayor a 0");
                }
            } catch (Exception e) {
                System.out.println("   Error! debe ser número entero positivo");
            }
        } while (n < 0);

        Class_Acciones_F_Recursivo_F_Equivalente sumanumeros = new Class_Acciones_F_Recursivo_F_Equivalente();

        System.out.println("La serie Fibonacci Equivalente con " + n + " es: " + sumanumeros.SerieFibonacci_Equivalente(n));

        TFin = System.currentTimeMillis(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
        tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
        System.out.println("[...Tiempo de ejecución en milisegundos: " + tiempo + "...]"); //Mostramos en pantalla el tiempo de ejecución en milisegundos

    }

}
