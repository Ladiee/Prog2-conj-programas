package pkg_conversor;

public class Conversoes {
    // Temperaturas
    public static double c_f(double t) {
        return (t * (9 / 5) + 32);
    }

    public static double f_c(double t) {
        return ((t - 32) * 5 / 9);
    }

    public static double c_k(double t) {
        return t + 273.15;
    }

    public static double k_c(double t) {
        return t - 273.15;
    }

    public static double k_f(double t) {
        return ((t - 273.15) * 9 / 5 + 32);
    }

    public static double f_k(double t) {
        return ((t - 32) * 5 / 9 + 273.15);
    }

    // Moedas

    // Comprimentos
    public static double m_cm(double m) {
        return m * 100;
    }

    public static double m_mm(double m) {
        return m * 1000;
    }

    public static double m_pol(double m) {
        return m * 39.37;
    }

    public static double m_pes(double m) {
        return m * 3.28084;
    }

    public static double mm_m(double m) {
        return m / 1000;
    }

    public static double mm_cm(double m) {
        return m_cm(mm_m(m));
    }

    public static double mm_pes(double m) {
        return m_pes(mm_m(m));
    }

    public static double mm_pol(double m) {
        return m_pol(mm_m(m));
    }

    public static double cm_m(double m) {
        return m / 100;
    }

    public static double cm_mm(double m) {
        return m_mm(cm_m(m));
    }

    public static double cm_pol(double m) {
        return m_pol(cm_m(m));
    }

    public static double cm_pes(double m) {
        return m / 30.48;
    }

    public static double pes_m(double m) {
        return m / 3.28084;
    }

    public static double pes_mm(double m) {
        return m_mm(pes_m(m));
    }

    public static double pes_cm(double m) {
        return m_cm(pes_m(m));
    }

    public static double pes_pol(double m) {
        return m * 12;
    }

    public static double pol_m(double m) {
        return m / 39.37;
    }

    public static double pol_mm(double m) {
        return m_mm(pol_m(m));
    }

    public static double pol_cm(double m) {
        return m_cm(pol_m(m));
    }

    public static double pol_pes(double m) {
        return m / 12;
    }

    // Massas
    public static double kg_g(double q) {
        return q * 1000;
    }

    public static double g_kg(double q) {
        return q / 1000;
    }

    public static double g_lib(double q) {
        return q * 0.0022046;
    }

    public static double lib_g(double q) {
        return q / 0.0022046;
    }

    public static double kg_lib(double q) {
        return g_lib(kg_g(q));
    }

    public static double lib_kg(double q) {
        return g_kg(lib_g(q));
    }
}