import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el valor del numero para calcular la sucesion Fibonacci: ");
        int n = leer.nextInt();
        int[] fib = fibonacci(n);
        System.out.println("Los primeros " + n + " números de la sucesión de Fibonacci son:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }

    public static int[] fibonacci(int n) {
        int[] fib = new int[n];
        if (n >= 1) {
            fib[0] = 0;
        }
        if (n >= 2) {
            fib[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

}

