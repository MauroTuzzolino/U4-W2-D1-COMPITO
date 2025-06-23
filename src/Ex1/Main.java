package Ex1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10) + 1;
        }

        System.out.print("Array iniziale: ");
        stampaArray(array);

        while (true) {
            int numero = 0;
            int posizione = 0;

            try {
                System.out.print("\nInserisci un numero intero tra 1 e 10 (0 per terminare): ");
                numero = scanner.nextInt();

                if (numero == 0) {
                    System.out.println("Terminazione del programma.");
                    break;
                }

                System.out.print("Inserisci la posizione (0-4): ");
                posizione = scanner.nextInt();

                array[posizione] = numero;

                System.out.print("Stato attuale dell'array: ");
                stampaArray(array);
            } catch (InputMismatchException e) {
                System.out.println("Errore: devi inserire un numero intero.");
                scanner.nextLine();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Errore: posizione fuori dai limiti. Deve essere tra 0 e 4.");
            }
        }

        scanner.close();
    }

    private static void stampaArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
