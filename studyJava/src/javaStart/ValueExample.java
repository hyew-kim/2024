package javaStart;

public class ValueExample {
    public static void main(String[] args) {
        ValueExample.example3();
    }

    public static void example1() {
        /*문제1
        다음코드에반복해서나오는숫자 `4` ,`3` 을 다른 숫자로 한번에 변경할 수 있도록 다음을 변수 `num1` , `num2` 를사용하
        도록 변경해보세요.*/

        int num1 = 4;
        int num2 = 3;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
    }

    public static void example2() {
        /*     문제2
        다음과 같은 작업을 수행하는 프로그램을 작성하세요.
        클래스 이름은 `VarEx2` 라고 적어주세요.
        1. 변수 `num1` 을 선언하고, 이에 10을 할당하세요.
        2. 변수 `num2` 를 선언하고, 이에 20을 할당하세요.
        3. 두 변수의 합을 구하고, 그 결과를 새로운 변수 `sum` 에 저장하세요.
        4. `sum` 변수의 값을 출력하세요.*/

        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;

        System.out.println(sum);
    }

    public static void example3() {
       /* 문제3 - long, boolean 데이터 타입
       클래스 이름: `VarEx3`
       `long` 타입의 변수를 선언하고, 그 변수를 10000000000(백억)으로 초기화한 후 출력하는 프로그램을 작성하세요.
       `boolean` 타입의 변수를 선언하고, 그 변수를 `true` 로 초기화한 후 출력하는 프로그램을 작성하세요.*/

        long num = 10000000000L;  // L을 붙여줘야 int 리터럴로 인식하지 않음
        boolean status = true;

        System.out.println(num);
        System.out.println(status);
    }
}
