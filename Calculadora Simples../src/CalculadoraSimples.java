import java.nio.channels.ScatteringByteChannel;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        calcularNum();
    }

    public static void calcularNum() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite mais um numero");
        double num2 = scanner.nextDouble();

        System.out.println("Digite a operaçao desejada: +, -. * ou /.");
        char operacao = scanner.next().charAt(0);


            double resultado;

            switch (operacao) {
                // Soma:
                case '+':
                    resultado = num1 + num2;
                    System.out.println("O resultado e igual a:" + resultado);
                    break;

                //Subtraçao:
                case '-':
                    resultado = num1 - num2;
                    System.out.println("O resultado e igual a:"  +  resultado);
                    break;
                //Multiplicaçao:
                case '*':
                    resultado = num1 * num2;
                    System.out.println("O resultado e igual a:"  +  resultado);
                    break;

                //Divisao:
                case '/':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("O resultado e igual a:"  +  resultado);
                    } else {
                        System.out.println("Erro! Nao e possivel dividir por 0");
                    }
                    break;

                default:
                    System.out.println("Operaçao inválida");
                            break;
            }

        }

    }

