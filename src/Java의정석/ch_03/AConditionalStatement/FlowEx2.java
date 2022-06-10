package Java의정석.ch_03.AConditionalStatement;

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("슷자를 입력하시오 > ");
        String tmp = scanner.nextLine();

        input = Integer.parseInt(tmp);

        if(input==0){
            System.out.println("입력하신 숫자는 0입니다");
        }if(input!=0){
            System.out.println("입력하신 숫자는 0이 아닙니다");
            System.out.printf("입력하신 숫자는 %d입니다",input);
        }

    }
}
