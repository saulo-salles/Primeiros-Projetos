public class Aplicacao {
    public static void main(String[] args) {

        ResultadoBhaskara r = new ResultadoBhaskara();

        double a = 1.7;
        double b = 3;
        double c = 2.4;

        Matematica.calcularBhaskara(a, b, c, r);

        System.out.println("r1 = " + r.getR1());
        System.out.println("r2 = " + r.getR2());
    }

    }
