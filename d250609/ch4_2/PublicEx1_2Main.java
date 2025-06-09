package d250609.ch4_2;

import d250609.ch04.PublicEx1;

public class PublicEx1_2Main {
    public static void main(String[] args) {
        // 다른 패키지 클래스
        PublicEx1 publicEx1 = new PublicEx1();
        publicEx1.email = "kby@naver.com";
        // public으로 선언된 인스턴스 멤버만 보임
    }
}
