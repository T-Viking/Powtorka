package powtorzenie1;

import java.util.Scanner;

public class zad1e {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int x = Integer.parseInt(input.nextLine());
        System.out.println("Podaj drugą liczbę: ");
        int y = Integer.parseInt(input.nextLine());
        System.out.println("Wybierz rodzaj operacji: ");
        String operacja = input.nextLine();

        switch (operacja) {
            case "dodawanie":
                int a = (x + y);
                System.out.printf("%5d%5s%5d%5s%5d\n", x, "+", y, "=", a);
                break;
            case "odejmowanie":
                int b = (x - y);
                System.out.printf("%5d%5s%5d%5s%5d\n", x, "-", y, "=", b);
                break;
            case "mnożenie":
                int c = (x * y);
                System.out.printf("%5d%5s%5d%5s%5d\n", x, "*", y, "=", c);
                break;
            case "dzielenie":
                if (y != 0){
                int d = (x / y);
                System.out.printf("%5d%5s%5d%5s%5d\n", x, "/", y, "=", d);}
                else {
                    System.out.println("Nie można wykonać operacji dzielenia przez zero");
                }
                break;
            default:
                System.out.println("nie wybrano operacji");
        }
    }

}
//kalkultor obsluguje jedynie int, bez double