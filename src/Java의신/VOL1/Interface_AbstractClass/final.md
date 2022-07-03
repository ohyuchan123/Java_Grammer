### 나는 내 자식들에게 하나도 안 물려 줄꺼여

```
final은 클래스,메소드,변수에 선언할 수 있다. final은 영어 뜻
그대로 "마지막" 이라는 뜻이다.
```

#### 클래스에 final을 선언할 때에는...

```java
public final class FinalClass{
}
// 클래스가 final로 선언되어 있으면 상속을 해 줄 수 없다.
```

```
이와 같이 클래스에 final을 선언하는 이유는 뭘까?
지금까지 보아 온 String이라는 클래스는 자바에서는 아주 
중요한 클래스이며 이 클래스를 조금이라도 변경해서 무슨 작업을
하면 안된다. 만약 String 클래스를 상속 받아서 toString()
메소드에서 무조건 1을 리턴하게 한다면 String이라는 클래스에 대한
기본 속성을 변경하는 것이다. 더 이상 확장해서는 안 되는 클래스
누국가 이 클래스를 상속 받아서 내용을 변경해서는 안 되는 클래스를
선언할 때 final로 선언하면 된다.
```

#### 메소드를 final로 선언하는 이유는
```java
/* 메소드의 경우도 클래스에 fianl로 선언하는 경우와 비슷한 이유로
   사용한다. 메소드를 final로 선언하면 더 이상 Overriding할
   수 없다. 앞서 사용했던 MeberManger Abstract 클래스의
   printLog() 메소드를 다음과 같이 final로 선언하자
   */
    public abstract class MemberMangerAbstract{
        System.out.println("Data = "+data);
}
```