package instrukcje_warunkowe_switch_case;

import java.util.Scanner;

public class zad3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj nazwę znaku: ");
        String znak = input.nextLine();

        switch (znak){
            case ("wykrzyknik"):
                System.out.println("!");
                break;
            case ("małpa"):
                System.out.println("@");
                break;
            case ("hashtag"):
                System.out.println("#");
                break;
            case ("dolar"):
                System.out.println("$");
                break;
            case ("procent"):
                System.out.println("%");
                break;
            case ("potęga"):
                System.out.println("^");
                break;
            case ("and"):
                System.out.println("&");
                break;
            case ("gwiazdka"):
                System.out.println("*");
                break;
            case ("otwarcie nawiasu"):
                System.out.println("(");
                break;
            default:
                System.out.println(")");
                break;
        }
    }
}
