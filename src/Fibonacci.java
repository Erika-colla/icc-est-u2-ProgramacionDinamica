import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    // Cambiado a long porque n=47 supera el límite de int
    public long fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private Map<Integer, Long> memo = new HashMap<>();

    public long fubonacciTD(int n) {
        if (n <= 1) return n;
        
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        
        long resultado = fubonacciTD(n - 1) + fubonacciTD(n - 2);
        memo.put(n, resultado);
        return resultado;
    }
    public long fibonacciBu(int n){
        if (n <= 1) return n;
        long[] dp = new long[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public int fibOptimizado(int n) {
        if (n <= 1)
            return n;

        int prev2 = 0, prev1 = 1;
        
        for (int i = 2; i <= n; i++) {
            int actual = prev1 + prev2;
            prev1 = actual;
        }

        return prev1;
    }
}