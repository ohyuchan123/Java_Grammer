package Java의신.VOL1.여러데이터를하나에;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        Array array = new Array();
        array.init();
    }
    public void init(){
        int[] lottoNumber = new int[7];
        Random rd = new Random();
        for(int i=0;i<lottoNumber.length;i++){
            lottoNumber[i]=rd.nextInt(8);
        }
        for(int i=0;i<lottoNumber.length;i++){
            System.out.print(lottoNumber[i]+" ");
        }
    }
}
