package Java의신.VOL1.ReferenceMaterialType;

import java.sql.Ref;

public class ReferenceTypes {
    /*자바는 생성자를 만들지 않아도 자동으로 만들어지는 기본 생성자가
    * 있다. 지금까지 main() 메소드에서 실습 클래스의 이름으로 객체를 생성한
    * 것이 바로 기본 생성자이다*/


    /*public ReferenceTypes(String data){
        이러면 컴파일 오류가 발생한다. 그 이유는 필자가 기본 생성자에
        대한 설명을 할 때 '아무런 매개 변수가 없는 ReferenceTypes()라는 생성자는
        다른 생성자가 없을 경우 기본으로 컴파일 할 떄 만들어진다' 라고 했다 그런데
        기본 생성자는 다른 생성자가 있ㅇ으면 자동으로 만들어 지지 않는다
    }*/

    public ReferenceTypes(){

    }
    public ReferenceTypes(String  data){

    } /* -> 이렇게 매개 변수가 없는 생성자를 먼들어 준 후에 컴파일 하면 main() 메소드에
            서 컴파일 오류가 뜨지 않는다*/
    public static void main(String[] args) {
        ReferenceTypes referenceTypes = new ReferenceTypes();
    }

}
