package petle_do_while;

import java.util.Scanner;

public class zad1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i++<10){
            System.out.println("Podaj nazwę produktu: ");
            String produkt = input.nextLine();
            System.out.printf("Dodałeś %s do koszyka, to twój %d zakup!",produkt,i);
        }

    }
}
