package Java의신.VOL1.클래스_안에_클래스가_들어갈_수도_있구나;

public class NestedSample{
    public static void main(String[] args) {
        NestedSample sample = new NestedSample();
        sample.makeStaticNestedObject();
    }
    public void makeStaticNestedObject(){
        OtherOfStatic.StaticNested otherOfStatic = new OtherOfStatic.StaticNested();
        otherOfStatic.setValue(3);
        System.out.println(otherOfStatic.getValue());
    }
    /*Static nested클래스를 만드는 이유는 클래스를 묶기 위해서다.*/
}
