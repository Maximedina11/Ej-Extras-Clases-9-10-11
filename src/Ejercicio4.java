import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double[][] notas = new double[10][4]; // vector para guardar las notas de los alumnos
        double[] promedios = new double[10]; // vector para guardar los promedios de los alumnos

        // Pedimos las notas de cada alumno
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese las notas del alumno " + (i+1) + ":");
            for (int j = 0; j < 2; j++) {
                System.out.print("Nota del Trabajo Practico " + (j+1) + ": ");
                notas[i][j] = leer.nextDouble();
            }
            for (int j = 2; j < 4; j++) {
                System.out.print("Nota del integrador " + (j-1) + ": ");
                notas[i][j] = leer.nextDouble();
            }

            // Calculamos el promedio del alumno
            promedios[i] = 0.1*notas[i][0] + 0.15*notas[i][1] + 0.25*notas[i][2] + 0.5*notas[i][3];
        }

        // Contamos la cantidad de aprobados y desaprobados
        int aprobados = 0;
        int desaprobados = 0;
        for (int i = 0; i < 10; i++) {
            if (promedios[i] >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

        // Mostramos los resultados por pantalla
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
    }

}
