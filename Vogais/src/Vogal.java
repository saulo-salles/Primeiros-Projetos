import java.util.Scanner;

public class Vogal {

    public static void imprimirVogal(String texto) {

        String vogal = texto.replaceAll("^[AEIOUaeiou]","");
        System.out.println("As vogais sao: " + vogal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase ou palavra:");
        String texto = scanner.nextLine();
        imprimirVogal(texto);
    }
}
