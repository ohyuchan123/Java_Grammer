package Baekjoon.Bronze_V;

import java.util.Scanner;

public class Happy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); //세로
        int m = scanner.nextInt(); //가로
        int k = scanner.nextInt(); //번호

        System.out.println(k/m+" "+k%m);
    }
}
