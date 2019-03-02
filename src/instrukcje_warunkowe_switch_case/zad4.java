package instrukcje_warunkowe_switch_case;

import java.util.Scanner;

public class zad4 {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Podaj nazwę znaku: ");
            String znak = input.nextLine();

            switch (znak){
                case ("wykrzyknik"):
                    System.out.println("!");
                case ("małpa"):
                    System.out.println("@");
                case ("hashtag"):
                    System.out.println("#");
                case ("dolar"):
                    System.out.println("$");
                case ("procent"):
                    System.out.println("%");
                case ("potęga"):
                    System.out.println("^");
                case ("and"):
                    System.out.println("&");
                case ("gwiazdka"):
                    System.out.println("*");
                case ("otwarcie nawiasu"):
                    System.out.println("(");
                default:
                    System.out.println(")");
            }
        }
    }
