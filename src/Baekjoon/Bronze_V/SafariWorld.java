package Baekjoon.Bronze_V;

import java.util.Scanner;

public class SafariWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long x =scanner.nextInt();
        long y = scanner.nextInt();

        long res;

        res = Math.abs(x-y); //절대값
        System.out.println(res);
    }
}
