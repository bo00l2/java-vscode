package ch04;

public class Phone {

    String model; // 차종, 세단, suv
    String price; // 가격
    String company;

    public Phone() {

    }

    public Phone(String model, String price) {
        this.model = model;
        this.price = price;
    }

    public Phone(String model, String price, String company) {
        this.model = model;
        this.price = price;
        this.company = company;
    }

    public void showinfo2() {
        System.out.println("모델명 : " + this.model);
        System.out.println("가격 : " + this.price);
        System.out.println("제조사 : " + this.company);
    }
}
