package Java의신.VOL1.어노테이션;

public class AnnotationChild extends Parent {
    @Override
    public void printName(){
        System.out.println("AnnotationChild");
    }

    @Deprecated
    public void noMoreUse(){

    }
    public class AnnotationSample{
        @SuppressWarnings("deprecation")
        public void useDeprecated(){
            AnnotationChild child = new AnnotationChild();
            child.noMoreUse();
        }
    }
}
