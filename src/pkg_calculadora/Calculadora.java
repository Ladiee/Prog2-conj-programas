package pkg_calculadora;

import java.util.Scanner;

public class Calculadora {
    static float n1, n2;
	static int op;
    
        public static void menu(){
            Scanner input = new Scanner(System.in);
    
            System.out.println("________MENU________");
            String string = """
                    1 - Soma
                    2 - Subtração
                    3 - Multiplicação
                    4 - Divisão
                    5 - Piso
                    6 - Teto
                    7 - Raiz quadrada
                    8 - Potência quadrática
                    Escolha uma operação: """;
            System.out.println(string);
    
            op = input.nextInt();  
        
        if (op == 0) {
            System.err.println("Encerrando Programa!");
        } else if (op>4 && op <=8) {
            System.out.println("Informe um valor:");
            try {
                n1 = input.nextFloat();
                switch (op) {
                    case 5 -> System.out.println(pkg_calculadora.Operacoes.piso(n1));
                    case 6 -> System.out.println(pkg_calculadora.Operacoes.teto(n1));
                    case 7 -> System.out.println(pkg_calculadora.Operacoes.raiz(n1));
                    case 8 -> System.out.println(pkg_calculadora.Operacoes.potencia(n1));
                }
            } catch (ArithmeticException e) {
              
            } catch (Exception e){
                System.out.println("Algo deu errado! Tente novamente.");
            }

        } else if (op>=1 && op<=4){
            System.out.println("Informe os valores:");
            try {
                n1 = input.nextFloat();
                n2 = input.nextFloat();

                switch(op){
                    case 1 -> System.out.println(pkg_calculadora.Operacoes.somar(n1,n2));
                    case 2 -> System.out.println(pkg_calculadora.Operacoes.subtrair(n1,n2));
                    case 3 -> System.out.println(pkg_calculadora.Operacoes.multiplicar(n1, n2));
                    case 4 -> System.out.println(pkg_calculadora.Operacoes.dividir(n1, n2));
                }
            } catch (Exception e) {
                System.out.println("Algo deu errado! Tente novamente.");
            }
        } else {
            System.out.println("Opção não encontrada!");
        }
    input.close();
    }
        
}
