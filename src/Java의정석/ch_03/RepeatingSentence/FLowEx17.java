package Java의정석.ch_03.RepeatingSentence;

import java.util.Scanner;

public class FLowEx17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("*을 출력할 라인의 수를 입력하세요>");
        int number = scanner.nextInt();

        for(int i=1;i<=number;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
