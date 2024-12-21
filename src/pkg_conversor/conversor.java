package pkg_conversor;

public class Conversor {
    static int op, op2;

    public static void menu() {
        do {
            System.out.println("________MENU________");
            String string = """
                    0 - Sair do conversor
                    1 - Temperatura
                    2 - Moedas
                    3 - Comprimento
                    4 - Massa
                    Escolha uma operação: """;
            System.out.println(string);

            op = pkg_calculadora.Calculadora.isInt();

            // Menus
            if (op == 0) {
                System.err.println("Encerrando o conversor!");
            }

            else if (op == 1) {// menu temperatura
                String string2 = """
                        1 - Celsius -> Fahrenheit
                        2 - Celsius -> Kelvin
                        3 - Fahrenheit -> Celsius
                        4 - Fahrenheit -> Kelvin
                        5 - Kelvin -> Celsius
                        6 - Kelvin -> Fahrenheit
                        Escolha uma opção: """;
                System.out.println(string2);

                System.out.println("Informe a opção: ");
                op2 = pkg_calculadora.Calculadora.isInt();

                System.out.println("Informe o valor: ");
                try {
                    double n = pkg_calculadora.Calculadora.isDouble();
                    switch (op2) {
                        case 1 -> System.out.println(pkg_conversor.Conversoes.c_f(n));
                        case 2 -> System.out.println(pkg_conversor.Conversoes.c_k(n));
                        case 3 -> System.out.println(pkg_conversor.Conversoes.f_c(n));
                        case 4 -> System.out.println(pkg_conversor.Conversoes.f_k(n));
                        case 5 -> System.out.println(pkg_conversor.Conversoes.k_c(n));
                        case 6 -> System.out.println(pkg_conversor.Conversoes.k_f(n));
                    }
                } catch (Exception e) {
                    System.out.println("Algo deu errado! Tente novamente.");
                }

            }

            else if (op == 2) {
                ConversorMoeda c = new ConversorMoeda();

                System.out.println(c.conversorMoeda());
            }

            else if (op == 3) { // menu dos comprimentos
                String string2 = """
                        1 - Metros -> Centímetros
                        2 - Metros -> Milímetros
                        3 - Metros -> Polegadas
                        4 - Metros -> Pés
                        5 - Centímetros -> Metros
                        6 - Centímetros -> Milímetros
                        7 - Centímetros -> Polegadas
                        8 - Centímetros -> Pés
                        9 - Milímetros -> Metros
                        10 - Milímetros -> Centímetros
                        11 - Milímetros -> Polegadas
                        12 - Milímetros -> Pés
                        13 - Polegadas -> Metros
                        14 - Polegadas -> Centímetros
                        15 - Polegadas -> Milímetros
                        16 - Polegadas -> Pés
                        17 - Pés -> Metros
                        18 - Pés -> Centímetros
                        19 - Pés -> Milímetros
                        20 - Pés -> Pés
                        Escolha uma opção: """;
                System.out.println(string2);

                System.out.println("Informe a opção: ");
                op2 = pkg_calculadora.Calculadora.isInt();

                System.out.println("Informe o valor: ");
                try {
                    double n = pkg_calculadora.Calculadora.isDouble();
                    switch (op2) {
                        case 1 -> System.out.println(pkg_conversor.Conversoes.m_cm(n));
                        case 2 -> System.out.println(pkg_conversor.Conversoes.m_mm(n));
                        case 3 -> System.out.println(pkg_conversor.Conversoes.m_pol(n));
                        case 4 -> System.out.println(pkg_conversor.Conversoes.m_pes(n));
                        case 5 -> System.out.println(pkg_conversor.Conversoes.cm_m(n));
                        case 6 -> System.out.println(pkg_conversor.Conversoes.cm_mm(n));
                        case 7 -> System.out.println(pkg_conversor.Conversoes.cm_pol(n));
                        case 8 -> System.out.println(pkg_conversor.Conversoes.cm_pes(n));
                        case 9 -> System.out.println(pkg_conversor.Conversoes.mm_m(n));
                        case 10 -> System.out.println(pkg_conversor.Conversoes.mm_cm(n));
                        case 11 -> System.out.println(pkg_conversor.Conversoes.mm_pol(n));
                        case 12 -> System.out.println(pkg_conversor.Conversoes.mm_pes(n));
                        case 13 -> System.out.println(pkg_conversor.Conversoes.pol_m(n));
                        case 14 -> System.out.println(pkg_conversor.Conversoes.pol_cm(n));
                        case 15 -> System.out.println(pkg_conversor.Conversoes.pol_mm(n));
                        case 16 -> System.out.println(pkg_conversor.Conversoes.pol_pes(n));
                        case 17 -> System.out.println(pkg_conversor.Conversoes.pes_m(n));
                        case 18 -> System.out.println(pkg_conversor.Conversoes.pes_cm(n));
                        case 19 -> System.out.println(pkg_conversor.Conversoes.pes_mm(n));
                        case 20 -> System.out.println(pkg_conversor.Conversoes.pes_pol(n));
                    }
                } catch (Exception e) {
                    System.out.println("Algo deu errado! Tente novamente.");
                }
            }

            else if (op == 4) {// Menu de massa
                String string2 = """
                        1 - Kg -> Gramas
                        2 - Kg -> Libras
                        3 - Gramas -> Kg
                        4 - Gramas -> Libras
                        5 - Libras -> Kg
                        6 - Libras -> Gramas
                        Escolha uma opção: """;
                System.out.println(string2);

                System.out.println("Informe a opção: ");
                op2 = pkg_calculadora.Calculadora.isInt();

                System.out.println("Informe o valor: ");
                try {
                    double n = pkg_calculadora.Calculadora.isDouble();
                    switch (op2) {
                        case 1 -> System.out.println(pkg_conversor.Conversoes.kg_g(n));
                        case 2 -> System.out.println(pkg_conversor.Conversoes.kg_lib(n));
                        case 3 -> System.out.println(pkg_conversor.Conversoes.g_kg(n));
                        case 4 -> System.out.println(pkg_conversor.Conversoes.g_lib(n));
                        case 5 -> System.out.println(pkg_conversor.Conversoes.lib_kg(n));
                        case 6 -> System.out.println(pkg_conversor.Conversoes.lib_g(n));
                    }
                } catch (Exception e) {
                    System.out.println("Algo deu errado! Tente novamente.");
                }
            } else
                System.out.println("Opção não encontrada!");
        } while (op != 0);
    }
}
