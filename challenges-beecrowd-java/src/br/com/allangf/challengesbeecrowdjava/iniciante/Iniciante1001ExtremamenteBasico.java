package br.com.allangf.challengesbeecrowdjava.iniciante;

import java.util.Scanner;

public class Iniciante1001ExtremamenteBasico {

    public static void main(String[] args) {

        int A, B, resultado;
        Scanner input = new Scanner(System.in);

        A = input.nextInt();
        B = input.nextInt();
        resultado = A+B;

        System.out.printf("X = %d\n", resultado);
    }

}
