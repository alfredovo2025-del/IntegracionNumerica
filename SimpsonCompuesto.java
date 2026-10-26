package dif_e_Integracion;

public class SimpsonCompuesto {

    private static double calcularSimpson(
            double a,
            double b,
            int n) {

        double h =
                TrapecioCompuesto.calcularH(a, b, n);

        double sumaImpares = 0.0;
        double sumaPares = 0.0;

        for (int k = 1; k < n; k++) {

            double xk = a + k * h;

            if (k % 2 == 0) {
                sumaPares +=
                        TrapecioCompuesto.funcion(xk);
            } else {
                sumaImpares +=
                        TrapecioCompuesto.funcion(xk);
            }
        }

        double sumaTotal =
                TrapecioCompuesto.funcion(a)
                        + 4 * sumaImpares
                        + 2 * sumaPares
                        + TrapecioCompuesto.funcion(b);

        return (h / 3.0) * sumaTotal;
    }

    public static double integrarConTolerancia(
            double a,
            double b,
            double tolerancia) {

        int n = 2;

        double integralAnterior =
                calcularSimpson(a, b, n);

        double errorAbsoluto = Double.MAX_VALUE;

        while (errorAbsoluto > tolerancia) {

            n *= 2;

            double integralNueva =
                    calcularSimpson(a, b, n);

            errorAbsoluto =
                    Math.abs(integralNueva - integralAnterior);

            integralAnterior = integralNueva;
        }

        System.out.println("\nSimpson Compuesto");
        System.out.println("n final = " + n);
        System.out.println("Resultado = " + integralAnterior);

        return integralAnterior;
    }
}
