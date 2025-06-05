package ch02;

public class Introduce {
    public static int plus(int a, int b) {
        return a + b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int div(int x, int y) {
        return x / y;
    }

    public static int div_float(int x, int y) {
        return x / y;
    }

    public static String info(String name, String num, String email) {
        return "저는 " + name + " 입니다\n" +
                "제 전화번호 : " + num + " 입니다\n" +
                email + " 입니다";
    }

    public static String info2(String food, String hobby, String game) {
        return "제가 좋아하는 음식은 : " + food + " 입니다\n" +
                "제 취미 : " + hobby + " 이고,\n" +
                "좋아하는 게임 : " + game + " 입니다";
    }

    public static void main(String[] args) {
        int result2 = mul(5, 10);
        System.out.println("mul 이라는 함수 이용해서 결과 출력 : " + result2);

        int result3 = sub(300, 150);
        System.out.println("sub 이라는 함수 이용해서 결과 출력 : " + result3);

        int result4 = div(300, 3);
        System.out.println("div 이라는 함수 이용해서 결과 출력 : " + result4);

        float result5 = div(300, 3);
        System.out.println("div_float 이라는 함수 이용해서 결과 출력 : " + result5);
        // 실수 표현

        int s;
        char a;
        s = 100;
        a = 'd';

        System.out.println("정수 표현 : " + s);
        System.out.println("문자 표현 : " + a);

        // 퀴즈 4 - 과제
        // 본인의 이름과, 전화번호, 이메일을 입력 받는 매개변수가 3개이고,
        // 출력값은 문자열 타입인데 : 결과는
        // 저는 {이름} 입니다.
        // 제 전화번호 : {전화번호}이고,
        // 이메일: {이메일} 입니다.
        // 출력 하는 예제 해보기.
        String name = "김보영";
        String num = "01025082333";
        String email = "kby2333@naver.com";

        String Sresult = info(name, num, email);
        System.out.println(Sresult);

        // 퀴즈 ( 매개변수 3개)
        // 내가 좋아하는 음식, 취미, 게임 알려주는 기능
        // 제가 좋아하는 음식은 : {음식} 입니다.
        // 제 취미 : {취미}이고,
        // 좋아하는 게임: {게임} 입니다.

        String info2 = info2("케이크", "노래 듣기", "없음");
        System.out.println(info2);

    }
}
