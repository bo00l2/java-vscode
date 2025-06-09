package d250609.ch05_3;

public class GalaxyEx1_3 extends PhoneEx1_2 {
    private String logo;

    public void logoinfo() {
        System.out.println("로고 : " + logo);
    }

    public String getLogo() {
        return logo;
    }

    public GalaxyEx1_3(String company, String name, String price, String logo) {
        super(company, name, price);
        this.logo = logo;
    }

}
