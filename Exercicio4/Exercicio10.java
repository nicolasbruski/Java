package Exercicio4;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valores[] = new int[20];
        int soma = 0;
        boolean menor = false;
        for(int i = 0; i < valores.length; i++){
            System.out.println("Digite o " + (i+1) + "º valor");
            valores[i] = sc.nextInt();
            soma += valores[i];
        }
        float media = soma/valores.length;
        System.out.println("Média: " + media);
        for(int valor : valores){
            if(valor < media){
                System.out.println(valor + " é menor que a média");
                menor = true;
            }
        }
        if(!menor){
            System.out.println("Nenhum valor é menor que a média");
        }
    }
}
