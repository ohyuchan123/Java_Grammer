package Java의정석.ch_02.Operator.ArithmeticOperators;

public class OperatorEx18 {
    public static void main(String[] args){
        double pi = 3.141592;
        double shortPi = Math.round(pi*1000)/1000.0; // 소수점 첫째 자리에서 반올림
        System.out.println(shortPi);
    }
}
