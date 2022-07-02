```
MemberDTO에서 생성자를 선엉할 때 this라는 예약어를 사용했습니다.
이 this라는 예약어는 단어 의미 그대로 '이 객체'의 의미입니다.
this 예약어는 생성자와 메소드 안에서 사용할 수 있다.
```
```java
public class MemberDTO{
    public String name;
    public String phone;
    public String email;
    public MemberDTO(String name){
        this.name = name;
    }
}
// 이 코드에 this라는 것이 없으면 에러가 발생한다
// 하지만 name앞에 this를 붙여 주면 이 객체의 name이라고
// 명시적으로 지정해 준다
```