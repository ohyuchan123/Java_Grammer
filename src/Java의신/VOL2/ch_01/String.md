public final class String extends Object
implements Serializable, Comparable<String>,CharSequence 

public final로 선언되었다. public이 "누구나 다 사용할 수 있는 클래스"라는 정도는 다 기엉하고 있을 것이다
클래스가 final로 선안되어 있으면 더 이상 이 클래스는 확장할 수 없다. 다시 말해서 String 클래스는 자식
클래스를 양산할 수 없다. 그냥 있는 대로 사용해야만 한다.
Object는 모든 클래스의 부모 클래스는 Object 클래스이므로 이 외에 따로 확장한 클래스는 없다.
implements라고 적어준 뒤 인터페이스들을 나열하면 해당 인터페이스에 선언된 메소드들을 이 클래스에 "구현"한다는 의미다.
String은 Serializable Comparable,CharSequence라는 인터페이스를 구현한 클래스 이다.