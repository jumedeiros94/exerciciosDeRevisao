//Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais
// deverá se somar os dois, caso contrário multiplique A por B. Ao final de qualquer um dos cálculos
// deve-se atribuir o resultado para uma variável C e mostrar seu conteúdo na tela.

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeroA, numeroB, numeroC;

        System.out.println("Diga o primeiro número: ");
        numeroA = entrada.nextInt();

        System.out.println("Diga o segundo número: ");
        numeroB = entrada.nextInt();

        if (numeroA == numeroB) {
            numeroC = numeroA + numeroB;
            System.out.println("Os valores são iguais, a soma do " + numeroA + " e " + numeroB + " é " + numeroC);

        }else{
            numeroC = numeroA * numeroB;
            System.out.println("Os valores são diferentes, a multiplicação do " + numeroA + " e " + numeroB + " é " + numeroC);

        }



    }
}
