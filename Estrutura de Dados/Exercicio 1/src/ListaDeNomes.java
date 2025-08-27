import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Criar um programa que armazene e exiba uma lista de nomes usando um array..
public class ListaDeNomes {
    List<String> nomes = new ArrayList<>();
    public static void main(String[] args) {
        String opcao;
        ListaDeNomes listaDeNomes = new ListaDeNomes();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menu | Lista de Nomes");
            System.out.println("Escolha a opção desejada:");
            System.out.println("1 - Adicionar nome.");
            System.out.println("2 - Mostrar Lista de Nomes");
            System.out.println("3 - Sair.");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Digite um nome:");
                    String nome = scanner.nextLine();
                    listaDeNomes.nomes.add(nome);
                    System.out.println("Nome armazenado com sucesso");
                    break;
                case "2":
                    System.out.println(listaDeNomes.nomes);
                    break;
                case "3":
                    System.out.println("Saindo do programa");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        } while (!opcao.equals("3"));

    }
}
