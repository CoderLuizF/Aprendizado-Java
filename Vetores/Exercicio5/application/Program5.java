package application;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] rooms = new Rent[10];

        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            System.out.println("Rent #" + i + ": ");
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.next();
            System.out.println("Room: ");
            int roomNumber = sc.nextInt();

            rooms[roomNumber] = new Rent(name, email);
        }

        for(int i=0; i<10; i++) {
            if(rooms[i] != null) {
                System.out.println(i + ": " + rooms[i]);
            }
        }

        sc.close();
    }
}
