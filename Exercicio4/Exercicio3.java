package Exercicio4;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] valores = new double[10];
        System.out.println("Digite 10 valores");
        for (int i = 0; i < valores.length; i++) {
            valores[i] = sc.nextDouble();
        }
        for (double valor : valores) {
            System.out.println(valor);
        }
    }
    
}
