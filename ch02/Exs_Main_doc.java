package ch02;

public class Exs_Main_doc {
    public static void main(String[] args) {
        // 퀴즈
        // 사용자 이름 입력 받고, 좋아하는 월 입력 받고
        // 좋아하는 월에 따른, 계절 출력 봄(3-5),여름(6-8),가을(9-11),겨울(12-2)
        // 조건문 이용
        Exs.getSeason();
        System.out.println("계절 예시");

        String result = Exs.getTernaryExam(75);
        System.out.println("삼항 연산자 예시 : " + result);

        Exs.getIncDecExam();
        System.out.println("------------------------");
        Exs.getTypeExam();// 강제 형변환 예시

        System.out.println("파이널 상수를 이용한 원 면적 구하기");

        // String result = Exs.getCircleArea(5.0);
        // System.out.println(result);
    }
}
