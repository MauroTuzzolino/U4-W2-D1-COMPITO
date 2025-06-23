package Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContoCorrente cc = new ContoCorrente("Mario Rossi", 100.0);

        ContoOnline co = new ContoOnline("Luigi Bianchi", 200.0, 50.0);

        System.out.println("=== ContoCorrente ===");
        while (true) {
            System.out.print("Inserisci importo da prelevare (ContoCorrente) o 0 per terminare: ");
            double importo = scanner.nextDouble();
            if (importo == 0) break;

            cc.preleva(importo);
            System.out.println("Saldo attuale: " + cc.restituisciSaldo());
        }

        System.out.println("\n=== ContoOnline ===");
        while (true) {
            System.out.print("Inserisci importo da prelevare (ContoOnline) o 0 per terminare: ");
            double importo = scanner.nextDouble();
            if (importo == 0) break;

            co.preleva(importo);
            co.stampaSaldo();
        }

        scanner.close();
        System.out.println("\nOperazioni terminate.");
    }
}
