package ch_01;

public class variablePrintf2 {
    public static void main(String[] args)
    {
        String url ="www.codechobo.com";

        float f1 = .10f; // 0.10,1.0e-1
        float f2 = 1e1f; // 10.0, 1.0e1,1.0e+1
        float f3 = 3.14e3f;
        double d = 1.23456789;

        System.out.printf("f1 = $f, %e, %g%n",f1,f1,f1);
        System.out.printf("f2 = $f, %e, %g%n",f2,f2,f2);
        System.out.printf("f1 = $f, %e, %g%n",f3,f3,f3);

        System.out.printf("d=%f%n",d); // 마지막 자리 반올림
        System.out.printf("d=%f14.10f%n",d); // 전체 14자리 중 소수점 10자리

        System.out.printf("[12345678901234567890%n");
        System.out.printf("[%s]%n",url); //문자열의 길이만큼 출력공간을 확보
        System.out.printf("[%20s]%n",url); // 최소 20글자 출력궁간 확보. (우측 정렬)
        System.out.printf("[%-20s]%n",url); // 최소 20글자 출력공간 확보. (좌측 정렬)
        System.out.printf("[%.8s]%n",url); //왼쪽에서 8글자만 출력
    }
}
