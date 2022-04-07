package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Результат: "+newton(2,4));
    }
    public static double newton(double x, double e) {
        double v = f(x) / prf(x);

        if (Math.abs(v) < e) {
            return x - v;
        }
        return newton(x - v, e);
    }
    public static double f(double x) {
        return Math.pow(x,3)+Math.pow(2*x, 2) - 5*x - 6;
    }

    public static double prf(double x) {
        return Math.pow(3*x, 2) + 4*x - 5;
    }
}

