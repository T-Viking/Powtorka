package powtorzenie1;

import java.util.Scanner;

public class ternaryOperatorPrzyklad {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        String liczba = input.nextLine();
        String wynik = liczba.equals("5") ? "rowna" : "rozna";
        System.out.println(wynik);

    }

}