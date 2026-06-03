package application;

import java.util.Locale;
import java.util.Scanner;

public class Program5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] rooms = new Rent[10];

        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();

        sc.close();
    }
}
