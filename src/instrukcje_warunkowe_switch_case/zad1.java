package instrukcje_warunkowe_switch_case;

import java.util.Scanner;

public class zad1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int x = Integer.parseInt(input.nextLine());

        switch (x){
            case 10:
                System.out.println("Liczba jest równa 10");
                break;
            case 100:
                System.out.println("Liczba jest warta 100");
                break;
            default:
                System.out.println("Liczba jest rózna od 10 i 100");
        }
    }
}
