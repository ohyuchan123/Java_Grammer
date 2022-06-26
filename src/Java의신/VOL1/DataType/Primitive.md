### byteMin and byteMax
```java
package Java의신.VOL1.DataType;

public class PrimitiveTypes {
    public static void main(String[] args) {
        PrimitiveTypes primitiveTypes = new PrimitiveTypes();
        primitiveTypes.checkByte();
    }
    public void checkByte(){
        byte byteMin = -128;
        byte byteMax = 127;
        System.out.println("byteMin = "+byteMin);
        System.out.println("byteMax = "+byteMax);

        byteMin--;
        byteMax++;

        System.out.println("byteMin = "+byteMin);
        System.out.println("byteMax = "+byteMax);
    }
}

```
최소값에서 1을 더 뺀 것은 최대값이 나왔고, 최대값에서 1을 더한 것은 최소값이 나온 까닭은
byte의 최솟값(byteMin)과 최대값(byteMax)을 2진수를 사용하는 비트로 표현하면 다음과 같다
byteMin의 값 즉 2진수로 표현하면 1000_0000 인 값에서 1을 빼면 0111_1111이 된다.
그리고 byteMax의 값, 즉 2진수로 표현하면 0111_1111인 값에서 1을 더하면 1000_000이 될 것이다.
그러므로 byte의 최소값에서 1을 빼면 최대값이 byte의 최대값에서 1을 더하면 최소값이 나오게 된다.
