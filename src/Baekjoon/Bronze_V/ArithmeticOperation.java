package Baekjoon.Bronze_V;

import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x1 = s.nextInt();
        int y1 = s.nextInt();

        double x2 = s.nextDouble();
        double y2 = s.nextDouble();


        System.out.println(x1+y1);
        System.out.println(x1-y1);
        System.out.println(x2/y2);
    }
}
