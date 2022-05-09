package ZadanieDOmowe0805;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainZadanieDomowe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe x: "); // to do wypisania chyba pozniej
        int liczbaX = scanner.nextInt();

        int[] tablica = new int[5];
        for (int i = 0; i < tablica.length; i++) {
            int wylosowanaLiczba = new Random().nextInt(50) + 1;
            tablica[i] = wylosowanaLiczba;

        }
        System.out.println("Wylosowane liczby: " + Arrays.toString(tablica) + ",");

        if (liczbaX == tablica[0]) { //czemu odrzuca mi int wylosowanaLiczba? - wydaje mi sie ze to mi nie dziala
            System.out.println("Liczba x= " + liczbaX + ": została wylosowana!!! ");

        }else if (liczbaX != tablica[0]) {
            System.out.println("Sprobuj nastepnym razem!");
        }

    }
    }
