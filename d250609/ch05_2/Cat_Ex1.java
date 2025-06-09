package d250609.ch05_2;

import d250609.ch05.Animal_Ex1;

// 자식 클래스이므로 부모의 멤버 변수 접근 가능함
public class Cat_Ex1 extends Animal_Ex1 {
    String food;

    public void showinfo() {
        System.out.println("좋아하는 음식 : " + food);
        // 상속을 받지 않고 다른 패키지의 클래스 멤버에 접근

    }

    public Cat_Ex1() {
        super();
    };

    public Cat_Ex1(String name, String food) {
        super(name);
    }
}
