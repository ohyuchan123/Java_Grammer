package Baekjoon.Bronze_V;

import java.util.Scanner;

public class Ah {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        String x = scanner.next();
        String y = scanner.next();

        if(x.length()>=y.length()){
            System.out.println("go");
        }else{
            System.out.println("no");
        }
    }
}
