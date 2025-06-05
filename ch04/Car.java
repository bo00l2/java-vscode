package ch04;

public class Car {
    // 객체 : 클래스로부터 만들어진 실체(인스턴스)
    // 생성자 : 객체를 생성시 자동으로 호출되는 특별한 메소드

    // 멤버 변수
    String model; // 차종, 세단, suv
    String price; // 가격
    String company; // 제조사

    // 생성자
    // 1) 기본 생성자
    // 2) 매개변수 생성자

    // 메소드
    public void showinfo() {
        System.out.println("모델명 : " + this.model);
        System.out.println("가격 : " + this.price);
        System.out.println("제조사 : " + this.company);
    }
}
