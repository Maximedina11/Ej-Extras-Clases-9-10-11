import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] palabras = new String[5];
        System.out.println("Ingrese 5 palabras de 3 a 5 caracteres:");
        for (int i = 0; i < 5; i++) {
            palabras[i] = leer.next();
        }
        char[][] sopa = new char[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j] = (char) (Math.random() * 10 + '0');
            }
        }
        int fila = (int) (Math.random() * 20);
        int columna = (int) (Math.random() * (16 - palabras[0].length() + 1));
        for (String palabra : palabras) {
            for (int j = 0; j < palabra.length(); j++) {
                sopa[fila][columna + j] = palabra.charAt(j);
            }
            fila = (int) (Math.random() * 20);
            columna = (int) (Math.random() * (16 - palabra.length() + 1));
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + "|");
            }
            System.out.println();
        }
    }

}



