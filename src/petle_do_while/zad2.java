package petle_do_while;

import java.util.Scanner;

public class zad2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i = 0;
        int a = 0;

        while (i++ < 5){
            System.out.println("Podaj liczbę: ");
            int liczba = Integer.parseInt(input.nextLine());
            a += liczba;
        }
        System.out.println(a);
    }
}