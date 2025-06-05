package user_mini_project;

import java.util.Random;
import java.util.Scanner;

import ch02.OperConditionTest;
import util.Random.RandomUtil;
import util.User.UserService;

public class MainClass_swich {
    public static void main(String[] args) {
        // 공용으로 사용할 스캐너 생성
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("========================================================");
            System.out.println("회원 관리 시스템에 오신 것을 환영합니다. 배운거 복습 적용해보기");
            // 순서3
            // 3번 메뉴 추가
            System.out.println("1. 회원 가입  2.로그인 3.산술 연산자 테스트  4.산술 연산자 테스트2  0.종료");
            System.out.println("5. 로또 번호");
            System.out.println("========================================================");
            System.out.println("메뉴 번호를 선택해주세요 (0~4): ");
            // 사용자가 입력한 번호를 문자열 형태로 받기
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    UserService.registerUser(scanner);
                    break;
                case "2":
                    UserService.login(scanner);
                    break;
                case "3":
                    OperConditionTest.oper1();
                    break;
                case "4":
                    OperConditionTest.oper2();
                    break;
                case "5":
                    RandomUtil.generateLottoNum();
                    break;
                case "0":
                    System.out.println("프로그램을 종료합니다. 감사합니다!");
                    scanner.close();
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 0, 1, 2 중에서 선택해주세요.");
                    break;
            }
            // 두번째, switch 형태의 조건문
        }
    }
}