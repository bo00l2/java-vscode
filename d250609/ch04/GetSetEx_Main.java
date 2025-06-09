package d250609.ch04;

public class GetSetEx_Main {
    public static void main(String[] args) {
        GetSetEx gettersetterEx = new GetSetEx("김보영", "kby@naver.com", "1234");

        // public, 외부에서 직접 데이터에 접근
        // 설계 클래스에서 -> name에 대해서, public -> private 변경
        // 직접 접근 수정 불가
        // gettersetterEx.name = "직접 접근해서 이름 수정 김보영";
        // private, 데이터 직접 접근을 막는다.
        // gettersetterEx.email = "kby@naver.com 수정";
        // gettersetterEx.password = "password 수정";
        gettersetterEx.showinfo();
        System.out.println("Getter 라는 메서드를 이용해서, 각 멤버 변수 하나 조회 확인");
        System.out.println("이름 조회 : " + gettersetterEx.getName());
        System.out.println("이메일 조회 : " + gettersetterEx.getEmail());
        System.out.println("패스워드 조회 : " + gettersetterEx.getpassword());
        System.out.println("Setter 메서드를 이용해서, 각 멤버 변수 값 설정 확인");

        gettersetterEx.setName("김보영 setter로 수정");
        gettersetterEx.setEmail("kby@naver.com setter로 수정");
        gettersetterEx.setpassword("1234 setter로 수정");
        System.out.println("Setter를 이용해서, 데이터 변경하고, 값 확인");
        gettersetterEx.showinfo();
    }
}
