package Exercicio4;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] temperaturaMes = new float[12];
        float temperaturaAno = 0;
        for (int i = 0; i < temperaturaMes.length; i++){
            System.out.println("Digite a temperatura média do mês " + (i+1));
            temperaturaMes[i] = sc.nextFloat();
            temperaturaAno += temperaturaMes[i];
        }
        temperaturaAno /= temperaturaMes.length;
        System.out.println("Temperatura média do ano: " + temperaturaAno);
    }
    
}
