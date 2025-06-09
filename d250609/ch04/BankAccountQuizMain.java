package d250609.ch04;

public class BankAccountQuizMain {
    public static void main(String[] args) {
        BankAccountQuiz bankAccountQuiz = new BankAccountQuiz("김보영");
        BankAccountQuiz bankAccountQuiz2 = new BankAccountQuiz("김보영2");
        BankAccountQuiz bankAccountQuiz3 = new BankAccountQuiz("김보영3");

        bankAccountQuiz.showinfoTotal();
    }
}
