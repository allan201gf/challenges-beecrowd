package br.com.allangf.challengesbeecrowdjava.iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Iniciante1008Salario {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int funcN, horas;
        double valorHora, total;

        funcN = input.nextInt();
        horas = input.nextInt();
        valorHora = input.nextDouble();

        total = horas * valorHora;

        System.out.println("NUMBER = " + funcN);
        System.out.printf("SALARY = U$ %.2f\n", total);
    }

}
