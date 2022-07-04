package Baekjoon.Bronze_V;

import java.io.*;

public class Big_Number {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //나머지 연산 방법
        String N = br.readLine();
        long remain = 0;
        for(int i =0; i < N.length(); i++){
            remain = (remain * 10 + (N.charAt(i) - '0')) % 20000303;
        }
        bw.write(remain + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
