package Java의신.VOL1.ConditionalStatement;

import java.util.Random;

public class Switch2 {
    public static void main(String[] args) {
        Switch2 switch2 = new Switch2();
        Random random = new Random();
        switch2.switchStatement2(random.nextInt(12));
    }
    public void switchStatement2(int month){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month+" has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month+" has 30 days");
                break;
            case 2:
                System.out.println(month+" has 28 or 29 days");
                break;
            default:
                System.out.println(month+" is not a month");
                break;
        }
    }
}
