package Baekjoon.Bronze_V;

import java.util.Scanner;

public class KingQueenLookBishopNightPhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] cut = new int[6];
        int[] full = new int[] {1,1,2,2,2,8};

        for(int i=0;i<6;i++){
            cut[i] = scanner.nextInt();
        }

        for(int i=0;i<6;i++){
            System.out.println(full[i]-cut[i]);
        }
    }
}
