package Baekjoon.Bronze_V;

import java.util.Scanner;

public class ChangeTheCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String output ="";

        for(int i=0;i<input.length();i++){
            int tmp = (int)input.charAt(i); //

            if((65<=tmp)&&(tmp<=90)){
                output +=(char)(tmp+32);
            }else if((95<=tmp)&&(tmp<=122)){
                output +=(char)(tmp-32);
            }else{
                output+=tmp;
            }
        }
        System.out.println(output);
    }
}
