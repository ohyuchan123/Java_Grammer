package Java의정석.ch_05.VariablesAndMethods;

public class CallStackTest {
    public static void main(String[] args) {
        firstMethod();
    }
    static void firstMethod(){
        secondMethod();
    }
    static void secondMethod(){
        System.out.println("secondMethod()");
    }
}
