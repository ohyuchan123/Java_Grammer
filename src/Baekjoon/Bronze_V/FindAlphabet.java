package Baekjoon.Bronze_V;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FindAlphabet {
    public static void main(String[] args)/*throw Exception*/{
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[26];

        for(int i=0;i<arr.length;i++){
            arr[i]=-1;
        }

        String alpha = scanner.nextLine();

        for(int i=0;i<alpha.length();i++){
            char ch = alpha.charAt(i);
            /*charAt 함수란?
            * String 타입의 데이터(문자열)에서 특정 문자를 char 탑입으로 변환할 때 사용하는 함수이다
            * 즉 alpha에서 입력받은 문자열을 char로 변환 ch에 저장*/

            if(arr[ch - 'a']==-1){
                arr[ch-'a']=i;
            }
        }

        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
