package ch02;

public class Hello0530 {
    public static void main(String[] args) {
        System.out.println();
        // 만들었던 클래스를 불러와서, 재사용 해보기
        // 자기소개 및, 간단 계산 해보기
        // 자기소개
        String myinfo = Introduce.info("김보영", "01025082333", "kby2333@naver.com");
        System.out.println(myinfo);

        String myhobby = Introduce.info2("김치찌개", "스꾸", "X");
        System.out.println(myhobby);

        // 퀴즈
        // Introduce 클래스에 정의한 사칙연산 메소드 재사용
        int result1 = Introduce.plus(2, 3);
        System.out.println("더하기 : " + result1);

        int result2 = Introduce.sub(10, 7);
        System.out.println("빼기 : " + result2);

        int result3 = Introduce.mul(5, 6);
        System.out.println("곱 : " + result3);

        int result4 = Introduce.div(12, 3);
        System.out.println("나누기 : " + result4);

    }
}
