package Exercicio4;

import java.util.LinkedList;
import java.util.Queue;

public class Exercicio7 {
    public static void main(String[] args) {
        Queue<Integer> valores = new LinkedList<Integer>();
        for (int i = 1; i <= 10; i++) {
            valores.add(i);
        }
    
        while (!valores.isEmpty()) {
            System.out.println("Senha: " + valores.peek());
            valores.remove();
        }
        if (valores.isEmpty()) {
            System.out.println("Sua Vez");
        }

    }
}
