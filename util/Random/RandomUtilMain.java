package util.Random;

public class RandomUtilMain {
    // 실행용 클래스
    public static void main(String[] args) {
        System.out.println("Math.random" + RandomUtil.generateRandom());
        System.out.println("1이상 10 이하 사이의 랜덤 정수 " + RandomUtil.generateRandomInRange(1, 10));
        // 랜덤한 숫자 생성하는 기능
        // 로또 번호 생성
        // 각각 6자리 숫자를 따로 받아서 출력만 한번에 생성하는 기능
        // 정적 메소드를 만들어서 출력 문장에 랜덤 숫자 6개 보여주기 형식
        // 출력 : 나의 자동 로또 번호 생성기 사용한 번호 :
        // 조건문 활용, 중복된 수 발생하지 않도록
        System.out.println("나만의 로또 번호 생성 프로그램");
        RandomUtil.generateLottoNum();
    }
}
