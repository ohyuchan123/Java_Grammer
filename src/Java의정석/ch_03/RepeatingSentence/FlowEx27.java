package Java의정석.ch_03.RepeatingSentence;

import java.util.Scanner;

public class FlowEx27 {
    public static void main(String[] args) {
        int sum=0;
        boolean flag = true;

        System.out.println("합계를 구할 숫자를 구하세요. (끝내려면 0을 입력)");
        while(flag){
            Scanner scanner = new Scanner(System.in);

            System.out.print(">");
            int input = scanner.nextInt();

            if(input==0){
                break;
            }else{
                sum+=input;
            }
        }
        System.out.println("합계 : "+sum);
    }
}
