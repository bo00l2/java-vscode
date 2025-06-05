package util.model;

public class Member {
    // 멤버 변수
    // 이름, 패스워드, 이메일, 등록일, 모두 문자열 형태
    // 생성자는 매개변수 4개 구성
    // 각각 정보를 호출하는 인스턴스 메서드 생성

    String name;
    String password;
    String email;
    String date;

    public Member(String name, String password, String email, String date) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.date = date;
    }

    public void showinfo() {
        System.out.println("회원 이름 : " + this.name);
        System.out.println("회원 이메일 : " + this.password);
        System.out.println("회원 패스워드 : " + this.email);
        System.out.println("회원 등록일 : " + this.date);
    }

    // 검색 - 해당 이름, 이메일 정보 조회하는 기능
    // getter
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
