package Baekjoon.Bronze_III;

import java.util.Scanner;

public class EscapefromRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        int x_min = Math.min(x,w-x);
        int y_min = Math.min(y,h-y);

        System.out.println(x_min);
        System.out.println(y_min);
        System.out.println(Math.min(x_min,y_min));
    }
}
