package application;

import entities.Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        //array para guardar "Pessoas"
        Pessoas[] vect = new Pessoas[n];

        //ler os dados
        for(int i=0; i< vect.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");

            sc.nextLine();

            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Idade: ");
            int idade = sc.nextInt();

            System.out.println("Altura: ");
            double altura = sc.nextDouble();

            vect[i] = new Pessoas(nome, idade, altura);
        }



        sc.close();

    }
}
