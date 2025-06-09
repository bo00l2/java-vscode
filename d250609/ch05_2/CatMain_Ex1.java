package d250609.ch05_2;

public class CatMain_Ex1 {
    public static void main(String[] args) {
        Cat_Ex1 cat_Ex1 = new Cat_Ex1();
        cat_Ex1.food = "소시지";
        cat_Ex1.showinfo();

        Cat_Ex1 cat_Ex2 = new Cat_Ex1("야옹님", "햄");
        cat_Ex2.showinfo();
        // cat_Ex2.name = "다른 클래스 멤버변수 접근 시도";
    }
}
