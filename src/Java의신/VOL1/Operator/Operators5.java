package Java의신.VOL1.Operator;

public class Operators5 {
    public static void main(String[] args) {
        boolean x = true;
        boolean y =true;

        System.out.println(x&&y); //and 결합
        System.out.println(x||y); //or 결합
        System.out.println("-----");
        x = false;
        System.out.println(x&&y);
        System.out.println(x||y);
        System.out.println("-----");
        y = false;
        System.out.println(x&&y);
        System.out.println(x||y);
    }
}
