package Java의신.VOL1.모든클래스의부모클래스는Object에요;

import Java의신.VOL1.ReferenceMaterialType.MemberDTO;

public class InheritanceObject {
    public static void main(String[] args) {
        InheritanceObject object = new InheritanceObject();
//        object.toStringMethod(object);
//        object.toStringMethod2();
        object.equalMethod();
    }
    public String toString(){
        return "InheritanceObject class";
    }
    public void toStringMethod(InheritanceObject object){
        System.out.println(object);
        System.out.println(object.toString());
        System.out.println("plus "+object);
    }
    public void toStringMethod2(){
        System.out.println(this);
        System.out.println(toString());
        System.out.println("plus "+this);
    }
    public void equalMethod(){
        MemberDTO obj1 = new MemberDTO("Sangmin");
        MemberDTO obj2 = new MemberDTO("Sangmin");
        if(obj1==obj2){
            System.out.println("obj1 and obj2 is same");
        }else{
            System.out.println("obj1 and obj2 is different");
        }

        if(obj1.equals(obj2)) {
            //equals는 (==)기능을 한다
            System.out.println("obj1 and obj2 is same");
        }else{
            System.out.println("obj1 and obj2 is different");
        }
    }
}
