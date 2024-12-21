//Esse pacote contem todos os metodos que serão utilizados pela calculadora
package pkg_calculadora;

public class Operacoes {
    private double result;

    public double somar(double n1, double n2){ 
        this.result = n1+n2;
        return this.result;
    } 
    
    public double subtrair(double n1, double n2){
        this.result = n1-n2;
        return this.result;
    }

    public double multiplicar(double n1, double n2){
        this.result = n1*n2;
        return this.result;
    }

    public double dividir(double n1, double n2){
        this.result = n1/n2;
        return this.result;
    }

    public double piso(double n1){
        this.result = Math.floor(n1);
        return this.result;
    }

    public double teto(double n1){
        this.result = Math.ceil(n1);
        return this.result;
    }

    public double raiz_grau_n(double n1, double x){
        this.result = Math.pow(n1, 1/x);
        return this.result;
    }
        
    public double Expo(double n, double x){
        double res = Math.pow(n, x);
        return res;
    }

    public int div_int(double n1, double n2){
        double res = (n1/n2);
        return (int) res;
    }
    
    public double resto_div(double n1, double n2){
        double res = n1%n2;
        return res;
    }
    
    public double fatorial(double n){
        double res=1;
        for (int i= (int) n; i>=1; i--){
            res *= i;
        }
        return res;
    }
    
    public boolean valida_primos(double n){
        for (int i=2; i<n; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    
    public boolean quadrado_perfeito(double n){
        double raiz = Math.sqrt(n);
        boolean res = (raiz*raiz == n);
        return res;
    }

    public double arranjo (double n, double p){
        double res = (fatorial(n)/(fatorial(n-p)));
        return res;
    }

}
