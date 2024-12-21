package pkg_calculadora;

import java.util.Scanner;

public class Calculadora {
    static double n1, n2;
	static int op;
    
    public static int isInt (){ // Recebe apenas entradas inteiras
        Scanner in = new Scanner(System.in);

        while(!in.hasNextInt()) { 
            in.next();
            System.out.println("Entrada inválida. Insira um inteiro: ");
        }
        int n = in.nextInt();

        return n; 
    }

    public static double isDouble(){ // Recebe apenas entradas de ponto flutuante
        Scanner in = new Scanner (System.in);

        while(!in.hasNextDouble()) {//Enquanto a entrada não for um double, ela e ignorada
            in.next();
            System.out.println("Entrada inválida. Insira um inteiro: ");
        }
        double n = in.nextDouble();

        return n; 
    }

    public static void menu(){
            do { 
                Operacoes calc = new Operacoes();

                System.out.println("________MENU________");
                String string = """
                        0 - Sair da calculadora
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
                
                op = isInt();  
            
                if (op == 0) {
                    System.err.println("Encerrando a calculadora!");

                } else if (op>=1 && op<=9) { //Esse intervalo corresponde aos metodos de dois parametros
                    System.out.println("Informe os valores:");
                    try {
                        n1 = isDouble();
                        n2 = isDouble();
                        switch (op) {
                            case 1 -> System.out.println(calc.somar(n1, n2));
                            case 2 -> System.out.println(calc.subtrair(n1,n2));
                            case 3 -> System.out.println(calc.multiplicar(n1, n2));
                            case 4 -> System.out.println(calc.dividir(n1, n2));
                            case 5 -> System.out.println(calc.Expo(n1,n2));
                            case 6 -> System.out.println(calc.div_int(n1, n2));
                            case 7 -> System.out.println(calc.resto_div(n1, n2));
                            case 8 -> System.out.println(calc.arranjo(n1, n2));
                            case 9 -> System.out.println(calc.raiz_grau_n(n1, n2));
                        }
                    } catch (ArithmeticException e) {
                        System.out.println("Algo deu errado aritmeticamente! Tente novamente.");
                    } catch (Exception e){
                        System.out.println("Algo deu errado! Tente novamente.");
                    }

                } else if (op>9 && op <=15){ //Esse intervalo corresponde aos metodos de um parametro
                    System.out.println("Informe o valor:");
                    try {
                        n1 = isDouble();
                        switch(op){
                            case 10 -> System.out.println(calc.fatorial(n1));
                            case 11 -> System.out.println(calc.fatorial(n1));
                            case 12 -> System.out.println(calc.piso(n1));
                            case 13 -> System.out.println(calc.teto(n1));
                            case 14 -> System.out.println(calc.valida_primos(n1));
                            case 15 -> System.out.println(calc.quadrado_perfeito(n1));
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
