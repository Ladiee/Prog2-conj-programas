package pkg_conversor;

import java.util.Scanner;

public class conversor {
    static int op, op2;
    
    public static void menu(){
        try(Scanner input = new Scanner(System.in)){
            do { 
                System.out.println("________MENU________");
                String string = """
                        1 - Temperatura
                        2 - Moedas
                        3 - Comprimento
                        4 - Massa
                        Escolha uma operação: """;
                System.out.println(string);

                op = input.nextInt();

                if (op == 0) {
                    System.err.println("Saindo do menu do conversor!");

                } else if (op==1) {
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
                    op2 = input.nextInt();

                    System.out.println("Informe o valor: ");
                    try {
                        float n = input.nextFloat();
                        switch (op2) {
                            case 1 -> System.out.println(pkg_conversor.conversoes.c_f(n));
                            case 2 -> System.out.println(pkg_conversor.conversoes.c_k(n));
                            case 3 -> System.out.println(pkg_conversor.conversoes.f_c(n));
                            case 4 -> System.out.println(pkg_conversor.conversoes.f_k(n));
                            case 5 -> System.out.println(pkg_conversor.conversoes.k_c(n));
                            case 6 -> System.out.println(pkg_conversor.conversoes.k_f(n));
                        }
                    } catch (ArithmeticException e) {
                        System.out.println("Algo deu errado! Tente novamente.");
                    } catch (Exception e){
                        System.out.println("Algo deu errado! Tente novamente.");
                    }
                } else if (op==2){
                    System.out.println("Ainda não está pronto :)");
                } else if (op==3){
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
                    op2 = input.nextInt();

                    System.out.println("Informe o valor: ");
                    try {
                        float n = input.nextFloat();
                        switch (op2) {
                            case 1 -> System.out.println(pkg_conversor.conversoes.m_cm(n));
                            case 2 -> System.out.println(pkg_conversor.conversoes.m_mm(n));
                            case 3 -> System.out.println(pkg_conversor.conversoes.cm_pes((m_cm(n)));
                            case 4 -> System.out.println(pkg_conversor.conversoes.f_k(n));
                            case 5 -> System.out.println(pkg_conversor.conversoes.k_c(n));
                            case 6 -> System.out.println(pkg_conversor.conversoes.k_f(n));
                        }
                    } catch (ArithmeticException e) {
                        System.out.println("Algo deu errado! Tente novamente.");
                    }

                }

        } while (op!=0)
}
