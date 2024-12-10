package pkg_conversor;

public class conversoes {
    //Temperaturas
    public static double c_f (float t){
        return (t*(9/5)+32);
    }

    public static double f_c (float t){
        return ((t-32)*5/9);
    }

    public static double c_k(float t){
        return t+273.15;
    }

    public static double k_c (float t){
        return t-273.15;
    }

    public static double k_f (float t){
        return ((t-273.15)*9/5+32);
    }

    public static double f_k (float t){
        return ((t-32)*5/9+273.15);
    }

    //Moedas
    

    //Comprimentos
    public static double m_cm (float m){
        return m*100;
    }

    public static double cm_m (float m){
        return m/100;
    }

    public static double m_mm (float m){
        return m*1000;
    }

    public static double mm_m (float m){
        return m/1000;
    }

    public static double cm_pes (float m){
        return m/30.48;
    }

    public static double pol_pes (float m){
        return m/12;
    }
    public static double cm_pol (float m){
        return 
    }


    //Massas
    public static double kg_g (float q){
        return q*1000;
    }

    public static double g_kg (float q){
        return q/1000;
    }

    public static double g_lib (float q){
        return q/0.45359237;
    }

    public static double lib_g (float q){
        return q/0.45359237;
    }
}