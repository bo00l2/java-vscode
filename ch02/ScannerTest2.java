package ch02;

import java.util.Scanner;

import util.User.UserService;

public class ScannerTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 클래스명.메소드명
        UserService.registerUser(scanner);
        UserService.login(scanner);
        scanner.close();
    }
    // 퀴즈,Add commentMore actions
    // 회원가입 기능 만들었고, 로그인 기능을 만들기.
    // 현재 디비가 없음. 그래서, 로그인 기능은

    // 콘솔로 이메일 입력받고, 패스워드 입력 받기.

    // 검증 없이, 단순 로그인 정보만 출력하기.

    // 힌트는 모두 문자열 해ds도 좋습니다.
    // 로그인 이메일 입력해주세요 >
    // 로그인 패스워드 입력해주세요 >

    // 출력 결과는
    // 로그인 이메일 정보 : {이메일}
    // 로그인 패스워드 정보 : {패스워드}
    // 로그인 완료되었습니다. 현재 임시로 단순 출력용입니다. 조금 있다. 검증도 추가 해보기.
    //
    // 메서드를, UserService 클래스에 , 정적 메소드로 추가해보기.
}
