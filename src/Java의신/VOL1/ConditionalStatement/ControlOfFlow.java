package Java의신.VOL1.ConditionalStatement;

public class ControlOfFlow {
    public static void main(String[] args) {
        ControlOfFlow controlOfFlow = new ControlOfFlow();
        controlOfFlow.ifStatement();
    }
    public void ifStatement(){
        if(true);
        if(true) System.out.println("It's true");
        if(true){
            System.out.println("It's also true");
        }
        if(false) System.out.println("It's false");

        int intValue = 10;
        if(intValue>5) System.out.println("It's bigger than 5.");
        else System.out.println("It's smaller or equal than 5.");

        if(intValue<=5) System.out.println("It's smaller or equal than 5.");
        else System.out.println("It's bigger than 5.");
    }
}
