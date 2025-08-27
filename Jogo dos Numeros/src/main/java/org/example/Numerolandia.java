//Criar uma aplicacao que gere um numero aleatorio e o usuario precisa adivinhar o numero.
// Aplicacao deve dizer se o numero digitado eh maior, menor ou igual ao numero gerado.
// Quando o usuario acertar, o jogo acaba.
package org.example;

import java.util.Random;
import java.util.Scanner;

public class Numerolandia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Introdução ao usuário
        System.out.println("Por favor,digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome + "!" + " Você está jogando Numerolândia, um jogo de advinhação numérica que vai de 0 a 100.");

        //Gerando números aleatórios
        Random r = new Random();
        int numeroAleatorio = r.nextInt(101);

        int advinhacao = 0;
        int tentativas = 0;

        //Advinhação
        do {
            System.out.println("Qual foi o número gerado?  Tente advinhar!");
            advinhacao = scanner.nextInt();
            tentativas++;
            if (advinhacao < numeroAleatorio) {
                System.out.println("O número gerado é maior. Tente de novo");
            } else if (advinhacao > numeroAleatorio) {
                System.out.println("O número gerado é menor. Tente mais uma vez");
            } else {
                System.out.println("Parabéns! VOCÊ ACERTOU!");
                System.out.println("Você precisou de " + tentativas + " tentativas.");
            }
        } while (advinhacao != numeroAleatorio);

        scanner.close();
    }
}


