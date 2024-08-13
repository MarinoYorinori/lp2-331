package io.arquivo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
/* Escreva o código fonte de um programa Java que solicite ao usuário o nome do
arquivo de leitura, utilizando o tratamento de exceções para arquivos que não
existem, caso o arquivo não exista o programa deve solicitar novamente ao
usuário o nome do arquivo de leitura. O programa deve solicitar o nome do
arquivo de leitura até receber um nome de arquivo que existe. Quando o
programa receber um nome de arquivo que existe, deve imprimir na tela do
computador os números inteiros que representam os bytes armazenados no
arquivo. */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileInputStream in = null;
        
        while(true) {
            System.out.println("Insira o arquivo que deseja ler, com seu formato: ");
            String arquivo = scanner.nextLine();

            try{
                in = new FileInputStream(arquivo);

                int c;

                while (( c = in.read() ) != -1){
                    System.out.print(c);
                }
            } catch (IOException e){
                System.out.println("Arquivo não encontrado, tente novamente\n");
                continue;
            } finally {
                try{
                    in.close();
                } catch (IOException e){
                    System.out.println("sei la");
                }
            }
            break;
        }

    }
}
