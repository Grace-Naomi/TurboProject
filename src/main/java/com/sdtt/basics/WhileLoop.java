package com.sdtt.basics;

public class WhileLoop {


    public static void main(String[] args) {
        int a = 10;
        int b=20;

        while (a<20){
            System.out.println(a);
            a++;
        }

        System.out.println("***********************************");

        do{
            System.out.println(a);
            a++;
            System.out.println(a);
        }while (a<19);

        
    }
}
