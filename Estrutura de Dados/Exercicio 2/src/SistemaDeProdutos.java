import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Criar um sistema simples que usa ArrayList para cadastrar produtos e exibir a lista completa..
public class    SistemaDeProdutos {
    List<String> listaProdutos = new ArrayList<>();

    public static void main(String[] args) {
        String nome;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seja bem-vindo(a) ao Sistema para Cadastro de Produtos");
        System.out.println("Por gentileza, digite seu nome:");
        nome = scanner.nextLine();

        //Menu
        System.out.println("Olá, " + nome + "." + " Escolha a opção desejada:");
        SistemaDeProdutos sistemaDeProdutos = new SistemaDeProdutos();
        String produtos;
        String escolha;

        do {
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Exibir Lista de Produtos");
            System.out.println("3 - Fechar Sistema");
            escolha = scanner.nextLine();




            switch (escolha) {
                case "1":
                    System.out.println("Digite um produto para cadastrá-lo:");
                    produtos = scanner.nextLine();
                    sistemaDeProdutos.listaProdutos.add(produtos);
                    System.out.println("Produto cadastrado!");
                    break;

                case "2":
                    System.out.println(sistemaDeProdutos.listaProdutos);
                    break;

                case "3":
                    System.out.println("Fechando sistema..");
                    break;
            }
        } while (!escolha.equals("3"));

    }
}
