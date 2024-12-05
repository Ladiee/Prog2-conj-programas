package pkg_calculadora;

import java.util.Scanner;

public class Calculadora {
    static float n1, n2;
	static int op;
    
    public static void menu(){
        try(Scanner input = new Scanner(System.in)){
            do { 
                System.out.println("________MENU________");
                String string = """
                        1 - Soma
                        2 - Subtração
                        3 - Multiplicação
                        4 - Divisão
                        5 - Exponenciação
                        6 - Divisão inteira
                        7 - Resto da divisão
                        8 - Arranjos
                        9 - Raiz de grau n
                        10 - Fatorial
                        11 - Permutação
                        12 - Piso
                        13 - Teto
                        14 - Validador de números primos
                        15 - Validador de quadrado perfeito
                        Escolha uma operação: """;
                System.out.println(string);
        
                op = input.nextInt();  
            
                if (op == 0) {
                    System.err.println("Encerrando Programa!");

                } else if (op>=1 && op<=9) {
                    System.out.println("Informe os valores:");
                    try {
                        n1 = input.nextFloat();
                        n2 = input.nextFloat();
                        switch (op) {
                            case 1 -> System.out.println(pkg_calculadora.Operacoes.somar(n1,n2));
                            case 2 -> System.out.println(pkg_calculadora.Operacoes.subtrair(n1,n2));
                            case 3 -> System.out.println(pkg_calculadora.Operacoes.multiplicar(n1, n2));
                            case 4 -> System.out.println(pkg_calculadora.Operacoes.dividir(n1, n2));
                            case 5 -> System.out.println(pkg_calculadora.Operacoes.Expo(n1,n2));
                            case 6 -> System.out.println(pkg_calculadora.Operacoes.div_int(n1, n2));
                            case 7 -> System.out.println(pkg_calculadora.Operacoes.resto_div(n1, n2));
                            case 8 -> System.out.println(pkg_calculadora.Operacoes.arranjo(n1, n2));
                            case 9 -> System.out.println(pkg_calculadora.Operacoes.raiz_grau_n(n1, n2));
                        }
                    } catch (ArithmeticException e) {
                        System.out.println("Algo deu errado! Tente novamente.");
                    } catch (Exception e){
                        System.out.println("Algo deu errado! Tente novamente.");
                    }

                } else if (op>9 && op <=15){
                    System.out.println("Informe o valor:");
                    try {
                        n1 = input.nextFloat();
                        switch(op){
                            case 10 -> System.out.println(pkg_calculadora.Operacoes.fatorial(n1));
                            case 11 -> System.out.println(pkg_calculadora.Operacoes.fatorial(n1));
                            case 12 -> System.out.println(pkg_calculadora.Operacoes.piso(n1));
                            case 13 -> System.out.println(pkg_calculadora.Operacoes.teto(n1));
                            case 14 -> System.out.println(pkg_calculadora.Operacoes.valida_primos(n1));
                            case 15 -> System.out.println(pkg_calculadora.Operacoes.quadrado_perfeito(n1));
                        }
                    } catch (Exception e) {
                        System.out.println("Algo deu errado! Tente novamente.");
                    }
                } else {
                    System.out.println("Opção não encontrada!");
                }
            }while (op!=0);
        } 
    }      
}
