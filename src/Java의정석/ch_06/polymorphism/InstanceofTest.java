package Java의정석.ch_06.polymorphism;

public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine1 fe = new FireEngine1();

        if(fe instanceof FireEngine1){
            System.out.println("This is a FireEngine instance.");
        }
        if(fe instanceof Car1){
            System.out.println("This is a FireEngine instance.");
        }
        System.out.println(fe.getClass().getName()); //클래스의 이름을 출력
    }
}
class Car1{}
class FireEngine1 extends Car1{}
