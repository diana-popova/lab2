package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Результат: "+divide_x(-3, -1, 2));
    }
    public static double f(double x)
    {
        return Math.pow(x, 3)+ Math.pow(2*x, 2) - 5*x -6;
    }

    public static double divide_x(double a, double b, double e)
    {
        double c=(a+b)/2;
        if (b-a <= e) return c;
        if (f(a)*f(c) < 0) return divide_x(a,c,e);
        else if (f(a)*f(c) > 0) return divide_x(c,b,e);
        else return c;
    }
}
