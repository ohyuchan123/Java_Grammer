package Java의정석.ch_03.AConditionalStatement;

import java.util.Scanner;

public class FLowEx11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 주민번호를 입력하세요 예(011231-1111222)> ");
        String  regNo = scanner.nextLine();

        char gender = regNo.charAt(7); //입력받은 번호의 8반째 문자를 gender에 저장

        switch (gender){
            case '1': case '3':
                switch (gender){
                    case '1':
                        System.out.println("당신은 2000년 이전에 출생한 남자입니다.");
                        break;
                    case '3':
                        System.out.println("당신은 2000년 이후에 출생한 남자입니다.");
                        break;
                }
                break;
            case '2': case '4':
                switch (gender){
                    case '2':
                        System.out.println("당신은 2000년 이전에 출생한 여자입니다.");
                        break;
                    case '4':
                        System.out.println("당신은 2000년 이후에 출생한 여자입니다.");
                        break;
                }
                break;
        }
    }
}
