package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Interi
        try {
            System.out.println("=== Versione con interi ===");
            System.out.print("Inserisci i km percorsi: ");
            int kmInt = scanner.nextInt();
            System.out.print("Inserisci i litri consumati: ");
            int litriInt = scanner.nextInt();

            int kmPerLitroInt = kmInt / litriInt;
            System.out.println("Km/Litro (interi): " + kmPerLitroInt);
        } catch (ArithmeticException e) {
            System.out.println("Errore: Divisione per zero (interi)!");
        }

        // Double
        try {
            System.out.println("\n=== Versione con double ===");
            System.out.print("Inserisci i km percorsi: ");
            double kmDouble = scanner.nextDouble();
            System.out.print("Inserisci i litri consumati: ");
            double litriDouble = scanner.nextDouble();

            double kmPerLitroDouble = kmDouble / litriDouble;
            System.out.println("Km/Litro (double): " + kmPerLitroDouble);
        } catch (ArithmeticException e) {
            System.out.println("Errore: Divisione per zero (double)!");
        }

        scanner.close();
    }
}
