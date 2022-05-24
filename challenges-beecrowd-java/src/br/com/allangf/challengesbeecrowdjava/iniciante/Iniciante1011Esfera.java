package br.com.allangf.challengesbeecrowdjava.iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Iniciante1011Esfera {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        final double PI = 3.14159;
        double volume;
        int raio;

        raio = input.nextInt();

        volume = (4/3.0) * PI * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f\n", volume);
    }

}
