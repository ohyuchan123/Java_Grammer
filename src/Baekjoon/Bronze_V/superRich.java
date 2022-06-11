package Baekjoon.Bronze_V;

import java.math.BigInteger;
import java.util.Scanner;

public class superRich {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger x = scan.nextBigInteger();
        BigInteger y = scan.nextBigInteger();

        scan.close();

        System.out.println(x.divide(y)); // 나눗셈
        System.out.println(x.remainder(y)); // 나머지
    }
}
