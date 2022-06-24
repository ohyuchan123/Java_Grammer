### 자료형
##### 크게 보면 자바에는 두 가지 자료형이 있다
```
자바의 타입(자료형)은 기본 자료형(Primitive Data Type)과 
참조 자료형(Reference Data Type)으로 나뉜다.
그런데, 기본 자료형은 추가로 만들 수 없다. 기본 자료형은 딱 정해져 있다.
그렇지만 참조 자료형은 맘대로 만들 수 잇다. 지금까지 만든 
Calculator,Car와 같은 클래스들도 전부 참조 자료형이다.
```

##### 기본 자료형과 참조 자료형의 차이

```java
int a = 10;

Calculator calc = new Calculator();

int를 초기화할 때에는 그냥 값을 바로 적어 주었고
Calculator를 초기화할 때에는 앞서 살펴본 new라는 예약어를 사용한다.
자바에서는 이렇게 new를 사용해서 초기화하는 것을 참조 자료형,
new 없이 바로 초기화가 가능한 것을 기본 자료형이라고 한다.


참조 자료형 중에서 딱 하나 초기화할 때 예외적인 것이 잇다. 바로 문자열을
다루는 String이다. String을 초기화는

String bookName1 = "Basic java";
그런데 아래 내용과 같이 정리 할 수 있다.class 
String bookName2 = new String("Basic java");

참조 자료형이지만 new를 사용해서 객체를 생성하지 않아도 되는
유일한 티입이다.
```