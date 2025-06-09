package d250609.ch04;

public class PublicEx1 {
    // 접근 지정자
    // public, private, protected, default

    // 각 접근 지정자 확인
    // 멤버 변수 설정
    private String name; // 외부 접근 불가
    public String email; // 모든 클래스 접근 가능
    String phone; // 생략가능한 default
    protected String hobby; // 같은 패키지, 상속 관계 클래스만 접근 가능

    // 기능 만들기
    public void showinfo() {
        System.out.println("이름 : " + this.name);
        System.out.println("이메일 : " + this.email);
        System.out.println("번호 : " + this.phone);
        System.out.println("취미 : " + this.hobby);
    }
}
