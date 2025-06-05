package ch03;

import java.util.Scanner;

import util.Date.DateUtil;

public class Miniquiz_func {

    static final int MAX_USERS = 100; // 최대 회원 수
    // 이름 , 이메일, 패스워드, 등록일을 저장할 배열 선언
    static String[] bookNames = new String[MAX_USERS];
    static String[] authors = new String[MAX_USERS];
    static String[] publishers = new String[MAX_USERS];
    static String[] dates = new String[MAX_USERS];
    static int bookCount = 0;

    // 회원 추가 메서드
    public static void addUser(Scanner scanner) {

        if (bookCount < MAX_USERS) {
            System.out.println("도서명을 입력하세요 : ");
            String bookName = scanner.nextLine();
            bookNames[bookCount] = bookName;

            System.out.println("저자 이름을 입력하세요 : ");
            String authorName = scanner.nextLine();
            authors[bookCount] = authorName;

            System.out.println("출판사를 입력하세요 : ");
            String publisherName = scanner.nextLine();
            publishers[bookCount] = publisherName;

            String date = DateUtil.getCurrentDateTime();
            dates[bookCount] = date; // 등록일 저장

            bookCount++;

            System.out.println("도서가 추가되었습니다: " + bookName + ", " + authorName + ", " + date);
        } else {
            System.out.println("도서의 수가 최대치를 초과했습니다.");
        }
    }

    // 회원 조회 메서드
    public static void viewUser() {
        if (bookCount == 0) {
            System.out.println("등록된 도서이 없습니다.");
            return;
        }
        System.out.println("등록된 도서 목록: ");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("인덱스 번호 : " + i + ", " + (i + 1) + ". " + bookNames[i] + ", " + authors[i] + ", "
                    + dates[i]);
        }
    }

    // 회원 수정 메서드
    // 회원 전체 목록에서, 해당 회원 인덱스 번호를 이용해서, 회원 정보 수정
    public static void updateUser(Scanner scanner) {
        System.out.println("수정할 도서의 인덱스를 입력해주세요.(0~" + (bookCount - 1) + "): ");

        int index = scanner.nextInt();
        if (index < 0 || index >= bookCount) {
            System.out.println("잘못된 인덱스 입니다.");
            return;
        }
        System.out.println("수정할 도서의 이름을 입력하세요 : ");
        String bookName = scanner.nextLine();
        bookNames[index] = bookName;

        System.out.println("수정할 저자의 이름을 입력하세요 : ");
        String authorName = scanner.nextLine();
        authors[index] = authorName;

        System.out.println("수정할 도서의 출판사를 입력하세요 : ");
        String publisherName = scanner.nextLine();
        publishers[index] = publisherName;

        String registrationDate = DateUtil.getCurrentDateTime();
        dates[index] = registrationDate; // 등록일 수정

        System.out.println("도서 정보가 수정되었습니다: " + bookNames[index] + ", " + authors[index]);
    }

    // 회원 삭제 메서드
    public static void deleteUser(Scanner scanner) {
        System.out.println("삭제할 도서의 인덱스를 입력하세요 (0 ~ " + (bookCount - 1) + "): ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= bookCount) {
            System.out.println("잘못된 인덱스 입니다.");
            return;
        }

        // 삭제할 회원 정보 출력
        System.out.println("삭제할 도서 정보: " + bookNames[index] + ", " + authors[index] + ", " + dates[index]);

        // 해당 인덱스의 회원 정보를 삭제하고, 뒤에 있는 회원 정보를 앞으로 이동
        for (int i = index; i < bookCount - 1; i++) {
            bookNames[i] = bookNames[i + 1];
            authors[i] = authors[i + 1];
            publishers[i] = publishers[i + 1];
            dates[i] = dates[i + 1];
        }
        // 마지막 회원 정보는 null로 설정
        bookNames[bookCount - 1] = null;
        authors[bookCount - 1] = null;
        publishers[bookCount - 1] = null;
        dates[bookCount - 1] = null;

        // 회원 수 감소
        bookCount--;
        System.out.println("도서가 삭제되었습니다.");
    }

    // 회원 더미 데이터 5개 추가
    public static void addDummyUser() {
        for (int i = 0; i < 5; i++) {
            if (bookCount < MAX_USERS) {
                bookNames[bookCount] = "더미도서" + (i + 1);
                authors[bookCount] = "김보영" + (i + 1) + "저자";
                publishers[bookCount] = "보영출판사" + (i + 1);
                dates[bookCount] = DateUtil.getCurrentDateTime();
                bookCount++;
            } else {
                System.out.println("더미 도서 추가 실패: 최대 도서 수 초과");
                break;
            }
        }
        System.out.println("더미 도서 5권이 추가되었습니다.");
    }

    // 회원 검색 기능
    public static void searchUser(Scanner scanner) {
        System.out.println("검색할 도서의 이름 또는 저자를 입력하세요: ");

        String targetauthorName = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < bookCount; i++) {
            if (authors[i].equals(targetauthorName)) {
                System.out.println("검색 결과: " + (i + 1) + ". " + bookNames[i] + ", " + authors[i] + ", "
                        + dates[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("해당 이메일로 등록된 회원이 없습니다.");
        }
    }
}
