package ch_03.AConditionalStatement;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score =0;
        System.out.print("점수를 입력하시오 > ");
        score = scanner.nextInt();

        if(score>=90){
            System.out.println("A");
        }else if(score>=80){
            System.out.println("B");
        }else if(score>=70){
            System.out.println("C");
        }else if(score>=60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
}
