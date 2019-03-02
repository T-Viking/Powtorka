package powtorzenie1;

import java.util.Scanner;

public class zad2a {

    public static void main(String[] args) {

        {
            System.out.println("Wprowadź liczbę: ");
            Scanner input = new Scanner(System.in);
            int x = Integer.parseInt(input.nextLine());

            if (x % 2 == 0)
                System.out.println("The number is even.");
            else
                System.out.println("The number is odd.");

        }
    }
}

