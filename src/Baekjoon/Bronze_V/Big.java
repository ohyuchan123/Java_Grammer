package Baekjoon.Bronze_V;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Big {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // 값을 모아뒀다가 한 번에 전송 BufferedReader은 엔터만 경계로 인식하고 받은 데이터가 String으로 고정되기 때문에 데이터를 
        //따로 가공해야하나 Scanner에 비해서 상대적으로 빠르다

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
