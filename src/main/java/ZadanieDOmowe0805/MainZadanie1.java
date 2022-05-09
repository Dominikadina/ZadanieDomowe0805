package ZadanieDOmowe0805;

import java.util.Scanner;

public class MainZadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();

 System.out.print("Liczniki liczby " + liczba + " to:");
        for (int i = 1; i <= liczba; i++) {
            if ((liczba % i) == 0) {

                System.out.print(i + ",");
            }
        }

    }
}

