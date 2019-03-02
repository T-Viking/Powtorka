package instrukcje_warunkowe_if_else;

import java.util.Scanner;

public class zad2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę od 0 do 9: ");
        int x = Integer.parseInt(input.nextLine());

        if (x == 0){
            System.out.println(")");
        } else if (x == 1){
            System.out.println("!");
        } else if (x == 2){
            System.out.println("@");
        } else if (x == 3){
            System.out.println("#");
        } else if (x == 4){
            System.out.println("$");
        } else if (x == 5){
            System.out.println("%");
        } else if (x == 6){
            System.out.println("^");
        } else if (x == 7){
            System.out.println("&");
        } else if (x == 8){
            System.out.println("*");
        } else {
            System.out.println("(");
        }

    }
}
