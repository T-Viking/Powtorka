package instrukcje_warunkowe_if_else;

import java.util.Scanner;

public class zad3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj nazwę znaku: ");
        String nazwa = input.nextLine();

        if (nazwa.equals ("wykrzyknik")){
            System.out.println("!");
        } else if (nazwa.equals("małpa")){
            System.out.println("@");
        } else if (nazwa.equals("hashtag")){
            System.out.println("#");
        } else if (nazwa.equals("dolar")){
            System.out.println("$");
        } else if (nazwa.equals("procent")){
            System.out.println("%");
        } else if (nazwa.equals("potęga")){
            System.out.println("^");
        } else if (nazwa.equals("i")){
            System.out.println("&");
        } else if (nazwa.equals("gwiazdka")){
            System.out.println("*");
        } else if (nazwa.equals("otwarcie nawiasu")){
            System.out.println("(");
        } else{
            System.out.println(")");
        }
    }
}
