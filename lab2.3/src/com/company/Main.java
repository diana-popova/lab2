package com.company;

public class Main {
    private static int step = 0;

    public static void m(int x){
        System.out.println("Перед: " + "x = " + x);
        step++;
        if((2*x + 1)< 20){
            m(2*x + 1);
        }
        step--;
        System.out.println("После: " + "x = " + x);
    }

    public static void space(){
        for(int i = 0; i<step; i++){
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
	    m(1);
    }
}
