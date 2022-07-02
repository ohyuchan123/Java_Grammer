package Java의신.VOL1.여러데이터를하나에;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        Array array = new Array();
        array.init();
        array.primitiveTypes();
        array.referenceTypes();
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
        System.out.println("\n");
    }
    public void primitiveTypes(){

        byte[]byteArray = new byte[1];
        short[]shortArray = new short[1];
        int[]intArray = new int[1];
        long[]longArray = new long[1];
        float[]floatArray = new float[1];
        double[]doubleArray = new double[1];
        char[]charArray = new char[1];
        boolean[]booleanArray = new boolean[1];

        System.out.println("byteArray[0] = "+byteArray[0]);
        System.out.println("shortArray[0] = "+shortArray[0]);
        System.out.println("intArray[0] = "+intArray[0]);
        System.out.println("longArray[0] = "+longArray[0]);
        System.out.println("floatArray[0] = "+floatArray[0]);
        System.out.println("doubleArray[0] = "+doubleArray[0]);
        System.out.println("charArray[0] = "+charArray[0]);
        System.out.println("booleanArray[0] = "+booleanArray[0]+"\n");

        System.out.println("byteArray = "+byteArray);
        System.out.println("shortArray = "+shortArray);
        System.out.println("intArray = "+intArray);
        System.out.println("longArray = "+longArray);
        System.out.println("floatArray = "+floatArray);
        System.out.println("doubleArray = "+doubleArray);
        System.out.println("charArray = "+charArray);
        System.out.println("booleanArray = "+booleanArray+"\n");

    }
    public void referenceTypes(){
        String[] strings = new String[2];
        Array[] arrays = new Array[2];

        System.out.println("strings[0] = "+strings[0]);
        System.out.println("arrays[0] = "+arrays[0]);
    }
}
