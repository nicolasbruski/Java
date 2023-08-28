package Exercicio4;
import java.util.ArrayList;

public class Exercicio5 {
    public static void main(String[] args) {
        String[] cartas = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                           "J", "Q", "K"};
        String[] naipes = {"Paus", "Ouros", "Copas", "Espadas"};
        ArrayList<String> baralho = new ArrayList<>();
        for (String carta : cartas) {
            for (int j = 0; j < naipes.length; j++) {
                baralho.add(carta + " de " + naipes[j]);
            }
        }
        System.out.println(baralho);

    }
    
}
