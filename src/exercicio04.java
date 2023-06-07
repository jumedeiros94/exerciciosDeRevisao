//Leia a idade de 20 pessoas e exiba a média das idades.

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int idade, i;
        double media = 0;

        for (i = 1; i <= 20; i++){
            System.out.println("Digite a " + i + "º idade");
            idade = entrada.nextInt();
            media = media + idade;
        }

        media = media/20;

        System.out.println("A média das idades é: " + media);

    }
}
