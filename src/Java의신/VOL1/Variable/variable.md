### variable
1. 변동이 심한; 가변적인 2. 변화를 줄 수 있는 3. 변수   
자바에서는 네가지의 변수가 있다.
- 지역 변수 local variables
- 매개 변수 parameters
- 인스턴스 변수 instance variables
- 클래스 변수 class variables

```java
public class Car { 
    int speed;
    int distance;
    String color;
}
```
만약 이 인스턴스 변수들 가장 앞에 static이라는 단어를 붙이면 그 변수는 클래스 변수이다,

- 지역변수(local variable)    
  중괄호 내에서 선언된 변수   
    

- 매개 변수(parameters)   
 메소드나 생성자에 넘겨주는 변수

   
- 인스턴스 변수(instance variables)   
 메소드 밖에, 클래스 안에 선언된 변수, 앞에는 static이라는 예약어가 없어야 한다.


- 클래스 변수(class variables)   
 인스턴스 변수처럼 메소드 밖에, 클래스 안에 선언된 변수 중에서 타입 선언   
 앞에 static이라는 예약어가 잇는 변수

```java
public class VariableTypes {
    int instanceVariable; //인스턴스 변수
    static int classVariable; // 클래스 변수
    public void method(int parameter/*매개 변수*/){ 
        int localVarialbe; //지역 변수
    }
}
```