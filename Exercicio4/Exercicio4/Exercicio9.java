package Exercicio4;

public class Exercicio9 {
    public static void main(String[] args) {
        int[] valores = {1,2,3,4,5,6,7,8,9,10};
        int[] outros = {11,12,13,14,15,16,17,18,19,20};
        int[] resultado = new int[valores.length + outros.length];
        for(int i = 0; i < resultado.length; i++){
           if(i % 2 == 0){
                resultado[i] = valores[i/2];
           } else {
               resultado[i] = outros[i/2];
           }
        }
        System.out.println("Resultado: ");
        for (int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i]);
        }
    }
    
}
