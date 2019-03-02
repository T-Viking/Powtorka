package powtorzenie1;

import java.util.Scanner;

public class zad1c {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int x = Integer.parseInt(input.nextLine());
        System.out.println("Podaj drugą liczbę: ");
        int y = Integer.parseInt(input.nextLine());
        int a = (x + y);
        int b = (x - y);
        int c = (x * y);
        int d = (x / y);
        System.out.println("Wybierz rodzaj operacji: ");
        String operacja = input.nextLine();

        switch (operacja) {
            case "dodawanie":
            System.out.printf("%5d%5s%5d%5s%5d\n", x, "+", y, "=", a);
            break;
            case "odejmowanie":
            System.out.printf("%5d%5s%5d%5s%5d\n", x, "-", y, "=", b);
            break;
            case "mnożenie":
            System.out.printf("%5d%5s%5d%5s%5d\n", x, "*", y, "=", c);
            break;
            case "dzielenie":
            System.out.printf("%5d%5s%5d%5s%5d\n", x, "/", y, "=", d);
            break;
            default:
                System.out.println("nie wybrano operacji");
        }
    }

}
//kalkultor obsluguje jedynie int, bez double