package Baekjoon.Bronze_V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Julka {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // 값을 모아뒀다가 한 번에 전송 BufferedReader은 엔터만 경계로 인식하고 받은 데이터가 String으로 고정되기 때문에 데이터를
        //따로 가공해야하나 Scanner에 비해서 상대적으로 빠르다
        BigInteger total = new BigInteger(bf.readLine());
        //BigInteger을 초기화 하기 위해서는 문자열을 인자 값으로 넘겨주어야 한다
        //BigInteger은 문자열이기에 사칙연산이 안됩니다. 그렇기에 BigInteger 내부의 숫자를 계산하기 위해서는
        //BigInteger 클래스 내부에 있는 메서드를 사용해야 한다
        BigInteger diff = new BigInteger(bf.readLine());
        BigInteger two = new BigInteger("2");

        // add : 덧셈
        // subtract : 뺄셈
        // multiply : 곱셈
        // divide : 나눗셈
        // remainder : 나머지
        BigInteger x = (total.subtract(diff)).divide(two).add(diff);
        BigInteger y = (total.subtract(diff).divide(two));

        System.out.println(x);
        System.out.println(y);
    }
}
