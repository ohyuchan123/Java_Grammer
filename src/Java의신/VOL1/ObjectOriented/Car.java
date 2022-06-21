package Java의신.VOL1.ObjectOriented;

public class Car {
    public static void main(String[] args) {

    }
    public Car(){
        // public Car()은 생성자라고 불리며
        //이 생성자는 Car 클래스의 객체를 생성할 때 필요하다

    }
    int speed;
    int distance;
    String color;

    // 이렇게 속도를 올리는  speedUp() 메소드와 속도를 줄이는 breakDown() 메소드로 클래스의 상태를 변경하는 행위를 지정할 수 잇다.
    public void speedUp(){
        speed+=5;
    }
    public void breakDown(){
        speed-=10;
    }
    public int getCurrentSpeed(){
        //이렇게 속도를 증가시키고 감소시켜도 현재의 속도를 확인할 수 있는 방법이 없다.
        //따라서 다음과 같이 getCurrentSpeed() 메소드를 만들어주어서 return(반환)해준다.
        return speed;
    }
}
