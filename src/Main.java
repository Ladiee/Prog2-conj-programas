public class Main {

    public static void main(String[] args) throws Exception {
        int op;

        do {
            String s = """
                    0 - Encerrar o programa
                    1 - Calculadora
                    2 - Descobridor de raizes
                    3 - Conversor
                    4 - Validador de CPF
                    Escolha um programa:""";
            System.out.println(s);

            op = pkg_calculadora.Calculadora.isInt();

            switch (op) {
                case 0:
                    System.out.println("Encerrando programa!");
                    break;
                case 1:
                    pkg_calculadora.Calculadora.menu();
                    break;
                case 2:
                    pkg_raizes_reais.Raizes_reais_menu.menu();
                    break;
                case 3:
                    pkg_conversor.Conversor.menu();
                    break;
                case 4:
                    pkg_validador_cpf.Menu_cpf.menu_cpf();
                    break;
                default:
                    System.out.println("Opção não encontrada!");
                    throw new AssertionError();
            }
        } while (op != 0);
    }
}
