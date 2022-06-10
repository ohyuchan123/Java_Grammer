package Java의정석.ch_03.AConditionalStatement;

import java.util.Scanner;

public class FLowEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 주민번호를 입력하세요 예(011231-1111222)> ");
        String  regNo = scanner.nextLine();

        char gender = regNo.charAt(7); //입력받은 번호의 8반째 문자를 gender에 저장

        switch (gender){
            case '1': case '3':
                System.out.println("당신의 성별은 남성입니다.");
                break;
            case '2': case '4':
                System.out.println("당신의 성별은 여성입니다.");
                break;
            default:
                System.out.println("유효하지 않는 주민등록번호입니다.");
        }
    }
}
