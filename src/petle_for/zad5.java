package petle_for;

import java.util.Scanner;

public class zad5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj długość boku: ");
        int a = Integer.parseInt(input.nextLine());
        System.out.println("z czego ma się składać kwadrat?");
        String symbol = input.nextLine();

        for (int x = 0; x<a; x++){
            System.out.println(" ");
            for (int y = 0; y<a; y++){
                System.out.printf("%s ",symbol);
            }
        }

    }
}