package d250609.ch05;

public class Animal_Ex1 {
    protected String name;

    public Animal_Ex1() {
    }

    public void speak() {
        System.out.println("동물 소리를 냅니다.");
    }

    public Animal_Ex1(String name) {
        this.name = name;
    }
}
