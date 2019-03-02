package czytanie_danych_z_ekranu;

import java.util.Scanner;

public class zad2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź pierwszą wartosć: ");
        int x = Integer.parseInt(input.nextLine());
        System.out.println("Wprowadź drugą wartość: ");
        int y = Integer.parseInt(input.nextLine());
        int z = x += y;
        System.out.printf("Suma wartości to: %d", z);

    }
}
