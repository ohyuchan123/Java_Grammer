package Java의신.VOL1.Operator;

public class ConditionalOperator {
    public static void main(String[] args) {
        Operators6 operators6 = new Operators6();
        operators6.doBlindDate(30);
        operators6.doBlindDate(80);
    }
    private static class Operators6 {
        public boolean doBlindDate(int point)
        {
            boolean doBlindDateFlag = false;
            doBlindDateFlag = (point>=80)?true:false;
            System.out.println(point+" : "+doBlindDateFlag);
            return doBlindDateFlag;
        }
    }
}
