package d250609.ch04;

public class PublicEx1Main {
    // 같은 패키지 클래스
    public static void main(String[] args) {
        // 클래스 활용

        PublicEx1 publicEx1 = new PublicEx1();
        // 직접 접근은 인스턴스의 점(.)을 이용, 해당 멤버 변수에 접근
        publicEx1.email = "kby@naver.com"; // private 제외 나머지 멤버 ㄱㄴ
        publicEx1.phone = "123456";
        publicEx1.hobby = "다꾸";
        publicEx1.showinfo();
    }
}
