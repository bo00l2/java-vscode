package d250609.ch05;

public class Dog_Ex1 extends Animal_Ex1 {
    // 자식 클래스
    // 부모의 멤버에 name있음
    private String nation;

    @Override // 애너테이션 : 컴파일러에게 라벨링(알려주기)

    public void speak() {
        System.out.println("난 멍멍이야, 그래서 멍멍함");
    }

    public Dog_Ex1() {
    };

    public Dog_Ex1(String name, String nation) {
        // 부모를 호출하는 키워드 필요 -> super()
        super(name);
        this.nation = nation;
    }

    public void showinfo() {
        System.out.println("이름 : " + name);
        System.out.println("나라 : " + nation);
    }
}
