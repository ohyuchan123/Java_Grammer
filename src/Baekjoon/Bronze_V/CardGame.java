package Baekjoon.Bronze_V;

import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int[] x= new int[6];

        for(int i=0;i<5;i++){
            x[i] = sc.nextInt();
            sum+=x[i];
        }

        System.out.println(sum);
    }
}
