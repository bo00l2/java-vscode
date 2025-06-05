package homework;

import homework.Carmodel;
import util.Date.DateUtil;
// import util.model.Member;

import java.util.Random;
import java.util.Scanner;

// import javax.management.modelmbean.ModelMBean;

// 기능 클래스
public class Carpro {

    static final int MAX_USERS = 50;

    static String[] models = new String[MAX_USERS];
    static String[] companys = new String[MAX_USERS];
    static String[] olders = new String[MAX_USERS];
    static String[] dates = new String[MAX_USERS];
    static int CarCount = 0;

    static Carmodel[] Model = new Carmodel[MAX_USERS];

    // 추가 메서드
    public static void addModel(Scanner scanner) {
        if (CarCount < MAX_USERS) { // 자동차명, 제조사, 연식, 등록일
            System.out.println("자동차명을 입력하세요 : ");
            String model = scanner.nextLine();

            System.out.println("제조사를 입력하세요 : ");
            String company = scanner.nextLine();

            System.out.println("연식을 입력하세요 : ");
            String older = scanner.nextLine();

            String date = DateUtil.getCurrentDateTime();

            Model[CarCount] = new Carmodel(model, company, older, date); // Carmodel 인스턴스를 저장

            CarCount++;

            System.out.println("차종이 추가되었습니다: " + model + ", " + company + ", " + date);
        } else {
            System.out.println("차종 수가 최대치가 초과했습니다.");
        }
    }

    // 조회 메서드
    public static void viewModel() {
        if (CarCount == 0) {
            System.out.println("등록된 회원이 없습니다.");
            return;
        }
        System.out.println("등록된 회원 목록: ");
        for (int i = 0; i < CarCount; i++) {
            System.out.println("인덱스 번호 : " + (i + 1));

            Model[i].showinfo();
        }
    }

    // 수정 메서드
    public static void updateModel(Scanner scanner) {
        System.out.println("수정할 차종의 인덱스를 입력해주세요. (0~" + (CarCount - 1) + "): ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= CarCount) {
            System.out.println("잘못된 인덱스입니다.");
            return;
        }
        System.out.print("수정할 자동차명을 입력하세요 : ");
        String model = scanner.nextLine();

        System.out.print("수정할 제조사를 입력하세요 : ");
        String company = scanner.nextLine();

        String date = DateUtil.getCurrentDateTime();

        Carmodel Model = new Carmodel(model, company, company, date);
        models[index] = model;

        System.out.println("차량 정보가 수정되었습니다.");
    }

    // 삭제 메서드
    public static void deleteModel(Scanner scanner) {
        System.out.print("삭제할 차종의 인덱스를 입력하세요 (0 ~ " + (CarCount - 1) + "): ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= CarCount) {
            System.out.println("잘못된 인덱스입니다.");
            return;
        }

        Carmodel model = Model[index];
        System.out.println("삭제할 자동차 정보 : ");
        model.showinfo();

        models[index] = null;

        for (int i = 0; i < CarCount - 1; i++) {
            models[i] = models[i + 1];
        }

        // models[CarCount - 1] = null;
        // companys[CarCount - 1] = null;
        // olders[CarCount - 1] = null;
        // dates[CarCount - 1] = null;
        Model[CarCount - 1] = null;

        CarCount--;
        System.out.println("차가 삭제되었습니다.");
    }

    // 회원 더미 데이터 5개 추가
    public static void addDummyModel() {
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            if (CarCount < MAX_USERS) {
                int randomYear = 2000 + random.nextInt(25); // 2000 ~ 2024
                String older = String.valueOf(randomYear);

                Model[CarCount] = new Carmodel(
                        "더미차량" + (i + 1), "제조사" + (i + 1),
                        older, DateUtil.getCurrentDateTime());
                CarCount++;
            } else {
                System.out.println("더미 회원 추가 실패: 최대 회원 수 초과");
                break;
            }
        }
        System.out.println("더미 차량 5대 추가되었습니다.");
    }

    // 회원 검색 기능
    public static void searchModel(Scanner scanner) {
        System.out.println("검색할 자동차명을 입력하세요: ");

        String searchQuery = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < CarCount; i++) {
            if (Model[i].getmodel().contains(searchQuery) || Model[i].getCompany().contains(searchQuery)) {
                Model[i].showinfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("해당 이메일로 등록된 회원이 없습니다.");
        }
    }
}
