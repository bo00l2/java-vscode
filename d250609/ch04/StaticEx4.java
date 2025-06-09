package d250609.ch04;

public class StaticEx4 {
    // static : 클래스 단위로 공유되는 필드 / 메서드
    String name;

    // 모든 클래스가 공유하는 변수
    static int studentCount = 0;

    public StaticEx4(String name) {
        this.name = name;
        // 공유 변수인 학생 수를 카운트하는 변수 증가
        studentCount++;
    }

    // 인스턴스 메서드
    // 객체 생성후 인스턴스명으로 호출
    public void showinfo() {
        System.out.println("이름 : " + name);
    }

    // 스태틱 메서드
    // 클래스명으로 바로 사용이 가능
    // A : 클래스명
    // A.showinfoTotal()
    public static void showinfoTotal() {
        System.out.println("총 학생수 : " + studentCount);
    }
}
