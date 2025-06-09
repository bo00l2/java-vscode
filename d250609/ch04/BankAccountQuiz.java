package d250609.ch04;

public class BankAccountQuiz {
    private String owner;
    public static int accountCount;

    public static final double INTEREST_RATE = 0.02;

    public BankAccountQuiz(String owner) {
        this.owner = owner;
        accountCount++;
    }

    public void showinfoTotal() {
        System.out.println("현재 총 계좌개설건수 : " + accountCount);
        System.out.println("현재 이자율 : " + INTEREST_RATE);
    }
}
