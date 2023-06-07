//Leia o nome do usuário e um número N, após isso escreva o nome dele na tela N vezes.

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.println(nome);
        }

    }
}
