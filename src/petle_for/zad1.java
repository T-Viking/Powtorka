package petle_for;

import java.util.Scanner;

public class zad1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for(int i = 0; i<10; i++){
            System.out.println("Podaj nazwę produktu który chcesz kupić: ");
            String produkt = input.nextLine();
            System.out.printf("Dodałem do koszyka %s to nasz %d produkt!\n",produkt,i+1);
        }
    }
}
