public class Banco {

    public void realizarOperacao() {
        ContaBancaria c = new ContaBancaria(1000);

        try {
            c.sacar(300);
            System.out.println("Saque foi realizado com sucesso");

        } catch (Exception e) {
            System.out.println("Ocorreu um erro no saque: " + e.getMessage());
        }

        System.out.println(c.getSaldo());
    }

    }

