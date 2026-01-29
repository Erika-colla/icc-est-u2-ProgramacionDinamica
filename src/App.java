import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) throws Exception {
       System.out.println("--- Comparación de Rendimiento ---");
    
    Fibonacci fib = new Fibonacci();
    int n = 47; 

    // 1. Top-Down (Recursión + Memoización)
    long resTD = medirTIempo(() -> fib.fubonacciTD(n));
    System.out.println("Top-Down Resultado: " + resTD);

    // 2. Bottom-Up (Iterativo / Tabulación)
    long resBU = medirTIempo(() -> fib.fibonacciBu(n));
    System.out.println("Bottom-Up Resultado: " + resBU);
    }

    
    private static <T> T timeFunction(Callable<T> function) throws Exception {
        long startTime = System.nanoTime();
        
       
        T resultado = function.call(); 
        
        long endTime = System.nanoTime();
        System.out.println("Tiempo (nanos): " + (endTime - startTime));
        return resultado;
    }

    public static <T> T medirTIempo(Supplier<T> funcion) {
        long startTime = System.nanoTime();
        
        T resultado = funcion.get();
        
        long endTime = System.nanoTime();
       
        System.out.println("Tiempo (milisegundos): " + (endTime - startTime) / 1_000_000_000.0);
        return resultado;
    }
    public long fibonacciBuOptimized(int n) {
    if (n <= 1) return n;
    
    long prev2 = 0; // f(n-2)
    long prev1 = 1; // f(n-1)
    long current = 0;
    
    for (int i = 2; i <= n; i++) {
        current = prev1 + prev2;
        prev2 = prev1;
        prev1 = current;
    }
    return current;
}
}