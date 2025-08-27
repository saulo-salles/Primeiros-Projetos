import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numero = scanner.nextInt();

        identificarNum(numero);
    }

    public static void identificarNum( int numero){
        if (numero % 2 == 0) {
            System.out.println("O numero " + numero + " e par");
        } else {
            System.out.println("O numero " + numero + " e impar");
        }
    }
}


