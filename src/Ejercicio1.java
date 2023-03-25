import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
      
        System.out.print("Ingrese el tamaño del vector: ");
        int n = leer.nextInt();
        
        // Crear el vector de tamaño n
        int[] vector = new int[n];
        
        // Llenar el vector con valores ingresados por el usuario
        System.out.println("Ingrese los valores del vector:");
        for (int i = 0; i < n; i++) {
            vector[i] = leer.nextInt();
        }
        
        // Calcular la suma de todos los elementos del vector
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += vector[i];
        }
        
        // Imprimir la suma de todos los elementos del vector
        System.out.println("La suma de todos los elementos del vector es: " + suma);
    }

}

