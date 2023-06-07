//Faça um algoritmo que leia uma variável e some 5 caso seja par ou some 8 caso seja ímpar,
// imprimir o resultado desta operação.

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Diga um número: ");
        numero = entrada.nextInt();

        if (numero % 2 == 0) {
             numero += 5;
             System.out.println("O número digitado é par, foi somado 5. Agora ele vale: " + numero);
        } else {
            numero += 8;
            System.out.println("O número digitado é ímpar, foi somado 8. Agora ele vale: " + numero);
        }

    }
}
