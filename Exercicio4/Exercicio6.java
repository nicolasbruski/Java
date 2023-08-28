package Exercicio4;
import java.util.ArrayList;

public class Exercicio6 {
    public static void main(String[] args) {
        ArrayList<Integer> valores = new ArrayList<Integer>();
        ArrayList<Integer> outros = new ArrayList<Integer>();
        for(int i = 1; i < 10; i++){
            valores.add(i);
        }
        for(int i = 10; i <= 20; i++){
            outros.add(i);
        }
        valores.addAll(outros);
        System.out.println(valores);
    }
}
