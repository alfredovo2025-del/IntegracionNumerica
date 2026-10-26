package dif_e_Integracion;

public class TrapecioCompuesto {

    // Función a integrar
    // Ejemplo: f(x) = sin(x)
    public static double funcion(double x) {
        return Math.sin(x);
    }

    public static double calcularH(double a, double b, int n) {
        return (b - a) / n;
    }

    private static double calcularTrapecio(double a, double b, int n) {

        double h = calcularH(a, b, n);

        double suma = 0.0;

        for (int i = 1; i < n; i++) {
            double xi = a + i * h;
            suma += funcion(xi);
        }

        return (h / 2.0) *
                (funcion(a) + 2 * suma + funcion(b));
    }

    public static double integrarConTolerancia(
            double a,
            double b,
            double tolerancia) {

        int n = 2;

        double integralAnterior =
                calcularTrapecio(a, b, n);

        double errorAbsoluto = Double.MAX_VALUE;

        while (errorAbsoluto > tolerancia) {

            n *= 2;

            double integralNueva =
                    calcularTrapecio(a, b, n);

            errorAbsoluto =
                    Math.abs(integralNueva - integralAnterior);

            integralAnterior = integralNueva;
        }

        System.out.println("Trapecio Compuesto");
        System.out.println("n final = " + n);
        System.out.println("Resultado = " + integralAnterior);

        return integralAnterior;
    }
}