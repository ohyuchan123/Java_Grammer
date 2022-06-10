package Java의정석.ch_02.Operator.ConditionOperator;

public class OperatorEx32 {
    public static void main(String[] args) {
        int x,y,z;
        int absx,absy,absz;
        char singx,singy,singz;

        x=10;
        y=-5;
        z=0;

        //삼항 연산자
        absx = x>=0?x:-x; //x값이 음수이면 양수로 만든다
        absy = y>=0?y:-y;
        absz = z>=0?z:-z;

        singx=x>0?'+':(x==0?' ':'-');
        singy=y>0?'+':(y==0?' ':'-');
        singz=z>0?'+':(z==0?' ':'-');

        System.out.printf("x = %c%d\n",singx,absx);
        System.out.printf("x = %c%d\n",singy,absy);
        System.out.printf("x = %c%d\n",singz,absz);
    }
}
