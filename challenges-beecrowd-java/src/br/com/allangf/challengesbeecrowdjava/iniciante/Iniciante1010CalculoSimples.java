package br.com.allangf.challengesbeecrowdjava.iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Iniciante1010CalculoSimples {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int codigoP1, codigoP2, qtdP1, qtdP2;
        double valorP1, valorP2, total;

        codigoP1 = input.nextInt();
        qtdP1 = input.nextInt();
        valorP1 = input.nextDouble();

        codigoP2 = input.nextInt();
        qtdP2 = input.nextInt();
        valorP2 = input.nextDouble();

        total = qtdP1 * valorP1 + qtdP2 * valorP2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }

}
