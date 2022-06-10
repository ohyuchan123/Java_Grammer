package Java의정석.ch_02.Operator.ArithmeticOperators;

public class OperatorEx5 {
    public static void main(String[] args){
        int  a = 10;
        int  b = 4;

        System.out.printf("%d + %d = %d",a,b,a+b);
        System.out.printf("%d - %d = %d",a,b,a-b);
        System.out.printf("%d * %d = %d",a,b,a*b);
        System.out.printf("%d / %d = %d",a,b,a/b);
        System.out.printf("%d + %f = %f",a,(float)b,a/(float)b);
    }
}
