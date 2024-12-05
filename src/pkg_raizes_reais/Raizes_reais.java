package pkg_raizes_reais;

public class Raizes_reais {
    static float a, b, c;

    public static void tratamento_expre(String exp) {
        
        
    }

    public static void raizesReais(String exp) {
        double d = Math.sqrt(b*b + 4*a*c);
        double x1 = (-b + d)/ (2*a);
        double x2 = (-b - d)/ (2*a);

        System.out.println("Raízes: " + x1 + " e " + x2);
    }
}
