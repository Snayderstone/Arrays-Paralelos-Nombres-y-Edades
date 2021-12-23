package P1_Fibonacci_Recursivo_vs_Equivalente;

/**
 *
 * @author luis1
 */
public class Class_Acciones_F_Recursivo_F_Equivalente {

    public long SerieFibonacci_Recursivo(int n) {
        System.out.println("F(" + n + ") = " + "F(" + n + "-1) + " + "F(" + n + "-2)");
        if (n == 1 || n == 0) {
            return n;
        } else {
            return (SerieFibonacci_Recursivo(n - 1) + SerieFibonacci_Recursivo(n - 2));
        }
    }

    
    
    public long SerieFibonacci_Equivalente(int n) {

        if (n == 0 || n == 1) {
            return n;
        }
        int fibinf = 0;
        int fibsup = 1;
        int i;
        for (i = 2; i <= n; i++) {
            int x;
            x = fibinf;
            fibinf = fibsup;
            fibsup = x + fibinf;
        }
        return (fibsup);
    }

}
