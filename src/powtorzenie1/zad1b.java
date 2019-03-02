package powtorzenie1;

import java.util.Scanner;

public class zad1b {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int x = Integer.parseInt(input.nextLine());
        System.out.println("Podaj drugą liczbę: ");
        int y = Integer.parseInt(input.nextLine());
        int a = (x + y);
        int b = (x - y);
        System.out.println("Jaki rodzaj operacji chesz wykonać?\n(dodawanie/odejmowanie): ");
        String operacja = input.nextLine();

        if (operacja.equals("dodawanie")){
        System.out.printf("%5d%5s%5d%5s%5d\n",x,"+",y,"=",a);}
        else {
        System.out.printf("%5d%5s%5d%5s%5d\n",x,"-",y,"=",b);}
    }

}
