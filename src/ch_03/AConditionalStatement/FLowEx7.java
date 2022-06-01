package ch_03.AConditionalStatement;

import java.util.Scanner;

public class FLowEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("가위(1) 바위(2) 보(3) 끝내기(4) 중 하나를 입력하세요.>");

        int user = scanner.nextInt();
        int com = (int)(Math.random()*3)+1; // 1,2,3 중 하나가 com에 저장

        switch (user-com){
            case 2: case -1:
                System.out.println("당신이 졌습니다.");
                break;
            case 1: case -2:
                System.out.println("당신이 이겼습니다.");
                break;
            case 0:
                System.out.println("비겼습니다.");
                break;
        }

    }
}
