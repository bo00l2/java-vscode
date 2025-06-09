package d250609.ch05_3;

public class PhoneEx1_2 {
    // 부모 클래스
    private String company;
    private String name;
    private String price;

    // 기능
    public void powerOn() {
        System.out.println("전원 켜기");
    };

    public void powerOff() {
        System.out.println("전원 끄기");
    };

    public void callPhone() {
        System.out.println("전화 걸기");
    };

    public void showinfo() {
        System.out.println("제조사 : " + company);
        System.out.println("제품명 : " + name);
        System.out.println("가격 : " + price);
    }

    // 우클릭 -> 소스 작업 -> 반자동으로 작성
    // 기본 생성자 따로 만들기
    public PhoneEx1_2() {
    };

    public PhoneEx1_2(String company, String name, String price) {
        this.company = company;
        this.name = name;
        this.price = price;
    }

    // getter
    public String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    // setter
    public void setCompany(String company) {
        this.company = company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
