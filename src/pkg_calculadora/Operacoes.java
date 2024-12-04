package pkg_calculadora;

public class Operacoes {
    public float n1, n2;

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

    public static double raiz(float n1){
        double result = Math.sqrt(n1);
        return result;
    }

    public static float potencia(float n1){
        float result = n1*n1;
        return result;
    }
    
}
