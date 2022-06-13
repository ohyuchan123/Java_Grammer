package Baekjoon.Bronze_V;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Big {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int num1 = Integer.parseInt(stringTokenizer.nextToken());
            int num2 = Integer.parseInt(stringTokenizer.nextToken());

            if(num1 == 0 && num2==0)break;

            if(num1>num2) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
