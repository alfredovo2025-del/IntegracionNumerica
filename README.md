# dif_e_Integracion - Integración Numérica Compuesta

Proyecto de Métodos Numéricos - ITSX
Implementación de Trapecio y Simpson compuestos con refinamiento automático por tolerancia.

## 📁 Estructura del Paquete

**Orden de pegado / compilación obligatorio:**
1. TrapecioCompuesto.java
2. SimpsonCompuesto.java
3. Main.java

## 📐 Fórmulas Implementadas

**h:**
$$ h = \frac{b-a}{n} $$

**Trapecio Compuesto - Error O(h²):**
$$ T_n = \frac{h}{2} \left[ f(a) + 2\sum_{i=1}^{n-1} f(x_i) + f(b) \right] $$

**Simpson 1/3 Compuesto - Error O(h⁴) - requiere n par:**
$$ S_n = \frac{h}{3} \left[ f(a) + 4\sum_{impares} f(x_i) + 2\sum_{pares} f(x_i) + f(b) \right] $$

**Criterio de paro automático:**
$$ |I_{2n} - I_n| < tolerancia $$

## ⚙️ Configuración

La función a integrar se cambia en **un solo lugar**:

En `TrapecioCompuesto.java`:
```java
public static double funcion(double x) {
    // Para examen Problema 6: f(x)=x²
    // return x*x;
    // Para Main actual: f(x)=sin(x)
    return Math.sin(x);
}
INTEGRACION NUMERICA

Trapecio Compuesto
n final = 1024
Resultado = 1.99999843

Simpson Compuesto
n final = 64
Resultado = 2.00000006
