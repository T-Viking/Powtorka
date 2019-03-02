package petle_for;

import java.util.Scanner;

public class zad2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int suma = 0;
        for (int i = 0; i<5; i++){
            System.out.println("Podaj liczbę: ");
            int y = Integer.parseInt(input.nextLine());
            suma += y;
        }
        System.out.println(suma);

    }
}
