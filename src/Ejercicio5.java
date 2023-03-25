import java.util.Random;

public class Ejercicio5 {

    public static void main(String[] args) {
        int n = 3; // Tamaño de filas de la matriz
        int m = 4; // Tamaño de columnas de la matriz

        int[][] matriz = new int[n][m]; // Creamos una matriz de tamaño NxM
        Random matr = new Random(); // Creamos un objeto Random para generar valores aleatorios

        // Llenamos la matriz con valores aleatorios
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = matr.nextInt(10); // Generamos un número aleatorio entre 0 y 9
            }
        }

        // Mostramos la matriz por pantalla
        System.out.println("Matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + "|"); // Imprimimos cada elemento de la matriz
            }
            System.out.println(); 
        }

        // Calculamos la suma de los elementos de la matriz
        int suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                suma += matriz[i][j];
            }
        }

        // Mostramos la suma por pantalla
        System.out.println("La suma de los elementos de la matriz es: " + suma);
    }

}
