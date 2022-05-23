package ch_01.PrimitiveType;

public class Float {
    public static void main(String[] args){
        float f = 9.123456789f;
        float f2 = 1.2345678901234567890f;
        double d = 9.1234d;

        System.out.printf("12345678901234%n");
        System.out.printf("f : %f%n",f); // 소수점 이하 6째자리까지 출력.
        System.out.printf("f : %24.20f%n",f); // 전체 24자리 중에서 20자리는 소수점 이하의 수를 출력
        System.out.printf("f2 : %24.20f%n",f2);
        System.out.printf("d : %24.20f%n",d);
    }
}
