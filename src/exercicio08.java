//Leia um conjunto de salários, sendo que para terminar a entrada será fornecido o valor -1.
// Após toda a entrada ter sido realizada, leia o valor de um reajuste. Em seguida exiba todos
// os salários já reajustados.

import java.util.Scanner;

public class exercicio08 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] salarios = new double[100];

        int i = 0;

        System.out.println("Digite um conjunto de sálarios. Digite -1 para encerrar ");
        double salario = entrada.nextDouble();

        while (salario != -1) {
            salarios[i] = salario;
            i++;
            salario = entrada.nextDouble();
        }

        System.out.println("Digite o valor do reajuste: ");
        double reajuste = entrada.nextDouble();

        System.out.println("Os sálarios reajustados são: ");
        for ( int j = 0; j < i; j++) {
            double novoSalario = salarios[j] * (1 + reajuste / 100);

            System.out.println(novoSalario);
        }

    }
}
