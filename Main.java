package dif_e_Integracion;

public class Main {

    public static void main(String[] args) {

        double a = 0.0;
        double b = Math.PI;
        double tolerancia = 0.00001;

        System.out.println("INTEGRACION NUMERICA");
        System.out.println("----------------------");

        TrapecioCompuesto.integrarConTolerancia(
                a,
                b,
                tolerancia);

        SimpsonCompuesto.integrarConTolerancia(
                a,
                b,
                tolerancia);
    }
}
