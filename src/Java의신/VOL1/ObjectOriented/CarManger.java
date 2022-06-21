package Java의신.VOL1.ObjectOriented;

public class CarManger {
    public static void main(String[] args) {
        // 앞으로 여기에 코드가 들어간다

        // Car 클래스를 이용하여 객체 생성
        Car dogCar = new Car();
        Car cowCar = new Car();
        /*이와 같이 해주면 "개똥이 차" dogCar 객체와
        * "소똥이 차"인  cowCar라는 객체가 생성된다.
        * new라는 것은 자바에서 미리 정해져 있는 예약어 중 하나다*/

        dogCar.speedUp();
        dogCar.speedUp();
        System.out.println(dogCar.getCurrentSpeed());
        dogCar.breakDown();
        cowCar.speedUp(); //여기에 메소드 이름을 적어주면 속도가 증가될 것이다

    }
}
