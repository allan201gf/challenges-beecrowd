package br.com.allangf.challengesbeecrowdjava.iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Iniciante1009SalarioComBonus {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        String nome;
        double salario, totalVendas, salarioFinal;

        nome = input.next();
        salario = input.nextDouble();
        totalVendas = input.nextDouble();

        salarioFinal = salario + totalVendas * 0.15;

        System.out.printf("TOTAL = R$ %.2f\n", salarioFinal);
    }

}
