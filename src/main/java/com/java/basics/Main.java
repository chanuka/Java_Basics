package com.java.basics;

public class Main {
    public static void main(String[] args) {

        int x = 4;

        for(int i=0;i<=x; i++){

            for(int j=x;j>i; j--){
                System.out.print(" ");
            }
            for(int j=0;j<i; j++){
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
