package pkg_conversor;

import java.util.Scanner;//Biblioteca utilizada para usar o input

public class ConversorMoeda {
    private double valor; // Atributo para guardar o valor do dinheiro
    private String estadoAtual;// Atributo para saber se o valor atual esta em dolár, reais, etc.
    private String op;// Atributo para utilizar qual operação de conversão será feito

    public ConversorMoeda() {
    }

    public double conversorMoeda() { // Input do usuário para saber em que estado está o dinheiro
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("________MENU________");
            String string = """
                    O valor está em:
                    d - Dólar
                    e - Euro
                    r - Real
                    l - Libra
                             """;
            System.out.println(string);

            String estado = input.next();

            this.estadoAtual = estado; // Guardando o valor na variável estadoAtual

            System.out.println("________MENU________");
            String string2 = """
                    O valor é quanto?
                            """;
            System.out.println(string2);

            Double valorEntrada = input.nextDouble();// Input para saber qual o valor que será armazenado na variável
                                                     // valor

            this.valor = valorEntrada;

            System.out.println("________MENU________");
            String string3 = """
                    A sua conversão será:
                    d - Dólar
                    e - Euro
                    r - Real
                    l - Libra
                            """;
            System.out.println(string3);

            String operacao = input.next(); // Input para saber qual operação de conversão será feita

            this.op = operacao;
        } catch (Exception e) {
            System.out.println("Algo deu errado! Tente novamente.");
        }

        System.out.println("Valor: " + this.valor);

        double retorno = 0;
        if (this.estadoAtual.equals("d")) {
            retorno = dolar();
        } else if (this.estadoAtual.equals("r")) { // De acordo com o estado atual do valor, será efetuado o método do
                                                   // mesmo
            retorno = reais();
        } else if (this.estadoAtual.equals("e")) {
            retorno = euro();
        } else if (this.estadoAtual.equals("l")) {
            retorno = libra();
        }
        return retorno;

    }

    public double dolar() { // Método dólar, para fazer a conversão do dólar para o valor de acordo com a
                            // variável op
        if (this.op.equals("d")) {
            return this.valor;
        } else if (this.op.equals("r")) {// Exemplo, se a operação de conversão desejada seja em reais,
            this.valor = (double) (this.valor * 6);// será feita a multiplicação, ou seja, a conversção de dólar para
                                                   // reais,
            this.estadoAtual = "r"; // nesse caso, multiplicado por 6.
            return this.valor;
        } else if (this.op.equals("l")) {
            this.valor = (double) (this.valor * 0.79);
            this.estadoAtual = "l";
            return this.valor;
        } else if (this.op.equals("e")) {
            this.valor = (double) (this.valor * 0.96);
            this.estadoAtual = "e";
            return this.valor;
        }
        return 0;
    }

    public double reais() {// Método reais, para fazer a conversão do reais para o valor de acordo com a
                           // variável op
        if (this.op.equals("r")) {
            return this.valor;
        } else if (this.op.equals("d")) {
            this.valor = this.valor * 0.16;
            this.estadoAtual = "d";
            return this.valor;
        } else if (this.op.equals("l")) {
            this.valor = (double) (this.valor * 0.13);
            this.estadoAtual = "l";
            return this.valor;
        } else if (this.op.equals("e")) {
            this.valor = (double) (this.valor * 0.15);
            this.estadoAtual = "e";
            return this.valor;
        }
        return 0;
    }

    public double libra() {// Método libra, para fazer a conversão do libra para o valor de acordo com a
                           // variável op
        if (this.op.equals("l")) {
            return this.valor;
        } else if (this.op.equals("d")) {
            this.valor = (double) (this.valor * 1.26);
            this.estadoAtual = "d";
            return this.valor;
        } else if (this.op.equals("r")) {
            this.valor = (double) (this.valor * 7.88);
            this.estadoAtual = "r";
            return this.valor;
        } else if (this.op.equals("e")) {
            this.valor = (double) (this.valor * 1.20);
            this.estadoAtual = "e";
            return this.valor;
        }
        return 0;
    }

    public double euro() {// Método euro, para fazer a conversão do euro para o valor de acordo com a
                          // variável op
        if (this.op.equals("e")) {
            return this.valor;
        } else if (this.op.equals("d")) {
            this.valor = (double) (this.valor * 1.04);
            this.estadoAtual = "d";
            return this.valor;
        } else if (this.op.equals("r")) {
            this.valor = (double) (this.valor * 6.50);
            this.estadoAtual = "r";
            return this.valor;
        } else if (this.op.equals("l")) {
            this.valor = (double) (this.valor * 0.83);
            this.estadoAtual = "l";
            return this.valor;
        }
        return 0;
    }

}