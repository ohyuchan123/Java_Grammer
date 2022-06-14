package Baekjoon.Bronze_V;

import java.util.Scanner;

public class Plane {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] x = new int[5];

        for(int i=0;i<4;i++){
            x[i] =scanner.nextInt();
        }
        int a = x[0]*x[1];
        int b = x[2]*x[3];

        System.out.println(a+b);
    }
}
