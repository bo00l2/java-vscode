package d250609.ch05_3;

public class IphoneEx1_4 extends PhoneEx1_2 {
    private String sellPlace;

    public void sellInfo() {
        System.out.println("판매처 : " + sellPlace);
    }

    // 생성자
    public IphoneEx1_4(String sellPlace) {
        this.sellPlace = sellPlace;
    }

    // 매개변수 4개인 생성자
    public IphoneEx1_4(String company, String name, String price, String sellPlace) {
        super(company, name, price);
        this.sellPlace = sellPlace;
    }

}
