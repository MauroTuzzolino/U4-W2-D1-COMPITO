package Ex0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanti numeri vuoi sommare? ");
        int n = scanner.nextInt();

        int somma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Inserisci il numero " + i + ": ");
            int numero = scanner.nextInt();
            somma += numero;
        }

        System.out.println("La somma è: " + somma);
    }
}
