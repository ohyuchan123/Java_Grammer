package Java의신.VOL1.DataType;

public class PrimitiveTypes {
    public static void main(String[] args) {
        PrimitiveTypes primitiveTypes = new PrimitiveTypes();
        primitiveTypes.checkByte();
        primitiveTypes.defaultValues();
    }
    public void defaultValues(){
        int intDefault1;
        byte byteDefault = 0;
        short shortDefault = 0;
        float floatDefault = 0;
        double doubleDefault = 0;
        char charDefault = 0;
        boolean booleanDefault = false;
        System.out.println("byteDefault"+byteDefault);
        System.out.println("byteDefault"+shortDefault);
        System.out.println("byteDefault = "+floatDefault);
        System.out.println("byteDefault = "+doubleDefault);
        System.out.println("byteDefault = "+charDefault);
        System.out.println("byteDefault = "+booleanDefault);
    }
    public void checkByte(){
        byte byteMin = -128;
        byte byteMax = 127;
        System.out.println("byteMin = "+byteMin);
        System.out.println("byteMax = "+byteMax);

        byteMin--;
        byteMax++;

        System.out.println("byteMin = "+byteMin);
        System.out.println("byteMax = "+byteMax);
        /*최소값에서 1을 더 뺀 것은 최대값이 나왔고, 최대값에서 1을 더한 것은 최소값이 나온 까닭은
        * byte의 최솟값(byteMin)과 최대값(byteMax)을 2진수를 사용하는 비트로 표현하면 다음과 같다
        * byteMin*/

    }
}
