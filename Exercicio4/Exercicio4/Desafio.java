package Exercicio4;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] respostas = new String[5];
        int contador = 0;
        System.out.println("Responda as perguntas com S ou N");
        System.out.println("Telefonou a vítima?");
        respostas[0] = sc.next();
        System.out.println("Esteve no local do crime?");
        respostas[1] = sc.next();
        System.out.println("Mora perto da vítima?");
        respostas[2] = sc.next();
        System.out.println("Devia para a vítima?");
        respostas[3] = sc.next();
        System.out.println("Já trabalhou com a vítima?");
        respostas[4] = sc.next();
        for (String resposta : respostas) {
            if (resposta.equals("S") || resposta.equals("s") || resposta.equals("Sim") || resposta.equals("sim")) {
                contador++;
            }
        }
        verficarCulpado(contador);

    }

    public static void verficarCulpado(int contador) {
        if (contador <= 1) {
            System.out.println("Inocente");
        }
        if (contador == 2) {
            System.out.println("Suspeito");
        }
        if (contador >= 3 && contador <= 4) {
            System.out.println("Cúmplice");
        }
        if (contador == 5) {
            System.out.println("Assassino");
        }
    }
}
