//Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100.

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite um número ");
            int num = entrada.nextInt();

            if (num >= 0 && num <=100) {
                contador++;
            }
        }

        System.out.println("Dos 20 números digitados, " + contador + " estão entre 0 e 100");
    }
}
