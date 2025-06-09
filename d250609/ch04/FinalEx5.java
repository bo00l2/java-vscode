package d250609.ch04;

public class FinalEx5 {
    // final : 값 변경 금지(변수에 사용시) -> 상수가 됨
    // 메서드 -> final 사용시, 오버라이딩 금지
    // 클래스 -> final 사용시, 상속 금지

    public static final double PI = 3.14159;

    public void Circle(double radius) {
        double result = radius * radius * PI;
        System.out.println("원 면적 : " + result);
    }

    // 주의사항
    // 1) 인스턴스 변수, 스태틱 변수 구분 -> static 있냐, 없냐
    // 2) 스태틱 변수에 접근시, 클래스명으로 접근 해야하고,
    // 3) 인스턴스 변수명으로 접근 안하기 / 메모리적으로 저장 공간 위치가 다름
    // A a = new A(); a : 인스턴스명 A : 클래스
    // a.studentCount (X) , A.studentCount (O)

}
