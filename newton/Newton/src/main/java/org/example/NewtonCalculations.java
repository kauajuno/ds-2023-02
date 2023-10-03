package org.example;

public class NewtonCalculations {
    public static double ApproximateSQRT(double num, double errorMargin){
        if (num < 0) {
            throw new IllegalArgumentException("Não é possível calcular raiz quadrada para números negativos");
        }

        if (num == 0) {
            return 0;
        }

        double x0 = num, x1;

        do {
            x1 = 0.5 * (x0 + num / x0);
            x0 = x1;
        } while (Math.abs(x1 * x1 - num) > errorMargin);

        return x1;

    }
}
