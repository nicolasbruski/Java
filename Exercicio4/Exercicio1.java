package Exercicio4;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas notas você vai digitar?");
        int numNotas = sc.nextInt();
        float notas[] = new float[numNotas];
        float soma = 0;
        for (int i = 0; i < numNotas; i++) {
            System.out.println("Digite a " + (i+1) + " nota");
            notas[i] = sc.nextInt();
            soma += notas[i];
        }
        float media = soma/numNotas;
        System.out.println("Media:" + media);        
    }

}
