package Java의신.VOL1.ObjectOriented;

public class Calculator {
    //객체를 생성할 때에는 new라는 예약어를 사용하여 만든다는 것과 메소드 같이
    //생긴 클래스 이름과 동일한 생성자를 호출한다는 것도 잊지 말자.
    public static void main(String[] args) {
        System.out.println("Caculator");
        //객체 생성
        Calculator calculator  = new Calculator();

        int a=10;
        int b=5;

        System.out.println(calculator.add(a,b));
        System.out.println(calculator.subtract(a,b));
        System.out.println(calculator.multiply(a,b));
        System.out.println(calculator.divide(a,b));
    }
    public int add(int a,int b){
        return a+b;
    }
    public int subtract(int a,int b){
        return a-b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
    public int divide(int a,int b){
        return a/b;
    }
}
