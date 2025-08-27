import java.util.Scanner;

//Implementar um programa para manipulação de strings, como contar vogais e consoantes em uma frase inserida pelo usuário..
import java.util.Scanner;

class ContadorDeVogaisEConsoantes {
    public static void main(String[] args) {
        // Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar a frase do usuário
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        // Inicializar os contadores
        int numeroDeVogais = 0;
        int numeroDeConsoantes = 0;

        // Converte a frase para minúsculas para facilitar a comparação
        frase = frase.toLowerCase();

        // Itera por cada caractere da frase
        for (char c : frase.toCharArray()) {
            if (isVogal(c)) {
                numeroDeVogais++;
            } else if (isConsoante(c)) {
                numeroDeConsoantes++;
            }
        }

        // Exibir os resultados
        System.out.println("Número de vogais: " + numeroDeVogais);
        System.out.println("Número de consoantes: " + numeroDeConsoantes);

        // Fechar o scanner
        scanner.close();
    }

    // Método para verificar se um caractere é uma vogal
    public static boolean isVogal(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    // Método para verificar se um caractere é uma consoante
    public static boolean isConsoante(char c) {
        return c >= 'a' && c <= 'z' && !isVogal(c);
    }
}
