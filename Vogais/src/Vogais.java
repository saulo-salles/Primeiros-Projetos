import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vogais {

    private static final String VOGAIS = "aeiouAEIOU";

    public static void main(String[] args) {
        imprimirVogais();
    }


    public static void imprimirVogais() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva uma palavra:");
        var palavra = scanner.nextLine();

        List<Character> vogaisPalavra = new ArrayList<>();

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);

            // Ao inves de imprimir cada letra, armazenar numa coleçao e entao imprimir depois do loop
            if (VOGAIS.contains(String.valueOf(letra))) {
                vogaisPalavra.add(letra);
            }
        }
        if (!vogaisPalavra.isEmpty()) {
            System.out.println(vogaisPalavra);
        } else {
                System.out.println("A palavra \"" + palavra + "\" nao contem nenhuma vogal");
            }
        }
}


