package Java의신.VOL1.클래스_안에_클래스가_들어갈_수도_있구나;

public class OtherOfStatic {
    static class StaticNested{
        private static int value=0;
        public static int getValue(){
            return value;
        }
        public void setValue(int value){
            this.value = value;
        }
    }
}
