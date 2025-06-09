package d250609.ch04;

public class GetSetEx {
    // public String name; // 외부에서 직접 접근이 가능한 문제점 발견
    private String name;
    private String email;
    private String password;

    // 매개변수가 3개인 생성자
    public GetSetEx(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void showinfo() {
        System.out.println("이름 : " + name);
        System.out.println("이메일 : " + email);
        System.out.println("패스워드 : " + password);
    }

    // Getter : 데이터를 가져오는 역할
    // Setter : 데이터를 쓰는 역할
    // private 접근 지정자를 사용하는 이유
    // : 외부에서 해당 데이터의 직접 접근을 막기 위해서
    // 캡슐화, 데이터 은닉, 숨기기.
    // -> 해당 인스턴스 직접 값을 변경하게 되면,
    // 불변성 또는 데이터 일관성 등이 깨지는 확률이 생김

    // 외부에서 조회하는 경우, Getter 사용
    public String getName() {
        return this.name; // 현재 인스턴스에 설정이 된 이름
    }

    public String getEmail() {
        return this.email;
    }

    public String getpassword() {
        return this.password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    // 외부에서 조회하는 경우, Setter 사용

    // 불변성 이유로, Setter보다는, 데이터를 변경하는 메서드를 따로 작업함

}
