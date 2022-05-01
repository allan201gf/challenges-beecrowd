package br.com.allangf.challengesbeecrowdjava.iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Iniciante1005Media1 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        double Num1, Num2, MEDIA, X, Y;
        Num1 = input.nextDouble();
        Num2 = input.nextDouble();
        X = Num1 * 3.5;
        Y = Num2 * 7.5;
        MEDIA = (X + Y) / 11;
        System.out.printf("MEDIA = %.5f\n",MEDIA);
    }

}
