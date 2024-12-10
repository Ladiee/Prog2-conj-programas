package pkg_calculadora;

public class Operacoes {
    //public float n1, n2;

    public static float somar(float n1, float n2){ 
        float result = n1+n2;
        return result;
    } 
    
    public static float subtrair(float n1, float n2){
        float result = n1-n2;
        return result;
    }

    public static float multiplicar(float n1, float n2){
        float result = n1*n2;
        return result;
    }

    public static float dividir(float n1, float n2){
        float result = n1/n2;
        return result;
    }

    public static double piso(float n1){
        double result = Math.floor(n1);
        return result;
    }

    public static double teto(float n1){
        double result = Math.ceil(n1);
        return result;
    }

    public static double raiz_grau_n(float n1, float x){
        double result = Math.pow(n1, 1/x);
        return result;
    }
        
    public static double Expo(float n, float x){
        double res = Math.pow(n, x);
        return res;
    }

    public static int div_int(float n1, float n2){
        double res = (n1/n2);
        return (int) res;
    }
    
    public static float resto_div(float n1, float n2){
        float res = n1%n2;
        return res;
    }
    
    public static double fatorial(float n){
        double res=1;
        for (int i= (int) n; i>=1; i--){
            res *= i;
        }
        return res;
    }
    
    public static boolean valida_primos(float n){
        for (int i=2; i<n; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static boolean quadrado_perfeito(float n){
        double raiz = Math.sqrt(n);
        boolean res = (raiz*raiz == n);
        return res;
    }

    public static double arranjo (float n, float p){
        double res = (fatorial(n)/(fatorial(n-p)));
        return res;
    }

}
