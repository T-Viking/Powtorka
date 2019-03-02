package petle_do_while;

import java.util.Scanner;

public class zad4i5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean funkcja = true;
        String kolekcja = "";
        while (funkcja=true){
            System.out.println("Podaj znak/znaki: ");
            String znak = input.nextLine();
            if (znak.equals("koniec")){
                break;
            }
            kolekcja += znak;
            System.out.println(kolekcja);
        }

    }
}