package aula4.map.cidade;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/* 
1 – Escreva um programa Java com uma função principal main que execute as seguintes ações:
• que solicite nomes de cidades ao usuário;
• o programa pode cadastrar diversos nomes de cidades;
• criar um mapa para armazenar chaves como String e valores como Integer;
• armazenar no mapa o nome da cidade como chave e a quantidade de letras do nome da
cidade como valor;
• após o usuário realizar os cadastros o programa deve apresentar todas informações
armazenadas no mapa.
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> cidades = new HashMap<>();

       while (true){
            System.out.print("insira o nome da cidade: ");
            String nomeCidade = scanner.nextLine();

            if (nomeCidade.isBlank()) {
                break;
            }

            String cidadeSemEspaco = nomeCidade.replaceAll(" ", "");
            cidades.put(nomeCidade, cidadeSemEspaco.length());
        }
        
        System.out.println("Letras contadas em cada cidade.");
        for (String cidade : cidades.keySet()) {
            System.out.println(cidade + ": " + cidades.get(cidade));
        }

        scanner.close();
    }
}
