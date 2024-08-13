package aula4.map.palavrasdiferentes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Faça um programa que leia uma frase e informe o número de palavras não repetidas da frase, utilize uma coleção HashSet. */

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira uma frase: ");
        String frase = scanner.nextLine();

        String[] palavrasSame = frase.toLowerCase().split(" ");
        Map<String, Integer> palavrasDif = new HashMap<>();
        for (String palavra : palavrasSame){
            if (palavrasDif.containsKey(palavra)){
                palavrasDif.put(palavra, palavrasDif.get(palavra) + 1);
            } else {
                palavrasDif.put(palavra, 1);
            }
        }

        Integer i = 0;
        for(Map.Entry<String, Integer> palavra : palavrasDif.entrySet()){
            if (palavra.getValue() == 1) {
                i += 1;
            }
        }
        
        System.out.println(frase + "\nNúmero de palavras não repetidas: " + i);

        scanner.close();
    } 
}
