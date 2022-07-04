## 클래스 안의 클래스
```
자바에서는 클래스 안에 클래스가 들어갈 수 잇다. 이러한 클래스를 "Nested 클래스"라고 부른다
이와 같은 Nested 클래스가 존재하는 이유는 여러 가지가 있겠지만, 가장 큰 이유는 코드를 간단
하게 표현하기 위함이다. Nested 클래스는 자바 기반의  UI 처리를 할 때 사용자의 입력이나,
외부의 이벤트에 대한 처리를 하는 곳에서 가장 많이 사용된다. 이러한 부분에서 Nested 클래스가
없으면 코드가 매우 복잡해지낟,

Nested 클래스는 선언한 방법에 따라 "Static nested 클래스"와  "내부(inner) 클래스"로 구분
된다. Static nested 클래스와 내부 클래스의 차이는 static으로 선언되었는지 여부다. 만약
클래스를 선언할 때 static으로 선언이 되었다면, 그 클래스는 Static nested 클래스가 되고,
static이 없으면 그냥 내부 클래스라고 한다.

내부 클래스는 다시 두 가지로 나뉘는데 이름이 있는 내부 클래스는  "로컬(혹은 지역) 내부
클래스(local inner class)"라고 하고 이름이 없는 클래스를 "익명 내부 클래스
(anonymous inner class"라고 부른다. 하지만, 일반적으로는 간단하게 줄여서 각각
"내부 클래스"와 "익명 클래스"라고 부른다.
```

#### code
```java
public class PublicClass{
    
}
class JustNotPublicClass{
    
}
```