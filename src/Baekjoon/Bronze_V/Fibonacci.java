package Baekjoon.Bronze_V;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        int x = scanner.nextInt();
        System.out.println(fibonacci(x));
    }
    static int fibonacci(int n){

        if(n==0)return 0;
        if(n==1)return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
