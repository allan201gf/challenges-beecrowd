package br.com.allangf.challengesbeecrowdjava.iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Iniciante1007Diferenca {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        int dif = (A * B) - (C * D);

        System.out.println("DIFERENCA = " + dif);

    }

}
