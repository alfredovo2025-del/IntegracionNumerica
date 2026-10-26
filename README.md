# dif_e_Integracion - Integración Numérica Compuesta

Proyecto de Métodos Numéricos - ITSX. Implementación de las reglas del Trapecio y Simpson 1/3 compuestas con refinamiento automático por tolerancia.

## 📦 Contenido
- `dif_e_Integracion/TrapecioCompuesto.java` - Clase base con `funcion()` y `calcularH()`
- `dif_e_Integracion/SimpsonCompuesto.java` - Implementación Simpson (depende de TrapecioCompuesto)
- `dif_e_Integracion/Main.java` - Programa principal comparativo

## 📐 Fundamento
`h = (b-a)/n`

Trapecio: `Tn = h/2 * [f(a) + f(b) + 2*sum(f(xi))]`
Simpson: `Sn = h/3 * [f(a) + f(b) + 4*sum(impares) + 2*sum(pares)]`

Criterio de paro: `|I_2n - I_n| < tolerancia`. n se duplica cada iteración, garantizando n par para Simpson.

## 🚀 Compilación y Ejecución

Requisitos: JDK 8 o superior

```bash
# Clonar repositorio
git clone https://github.com/TU_USUARIO/dif_e_Integracion.git
cd dif_e_Integracion

# Compilar
javac dif_e_Integracion/*.java

# Ejecutar
java dif_e_Integracion.Main
return Math.sin(x); // o return x*x;

