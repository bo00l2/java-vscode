package ch02;

import java.util.Scanner;

public class Scanner_test {
    public static void main(String[] args) {
        System.out.println("Scanner test 시작");
        // Scanner : 자바에서 사용자의 입력을 받는 방법
        // 자주 사용하는 메서드 : next(), nextInt(), nextDouble(),nextLine()
        // next() : 공백 전까지 문자열 입력
        // nextLine() : 한 줄 전체 문자열 입력
        // nextBoolean() : T or F
        // hasNext(): 다음에 입력할 값이 있는지 확인하는 메서드

        // 기본 문법 형식
        // import : 다른 클래스를 가져오는 명령어
        // java.util.Scanner : java 폴더 -> util 폴더 -> Scanner 클래스
        // 순서1
        // import.util.Scanner;
        // Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        // 이름 입력 받기
        System.out.print("이름을 입력하세요 : ");
        String name = scanner.nextLine();
        System.out.println("이름 : " + name);

        // 퀴즈1, 좋아하는 숫자 입력 받기
        System.out.print("좋아하는 숫자를 입력하세요 : ");
        int num = scanner.nextInt();
        System.out.println("숫자 : " + num);

        // 퀴즈2
        // 새로운 ScannerTest2 클래스 만들기
        // 회원가입 해보기
        // 출력 내용
        // 김보영 홈피 회원가입
        // 이름을 입력해주세요 >
        // 이메일을 입력해주세요 >
        // 패스워드를 입력해주세요 >
        // 패스워드 한번 더 입력해주세요 >
        // 회원가입 완료되었습니다.
        scanner.close();

    }
}
