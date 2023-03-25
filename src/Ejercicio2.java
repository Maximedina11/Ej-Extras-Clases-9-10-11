import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        // Pedir el tamaño de los vectores
        System.out.print("Ingrese el tamaño de los vectores: ");
        int n = leer.nextInt();
        
        // Crear los vectores de tamaño n
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        
        // Llenar los vectores
        System.out.println("Ingrese los valores del primer vector:");
        for (int i = 0; i < n; i++) {
            vector1[i] = leer.nextInt();
        }
        System.out.println("Ingrese los valores del segundo vector:");
        for (int i = 0; i < n; i++) {
            vector2[i] = leer.nextInt();
        }
        
        // Comparar los vectores
        boolean iguales = true;
        for (int i = 0; i < n; i++) {
            if (vector1[i] != vector2[i]) {
                iguales = false;
                break;
            }
        }
        
        // Imprimir el resultado de la comparacion
        if (iguales) {
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores no son iguales.");
        }
    }

}
