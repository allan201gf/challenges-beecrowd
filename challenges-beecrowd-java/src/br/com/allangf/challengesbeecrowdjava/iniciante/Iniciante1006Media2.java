package br.com.allangf.challengesbeecrowdjava.iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Iniciante1006Media2 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        double notaA, notaB, notaC, media;
        notaA = input.nextDouble();
        notaB = input.nextDouble();
        notaC = input.nextDouble();

        notaA = notaA * 0.2;
        notaB = notaB * 0.3;
        notaC = notaC * 0.5;

        media = notaA + notaB + notaC;

        System.out.printf("MEDIA = %.1f\n", media);
    }

}
