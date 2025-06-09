package d250609.ch04;

public class FinalEx5Main {
    public static void main(String[] args) {
        FinalEx5 finalEx5 = new FinalEx5();
        finalEx5.Circle(0);

        // final로 정의한, 공유 상수 변경 시도 -> 변경 불가능
        // finalEx5.PI = 3.14;

        // 퀴즈
        // BankAccount 클래스
        // 멤버 변수 : 소유자 owner(String),

        // static
        // 계좌개설건수 accountCount (int)
        // 이자율 : 상수 final로 선언, : INTEREST_RATE = 0.02;

        // 매개 변수가 하나인 생성자 owner
        // 계좌 개설시, 계좌개설건수 자동 +
        // 현재 총 계좌건수 확인하는 메소드 : showinfo()
    }
}
