package ch03;

import java.util.Scanner;

public class Miniquiz_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;

        do {
            System.out.println("도서 관리 프로그램 예시");
            System.out.println("===========================================");
            System.out.println("1. 도서 추가, 2. 도서 조회, 3. 도서 수정, 4. 도서 삭제, 5. 더미 데이터 추가, 6. 도서 검색, 0. 종료");
            System.out.println("===========================================");
            System.out.println("메뉴를 선택하세요(0~4): ");
            menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    Miniquiz_func.addUser(scanner);
                    break;
                case 2:
                    Miniquiz_func.updateUser(scanner);
                    break;
                case 3:
                    Miniquiz_func.viewUser();
                    break;
                case 4:
                    Miniquiz_func.deleteUser(scanner);
                    break;
                case 5:
                    Miniquiz_func.addDummyUser();
                    break;
                case 6:
                    Miniquiz_func.searchUser(scanner);
                    System.out.println("회원 검색 기능이 실행되었습니다.");
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 메뉴 선택입니다. 다시 시도하세요.");
                    break;
            }
        } while (menu != 0);

    }
}
