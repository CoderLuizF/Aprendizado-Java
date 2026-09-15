package application;

import entities.Client;

public class Program17 {

    public static void main(String[] args) {

        Client c1 = new Client("Luiz", "luiz@gmail.com");
        Client c2 = new Client("Cássia", "cassia@gmail.com");
        Client c3 = new Client("Cássia", "c@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());

        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c3));

    }
}
