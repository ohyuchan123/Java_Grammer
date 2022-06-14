package Baekjoon.Bronze_V;

import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum=0;
        for(int i=0;i<5;i++){
            sum+=scanner.nextInt();
        }
        System.out.println(sum);
    }
}
