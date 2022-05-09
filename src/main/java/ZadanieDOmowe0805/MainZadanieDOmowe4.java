package ZadanieDOmowe0805;

import java.util.Arrays;
import java.util.Scanner;

public class MainZadanieDOmowe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tablica = new int[5];

        for (int i = 0; i < tablica.length; i++) {
            System.out.println("Podaj liczbę dodatnia: ");

            int zmiennaWpisywana = scanner.nextInt();
            tablica[i] = zmiennaWpisywana;
            if (zmiennaWpisywana < 0) {
                System.out.println("Ujemna wartosc - wpisz ponownie liczbe: ");
                i = i - 1;
            }
        }

        int[] tablica2 = new int[5];

        for (int i = 0; i < tablica2.length; i++) {
            System.out.println("Podaj liczbę ujemną: ");

            int zmiennaWpisywana2 = scanner.nextInt();
            tablica2[i] = zmiennaWpisywana2;
            if (zmiennaWpisywana2 > 0) {
                System.out.println("Dodatnia wartosc - wpisz ponownie liczbe: ");
                i = i - 1;
            }
        }

        System.out.println("Tablica dodatnich: " + Arrays.toString(tablica));
        System.out.println("Tablica ujemnych: " + Arrays.toString(tablica2));

        int maximum = tablica[0]; //dopytac dlaczego tablica[0]
        for (int i = 0; i < tablica.length; i++) {
            if (maximum < tablica[i]) {
                maximum = tablica[i];
            }
        }
        System.out.println("Maximum: " + maximum);

        int minimum = tablica2[0]; //dopytac dlaczego tablica2[0]
        for (int i = 0; i < tablica2.length; i++) {
            if (minimum > tablica2[i]) {
                minimum = tablica2[i];
            }
        }
        System.out.println("Minimum: " + minimum);

    }
}


