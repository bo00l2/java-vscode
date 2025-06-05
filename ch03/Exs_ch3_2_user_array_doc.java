package ch03;

import util.model.Member;
import java.util.Scanner;
import util.Date.DateUtil;

public class Exs_ch3_2_user_array_doc {
    /// 자동차 관리 프로그램
    /// 기능, 실행, 모델 클래스 만들기
    /// 자동차 정보 1) 자동차명 2) 제조사 3) 연식 4) 등록일
    /// 메서드 : showinfo() 만들기
    /// 자동차 정보 CRUD, 추가, 조회, 수정, 삭제, 검색, 더미데이터 구현

    // 회원 관리 프로그램 버전2, 저장소: 임시 메모리(배열) 이용할 예정
    // 조건 1) 회원 수는 100명 이하, 2) 회원 정보는 이름, 이메일, 패스워드 등록일로 구성
    // 회원 정보 CRUD, 추가, 조회, 수정, 삭제 기능 구현

    static final int MAX_USERS = 100; // 최대 회원 수
    // 이름 , 이메일, 패스워드, 등록일을 저장할 배열 선언
    static String[] names = new String[MAX_USERS];
    static String[] emails = new String[MAX_USERS];
    static String[] passwords = new String[MAX_USERS];
    static String[] dates = new String[MAX_USERS];
    static int userCount = 0;

    // ===========================================================

    // Memeber 클래스를 담을 배열 생성, 크기 100명
    static Member[] members = new Member[MAX_USERS];

    // 추가작업 1, 개요
    // 클래스 타입으로 데이터 모으기

    // 1) 회원 정보를 담아 둘 클래스 정의, Member 클래스 생성

    // 2) 회원 클래스를 담아 둘 배열 생성

    // 회원 추가 메서드
    public static void addUser(Scanner scanner) {

        if (userCount < MAX_USERS) {
            System.out.println("이름을 입력하세요 : ");
            String name = scanner.nextLine();

            System.out.println("이메일을 입력하세요 : ");
            String email = scanner.nextLine();

            System.out.println("패스워드를 입력하세요 : ");
            String password = scanner.nextLine();

            String date = DateUtil.getCurrentDateTime();

            // 사용자들로 입력 받은 정보를, 모델 클래스의 인스턴스 생성하는 곳에 사용
            Member member = new Member(name, password, email, date);

            members[userCount] = member;

            userCount++;

            System.out.println("회원이 추가되었습니다: " + name + ", " + email + ", " + date);
        } else {
            System.out.println("회원 수가 최대치를 초과했습니다.");
        }
    }

    // 회원 조회 메서드
    public static void viewUser() {
        if (userCount == 0) {
            System.out.println("등록된 회원이 없습니다.");
            return;
        }
        System.out.println("등록된 회원 목록: ");
        for (int i = 0; i < userCount; i++) {
            System.out.println("인덱스 번호 : " + i + ", " + (i + 1) + ". " + names[i] + ", " + emails[i] + ", "
                    + dates[i]);

            members[i].showinfo();
        }
    }

    // 회원 수정 메서드
    // 회원 전체 목록에서, 해당 회원 인덱스 번호를 이용해서, 회원 정보 수정
    public static void updateUser(Scanner scanner) {
        System.out.println("수정할 회원의 인덱스를 입력해주세요.(0~" + (userCount - 1) + "): ");

        int index = scanner.nextInt();
        if (index < 0 || index >= userCount) {
            System.out.println("잘못된 인덱스 입니다.");
            return;
        }
        System.out.println("수정할 회원의 이름을 입력하세요 : ");
        String name = scanner.nextLine();
        // names[index] = name;

        System.out.println("수정할 회원의 이메일을 입력하세요 : ");
        String email = scanner.nextLine();
        // emails[index] = email;

        System.out.println("수정할 회원의 패스워드를 입력하세요 : ");
        String password = scanner.nextLine();
        // passwords[index] = password;

        String registrationDate = DateUtil.getCurrentDateTime();
        // dates[index] = registrationDate; // 등록일 수정

        // 변경할 정보를 담을 Member 객체 생성
        Member member = new Member(name, password, email, registrationDate);
        members[index] = member;

        System.out.println("회원 정보가 수정되었습니다: " + names[index] + ", " + emails[index]);
    }

    // 회원 삭제 메서드
    public static void deleteUser(Scanner scanner) {
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= userCount) {
            System.out.println("잘못된 인덱스 입니다.");
            return;
        }

        // 삭제할 회원 정보 출력
        // members의 모양 : members = { member1, ... }
        //
        Member member = members[index];
        System.out.println("삭제할 회원 정보: ");
        member.showinfo();

        // members 배열에 하나의 값에만 null 입력
        members[index] = null;

        // 해당 인덱스의 회원 정보를 삭제하고, 뒤에 있는 회원 정보를 앞으로 이동
        for (int i = index; i < userCount - 1; i++) {
            // names[i] = names[i + 1];
            // emails[i] = emails[i + 1];
            // passwords[i] = passwords[i + 1];
            // dates[i] = dates[i + 1];
            members[i] = members[i + 1];
        }
        // 마지막 회원 정보는 null로 설정
        names[userCount - 1] = null;
        emails[userCount - 1] = null;
        passwords[userCount - 1] = null;
        dates[userCount - 1] = null;

        // 회원 수 감소
        userCount--;
        System.out.println("회원이 삭제되었습니다.");
    }

    // 회원 더미 데이터 5개 추가
    public static void addDummyUser() {
        for (int i = 0; i < 5; i++) {
            if (userCount < MAX_USERS) {
                // names[userCount] = "더미회원" + (i + 1);
                // emails[userCount] = "dummy" + (i + 1) + "@example.com";
                // passwords[userCount] = "password" + (i + 1);
                // dates[userCount] = DateUtil.getCurrentDateTime();
                members[userCount] = new Member(
                        "더미회원" + (i + 1), "password" + (i + 1),
                        "dummy" + (i + 1), "@example.com");
                userCount++;
            } else {
                System.out.println("더미 회원 추가 실패: 최대 회원 수 초과");
                break;
            }
        }
        System.out.println("더미 회원 5명이 추가되었습니다.");
    }

    // 회원 검색 기능
    public static void searchUser(Scanner scanner) {
        System.out.println("검색할 이름을 입력하세요: ");

        String searchQuery = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < userCount; i++) {
            // if (emails[i].equals(targetEmail)) {
            // System.out.println("- 회원 정보 - ");
            // System.out.println("이름 : " + names[i]);
            // System.out.println("이메일 : " + emails[i]);
            // System.out.println("가입일 : " + dates[i]);
            // found = true;
            // }
            // 변경, member, get 메서드 사용
            if (members[i].getName().contains(searchQuery) || members[i].getEmail().contains(searchQuery)) {
                members[i].showinfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("해당 이메일로 등록된 회원이 없습니다.");
        }
    }
}
