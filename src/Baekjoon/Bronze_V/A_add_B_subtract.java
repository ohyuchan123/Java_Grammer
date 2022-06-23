package Baekjoon.Bronze_V;

import java.util.Scanner;

public class A_add_B_subtract {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        while(in.hasNextInt()){

            int a=in.nextInt();
            int b=in.nextInt();
            System.out.println(a+b);

        }
        in.close();
        // scanner 즉 입력 받는 값을 닫아주는 역할
    }
}
