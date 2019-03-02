package powtorzenie1;

import java.util.Scanner;

public class zad2b {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int x = Integer.parseInt(input.nextLine());
        System.out.println("Podaj drugą liczbę: ");
        int y = Integer.parseInt(input.nextLine());
        if (y!=0){
            if (x % y == 0){
                System.out.printf("Liczba %d jest podzielna przez %d\n",x,y);
            } else{
                System.out.printf("Liczba %d jest niepodzielna przez liczbę %d\n",x,y);
            }
         } else {
            System.out.println("Nie można dzielić przez zero!");
        }

    }
}
