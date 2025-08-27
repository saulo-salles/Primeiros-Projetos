import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {

        int numero = 0;

        identificarNumero(numero);
    }

    public static void identificarNumero(int numero) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número de sua escolha:");
        numero = scanner.nextInt();

        //Identificando par..
        if (numero % 2 == 0) {
            System.out.println("Esse número é Par");
        } else {
            System.out.println("Esse número é Ímpar");
        }

        //Identificando binario..
        String numeroStr = String.valueOf(numero);
        if (numeroStr.contains("1") && numeroStr.contains("0")) {
            System.out.println("O número é Binário");
        } else {
            System.out.println("O número NÃO é Binário");
        }

        //Identificando primos..
        if (numero % 2 != 0 && numero % 3 != 0) {
            System.out.println("O número é Primo");
        } else {
            System.out.println("Esse número NÃO é Primo");
        }
    }

    //Identificando palindromos..

    public static boolean isPalindromo(int numero) {





    }
}











