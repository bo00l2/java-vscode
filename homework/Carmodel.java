package homework;

public class Carmodel {
    String model;
    String company;
    String older;
    String date;

    public Carmodel(String model, String company, String older, String date) {
        this.model = model;
        this.company = company;
        this.older = older;
        this.date = date;
    }

    // 메소드
    public void showinfo() {
        System.out.println("모델명 : " + this.model);
        System.out.println("제조사 : " + this.company);
        System.out.println("연식 : " + this.older);
        System.out.println("등록일 : " + this.date);
    }

    public String getmodel() {
        return model;
    }

    public String getCompany() {
        return company;
    }
}