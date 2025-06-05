package homework;

import java.util.Scanner;

import homework.Carpro;

public class Car {
    public static void CarMenu(Scanner scanner) {
        int Menu;

        do {
            System.out.println("자동차 관리 프로그램 예시");
            System.out.println("===========================================");
            System.out.println("1. 자동차 추가, 2. 자동차 조회, 3. 자동차 수정, 4. 자동차 삭제, 5. 더미 데이터 추가, 6. 자동차 검색, 0. 종료");
            System.out.println("===========================================");
            System.out.println("메뉴를 선택하세요(0~4): ");
            Menu = scanner.nextInt();
            scanner.nextLine();

            switch (Menu) {
                case 1:
                    Carpro.addModel(scanner);
                    break;
                case 2:
                    Carpro.viewModel();
                    break;
                case 3:
                    Carpro.updateModel(scanner);
                    break;
                case 4:
                    Carpro.deleteModel(scanner);
                    break;
                case 5:
                    Carpro.addDummyModel();
                    break;
                case 6:
                    Carpro.searchModel(scanner);
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 메뉴 선택입니다. 다시 시도하세요.");
                    break;
            }
        } while (Menu != 0);
    }
}
