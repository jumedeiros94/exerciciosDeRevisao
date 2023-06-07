//Escreva um algoritmo que leia o número de identificação, as 3 notas obtidas por um aluno nas 3
// verificações e a média dos exercícios que fazem parte da avaliação, e calcule a média de
// aproveitamento, usando a fórmula: MA := (nota1 + nota 2 * 2 + nota 3 * 3 + ME)/7
//A atribuição dos conceitos obedece a tabela abaixo. O algoritmo deve escrever o número do aluno,
// suas notas, a média dos exercícios, a média de aproveitamento, o conceito correspondente e a mensagem
// 'Aprovado' se o conceito for A, B ou C, e 'Reprovado' se o conceito for D ou E.
//Média de aproveitamento Conceito
//>= 90 A
//>= 75 e < 90 B
//>= 60 e < 75 C
//>= 40 e < 60 D
//< 40 E

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int codigoAluno;
        double nota1, nota2, nota3, mediaExercicios, mediaAproveitamento;
        String conceito;

        System.out.println("Informe a matrícula do aluno: ");
        codigoAluno = entrada.nextInt();
        System.out.println("Informa a primeira nota do aluno: ");
        nota1 = entrada.nextDouble();
        System.out.println("Informa a segunda nota do aluno: ");
        nota2 = entrada.nextDouble();
        System.out.println("Informa a terceira nota do aluno: ");
        nota3 = entrada.nextDouble();


        mediaExercicios = (nota1 + nota2 + nota3)/3;

        mediaAproveitamento = (nota1 + (nota2*2) + (nota3*3) + mediaExercicios)/7;

        if (mediaAproveitamento >= 90) {
            conceito = "A";
            System.out.println( "O código do aluno é: " + codigoAluno + "\n"
                    + "As notas do aluno foram: " + nota1 + " ," + nota2 + " ," + nota3 +  "\n"
                    + "A média de exercícios foi de: " + mediaExercicios +  "\n"
                    + "A média de Aproveitamento é: " + conceito + " \n"
                    + "O Aluno está aprovado!");

        }else if (mediaAproveitamento >= 75 && mediaAproveitamento < 90) {
            conceito = "B";
            System.out.println("O código do aluno é: " + codigoAluno + "\n"
                    + "As notas do aluno foram: " + nota1 + " ," + nota2 + " ," + nota3 +  "\n"
                    + "A média de exercícios foi de: " + mediaExercicios +  "\n"
                    + "A média de Aproveitamento é: " + conceito + " \n"
                    + "O Aluno está aprovado.");
        }else if (mediaAproveitamento >= 60 && mediaAproveitamento < 75) {
            conceito = "C";
            System.out.println("O código do aluno é: " + codigoAluno + "\n"
                    + "As notas do aluno foram: " + nota1 + " ," + nota2 + " ," + nota3 +  "\n"
                    + "A média de exercícios foi de: " + mediaExercicios +  "\n"
                    + "A média de Aproveitamento é: " + conceito + " \n"
                    + "O Aluno está aprovado.");

        }else if (mediaAproveitamento >= 40 && mediaAproveitamento < 60) {
            conceito = "D";
            System.out.println("O código do aluno é: " + codigoAluno + "\n"
                    + "As notas do aluno foram: " + nota1 + " ," + nota2 + " ," + nota3 +  "\n"
                    + "A média de exercícios foi de: " + mediaExercicios +  "\n"
                    + "A média de Aproveitamento é: " + conceito + " \n"
                    + "O Aluno está reprovado.");

        }else if(mediaAproveitamento < 40 && mediaAproveitamento >= 0 ) {
            conceito = "E";
            System.out.println("O código do aluno é: " + codigoAluno + "\n"
                    + "As notas do aluno foram: " + nota1 + " ," + nota2 + " ," + nota3 +  "\n"
                    + "A média de exercícios foi de: " + mediaExercicios +  "\n"
                    + "A média de Aproveitamento é: " + conceito + " \n"
                    + "O Aluno está reprovado.");
        }
    }

}

