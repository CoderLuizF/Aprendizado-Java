package application;

import java.util.Scanner;

public class Program7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //leitura do tamanho da matriz(array bidimensional)
        int n = sc.nextInt();

        //um array com duas dimensões
        int[][] mat = new int[n][n];

        //ler a matriz com um 'for' dentro de outro
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        //mostrar a diagonal principal
        System.out.println("Main diagonal: ");
        for(int i=0; i<n; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        //exibir a quantidade de números negativos (caso tenha)
        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(mat[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("Negative numbers = " + count);


        sc.close();
    }
}
