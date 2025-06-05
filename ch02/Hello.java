package ch02;

// public : 접근 지정자, 파란색으로 표기 되는 부분은 예약어 키워드
// 변수명으로 따로 사용안됨
// 파일명.java -> 파일명 = 클래스명, 주의사항) 클래스명, 시작은 대문자
// 특스문자는 _, $ 와 이용가능
// 패키지명, 변수명, 함수명(메소드) 소문자로 시작하고

public class Hello { // class : 변수, 상수, 함수 기능들의 묶음
    // 정적인 메소드 하나 생성
    // static : 정적 자원, 공유 자원, 나중에 인스턴스 개념과 구분해서 설명 필요
    public static int sum(int n, int m) {
        return n + m;
    }

    public static int sub(int a, int b) {
        return a * b;
    }

    // static : 공유 자원의 의미
    public static void main(String[] args) {
        int result = sum(100, 200);
        System.out.println("sum 이라는 함수 이용해서 결과 출력 : " + result);

        int resultt = sub(5, 10);
        System.out.println("sub이라는 함수 이용해서 결과 출력 : " + resultt);
        // 정적인 메소드 하나 만들어서, 곱하기 기능
        // result
        int i = 20;
        int s;
        char a;

        s = sum(i, 10);
        a = '?';

        System.out.println(a);
        System.out.println("Hello");
        System.out.println(s);
    }
}
