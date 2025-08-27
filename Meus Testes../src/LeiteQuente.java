public class LeiteQuente extends Bebidas {

    public LeiteQuente() {
        super("Leite quente", true);
    }

    @Override
    public void preparar() {
        System.out.println("Pegando um copo");
        System.out.println("Colocando o leite no copo");
    }
}

