package instrukcje_warunkowe_switch_case;

import java.util.Scanner;

public class zad2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int x = Integer.parseInt(input.nextLine());

        switch (x){
            case (1):
                System.out.println("wykrzyknik");
                break;
            case (2):
                System.out.println("małpa");
                break;
            case (3):
                System.out.println("hashtag");
                break;
            case (4):
                System.out.println("dolar");
                break;
            case (5):
                System.out.println("procent");
                break;
            case (6):
                System.out.println("potęga");
                break;
            case (7):
                System.out.println("and");
                break;
            case (8):
                System.out.println("gwiazdka");
                break;
            case (9):
                System.out.println("otwarcie nawiasu");
                break;
            default:
                System.out.println("zamknięcie nawiasu");


        }
    }
}
