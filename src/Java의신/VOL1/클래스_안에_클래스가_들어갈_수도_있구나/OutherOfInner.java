package Java의신.VOL1.클래스_안에_클래스가_들어갈_수도_있구나;

import java.util.EventListener;

public class OutherOfInner {
    class Inner{
        private int value=0;
        public int getValue(){
            return value;
        }
        public void setValue(int value){
            this.value = value;
        }
    }
    public void MakeInnerObject(){
        OutherOfInner outherOfInner = new OutherOfInner();
        OutherOfInner.Inner inner = outherOfInner.new Inner();
        inner.setValue(3);
        System.out.println(inner.getValue());
    }
}
