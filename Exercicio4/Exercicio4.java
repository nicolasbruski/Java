package Exercicio4;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[10];
        System.out.println("Digite 10 valores");
        for (int i = 0; i < valores.length; i++) {
            valores[i] = sc.nextInt();
        }
        for (int valor : valores) {
            if(valor % 2 == 0){
                System.out.println(valor + " é par");
            }else{
                System.out.println(valor + " é impar");
            }
        }
    }
    
}
