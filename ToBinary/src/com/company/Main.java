package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in,"cp1251");
    public static void main(String[] args) {
        System.out.println("Введите целое значение: ");
        int n = sc.nextInt();
        System.out.println("Результат:" + toBinary(n));

    }

    public static String toBinary(int n) {
        if(n <= 1){
            return Integer.toString(n);
        }
        return toBinary(n/2) + Integer.toString(n%2);
    }
}
