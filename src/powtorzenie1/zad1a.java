package powtorzenie1;

import java.util.Scanner;

public class zad1a {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int x = Integer.parseInt(input.nextLine());
        System.out.println("Podaj drugą liczbę: ");
        int y = Integer.parseInt(input.nextLine());
        int a = (x + y);
        int b = (x - y);

        System.out.printf("%5d%5s%5d%5s%5d\n",x,"+",y,"=",a);
        System.out.printf("%5d%5s%5d%5s%5d\n",x,"-",y,"=",b);
    }

}
