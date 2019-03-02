package petle_for;

import java.util.Scanner;

public class zad4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj długość boku: ");
        int a = Integer.parseInt(input.nextLine());
        for (int x = 0; x<a; x++){
            System.out.println(" ");
            for (int y = 0; y<a; y++){
                System.out.print("* ");
            }
        }

    }
}