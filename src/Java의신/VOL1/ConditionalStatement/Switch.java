package Java의신.VOL1.ConditionalStatement;

import java.util.Random;

public class Switch {
    public static void main(String[] args) {
        Switch s = new Switch();
        Random rand = new Random();
        s.switchStatement(rand.nextInt(5));
    }
    public void  switchStatement(int numberOfwheel){
        switch (numberOfwheel){
            case 1:
                System.out.println("It is one foot bicycle");
                break;
            case 2:
                System.out.println("It is a motor cycle or bicycle.");
                break;
            case 3:
                System.out.println("It is three wheel car.");
                break;
            case 4:
                System.out.println("It is a car.");
                break;
            default:
                System.out.println("It is an expensive car.");
                break;
        }
    }
}
