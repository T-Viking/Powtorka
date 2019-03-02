package czytanie_danych_z_ekranu;

import java.util.Scanner;

public class zad1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj swoję imię: ");
        String imie = input.nextLine();
        System.out.println("Witaj " + imie);

    }
}
