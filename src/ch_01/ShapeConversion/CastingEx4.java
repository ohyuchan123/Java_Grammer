package ch_01.ShapeConversion;

public class CastingEx4 {
    public static void main(String[] args){
        int i = 91234567; //10진수
        float f = (float)i; // i를 실수형(float)으로 형변환
        int i2 = (int)i; //실수형(float)를 다시 int로 형변환

        double d = (double)i; //정수(int)를 실수형(double)로 형변환
        int i3 = (int)d; //실수형(double)를 다시 int로 형변환

        float f2 = 1.666f;
        int i4 = (int)f2;

        System.out.printf("i = %d\n",i);
        System.out.printf("f = %f i2 = %d\n",f,i2);
        System.out.printf("d = %f i3 = %d\n",d,i3);
        System.out.printf("(int)%f = %d \n",f2,i4);
    }
}
