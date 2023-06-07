//Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma
// desses números. Encerre a execução quando um número negativo for digitado.


import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int soma = 0;

        System.out.println("Digite uma sequência de números positivos. Digite um número negativo para encerrar. ");
        int numero = entrada.nextInt();

        while (numero >= 0) {
            soma += numero;
            numero = entrada.nextInt();
        }

        System.out.println("A soma dos números é: " + soma);

    }
}
