package instrukcje_warunkowe_if_else;

import java.util.Scanner;

public class zad1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int x = Integer.parseInt(input.nextLine());

        if (x < 10){
            System.out.println("Liczba jest mniejsza od 10");
        } else if (x == 10){
            System.out.println("Liczaba jest równa 10");
        } else {
            System.out.println("Liczba jest większa od 10");

        }

    }
}
