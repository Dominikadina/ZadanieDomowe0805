package ZadanieDOmowe0805;

import java.util.Arrays;
import java.util.Scanner;

public class MainZadanieDomowe3 {
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

        int suma = 0;
        for (int i = 0; i < 5; i++) {
            suma += tablica[i];
        }
        System.out.println("Suma tablica dodatnia: " + suma);


        int suma2 = 0;
        for (int i = 0; i < 5; i++) {
            suma2 += tablica2[i];
        }
        System.out.println("Suma tablica ujemna: " + suma2);
        int sumakoncowa = suma + suma2;
        System.out.println("Suma tablic: " + sumakoncowa);
    }
}