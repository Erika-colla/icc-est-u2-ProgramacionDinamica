## Análisis de Implementaciones de Fibonacci

**Estudiante:** Erika Collaguazo

**Correo Institucional:** ecollaguazom@est.ups.edu.ec

En este proyecto se comparan tres enfoques distintos para calcular la serie de Fibonacci, evaluando su rendimiento mediante mediciones de tiempo de ejecución y analizando su complejidad temporal y espacial.

El valor utilizado para la comparación es **n = 47**, lo cual permite evidenciar claramente las diferencias de rendimiento entre cada implementación.

---

### 1️. Fibonacci Top-Down (Recursión + Memoización)

**Método:** `fubonacciTD(int n)`

#### Descripción
Este enfoque utiliza recursión combinada con memoización. Los resultados de llamadas anteriores se almacenan en un `Map<Integer, Long>`, evitando cálculos repetidos y reduciendo significativamente el tiempo de ejecución.

Cada valor de Fibonacci se calcula una sola vez y luego se reutiliza.

#### Complejidad
- **Complejidad temporal:** O(n)
- **Complejidad espacial:** O(n)

#### Ventajas
- Reduce drásticamente el tiempo respecto a la recursión simple.
- Código claro y fácil de entender.
- Ejemplo representativo de programación dinámica.

#### Desventajas
- Uso adicional de memoria.
- Dependencia de la pila de llamadas recursivas.

#### Conclusión
Es una mejora eficiente frente a la recursión clásica y demuestra claramente la utilidad de la memoización.

---

### 2️. Fibonacci Bottom-Up (Tabulación)

**Método:** `fibonacciBu(int n)`

#### Descripción
Este método construye la solución de forma iterativa desde los casos base hasta el valor `n`, almacenando cada resultado en un arreglo.

No utiliza recursión.

#### Complejidad
- **Complejidad temporal:** O(n)
- **Complejidad espacial:** O(n)

#### Ventajas
- Evita el uso de recursión.
- Tiempo de ejecución eficiente.
- No presenta riesgo de desbordamiento de pila.

#### Desventajas
- Utiliza más memoria de la necesaria, ya que almacena todos los valores intermedios.

#### Conclusión
Es una solución estable y eficiente, comúnmente utilizada en problemas de programación dinámica.

---

### 3️. Fibonacci Bottom-Up Optimizado (Espacio Constante)

**Método:** `fibOptimizado(int n)`

#### Descripción
Esta versión optimiza el método Bottom-Up reduciendo el uso de memoria. En lugar de un arreglo, solo mantiene dos variables para calcular el siguiente valor de la secuencia.

#### Complejidad
- **Complejidad temporal:** O(n)
- **Complejidad espacial:** O(1)

#### Ventajas
- Uso mínimo de memoria.
- Ejecución rápida.
- Ideal para aplicaciones reales donde solo se requiere el valor final.

#### Desventajas
- No permite almacenar la secuencia completa.
- Menos intuitivo para fines didácticos.

#### Conclusión
Es la implementación más eficiente en términos de rendimiento y uso de memoria.

---

### Medición de Tiempo de Ejecución

Para la comparación de rendimiento, se utilizó el método `medirTIempo`, el cual emplea `System.nanoTime()` y expresiones lambda (`Supplier<T>`) para medir el tiempo de ejecución de cada implementación de manera uniforme.

Los tiempos se muestran en segundos, permitiendo observar claramente las diferencias de rendimiento entre los métodos.

---

| Método | Tiempo | Espacio | Observación |
|------|--------|---------|-------------|
| Top-Down (Memoización) | O(n) | O(n) | Buen enfoque para aprendizaje |
| Bottom-Up (Tabulación) | O(n) | O(n) | Solución estable |
| Bottom-Up Optimizado | O(n) | O(1) | Mejor rendimiento |

---

### Conclusión

Aunque los tres enfoques optimizados presentan complejidad temporal O(n), la versión Bottom-Up optimizada es la más eficiente en la práctica debido a su uso constante de memoria, siendo la opción recomendada para aplicaciones en producción.