package Baekjoon.Bronze_V;

import java.math.BigInteger;
import java.util.Scanner;

public class LargeNumberr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger x = scanner.nextBigInteger();
        BigInteger y = scanner.nextBigInteger();
        BigInteger add = x.add(y);

        System.out.println(add);
    }
}
