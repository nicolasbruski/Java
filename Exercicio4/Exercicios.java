package Exercicio4;

import java.io.IOException;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) throws IOException {
        do{
            clearScreen();
            System.out.println("0 - Sair");
            for(int i = 1; i <= 10; i++){
                System.out.println(i +" - Exercicio " + i);
            }
            System.out.println("11 - Desafio");
            System.out.println("Digite o numero do exercicio");
            Scanner sc = new Scanner(System.in);
            int exercicio = sc.nextInt();
            switch(exercicio){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    clearScreen();
                    Exercicio1.main(args);
                    System.out.println("Pressione enter para continuar...");
                    System.in.read();
                    break;
                case 2:
                    clearScreen();
                    Exercicio2.main(args);
                    System.out.println("Pressione enter para continuar...");
                    System.in.read();
                    break;
                case 3:
                    clearScreen();
                    Exercicio3.main(args);
                    System.out.println("Pressione enter para continuar...");
                    System.in.read();
                    break;
                case 4:
                    clearScreen();
                    Exercicio4.main(args);
                    System.out.println("Pressione enter para continuar...");
                    System.in.read();
                    break;
                case 5:
                    clearScreen();
                    Exercicio5.main(args);
                    System.out.println("Pressione enter para continuar...");
                    System.in.read();
                    break;
                case 6:
                    clearScreen();
                    Exercicio6.main(args);
                    System.out.println("Pressione enter para continuar...");
                    System.in.read();
                    break;
                case 7:
                    clearScreen();
                    Exercicio7.main(args);
                    System.out.println("Pressione enter para continuar...");
                    System.in.read();
                    break;
                case 8:
                    clearScreen();
                    Exercicio8.main(args);
                    System.out.println("Pressione enter para continuar...");
                    System.in.read();
                    break;
                case 9:
                    clearScreen();
                    Exercicio9.main(args);
                    System.out.println("Pressione enter para continuar...");
                    System.in.read();
                    break;
                case 10:
                    clearScreen();
                    Exercicio10.main(args);
                    System.out.println("Pressione enter para continuar...");
                    System.in.read();
                    break;
                case 11:
                    clearScreen();
                    Desafio.main(args);
                    System.out.println("Pressione enter para continuar...");
                    System.in.read();
                    break;
                default:
                    clearScreen();
                    System.out.println("Exercicio não encontrado");
                    System.out.println("Pressione enter para continuar...");
                    System.in.read();
            }
        }while(true);
    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
    
}
