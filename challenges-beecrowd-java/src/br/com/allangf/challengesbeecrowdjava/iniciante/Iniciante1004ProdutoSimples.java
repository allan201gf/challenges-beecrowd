package br.com.allangf.challengesbeecrowdjava.iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Iniciante1004ProdutoSimples {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.println("PROD = " + (A * B));

    }

}
