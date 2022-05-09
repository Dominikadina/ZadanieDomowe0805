package ZadanieDOmowe0805;

import java.util.Arrays;
import java.util.Scanner;

public class MainZadanieDomowe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tablica = new int[5];

        for (int i = 0; i < tablica.length; i++) {
            System.out.println("Podaj liczbę: ");

            int zmiennaWpisywana = scanner.nextInt();
            tablica[i] = zmiennaWpisywana;
            if (zmiennaWpisywana < 0) {
                System.out.println("Ujemna wartosc - wpisz ponownie liczbe: ");
                i = i - 1;

            }
        }
        System.out.println("Tablica dodatnich: " + Arrays.toString(tablica));

        int maximum = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (maximum < tablica[i]) {
                maximum = tablica[i];
            }
        }
        System.out.println("Maximum: " + maximum);
    }
}

//