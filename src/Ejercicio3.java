import java.util.Random;

public class Ejercicio3 {

    public static void main(String[] args) {
        int[] vector = new int[10]; // Creamos un vector de tamaño 10
        llenarVector(vector); // Llamamos a la función para llenar el vector
        imprimirVector(vector); // Llamamos a la función para imprimir el vector
    }

    public static void llenarVector(int[] vector) {
        Random vec = new Random(); // Creamos un objeto Random para generar números aleatorios
        for (int i = 0; i < vector.length; i++) {
            vector[i] = vec.nextInt(100); // Generamos un número aleatorio entre 0 y 99 y lo asignamos a la posición i del vector
        }
    }

    public static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Elemento " + i + ": " + vector[i]); // Imprimimos cada elemento del vector
        }
    }

}

