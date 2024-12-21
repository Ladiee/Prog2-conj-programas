package pkg_raizes_reais;

import java.util.Scanner;

public class Raizes_reais_menu {
    public static void menu() {
        Scanner saida = new Scanner(System.in);

        Raizes_reais r = new Raizes_reais();

        while (true) {
            System.out.println("________MENU________");
            String string = """
                    1 - Realizar Equação
                    2 - Sair
                    Escolha uma opção:  """;
            System.out.println(string);
            String op = saida.nextLine();
            System.out.println();

            if (op.equals("2")) {
                System.out.println("Saindo do menu de equações do segundo grau!");
                break;
            } else if (op.equals("1")) {
                System.out.print("Digite a equação: ");
                String exp = saida.nextLine();
                System.out.println();

                r.setExp(exp);

                r.raizesReais();
                System.out.println();
            } else {
                System.out.println("Algo deu errado! Tente novamente!");
                System.out.println();
            }

        }

        saida.close();
    }
}