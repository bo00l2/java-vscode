package util.User;

import java.util.Scanner;

import util.Date.DateUtil;

public class UserService {
    // 회원가입 기능, 정적 메소드 생성
    // 콘솔로 입력 받고, 결과를 문자열로 반환하는 기능 포함
    // 추후 업그레이드는 반환 타입을 : 문자열에서, 사용자 클래스 객체로 변경 예정.
    // 메인 메소드가 없음, 왜냐하면! 실행을 여기서 안함
    // = 설계용 클래스
    public static void registerUser(Scanner scanner) {

        System.out.println("김보영 홈피 회원가입");

        System.out.print("이름을 입력해주세요 > ");
        String name = scanner.next();

        System.out.print("이메일을 입력해주세요 > ");
        String email = scanner.next();

        System.out.print("패스워드를 입력해주세요 > ");
        String password = scanner.next();

        // 기능 추가
        // ============================================================================
        // String password;
        // while 문에서, 패스워드 부분이 입력이 맞으면 다음 단계, 아니면 , 계속 확인하기.
        while (true) {
            System.out.println("패스워드 입력해주세요 > ");
            password = scanner.nextLine(); // 패스워드 입력 받기

            System.out.println("패스워드 확인 입력해주세요 > ");
            String password2 = scanner.nextLine(); // 패스워드 입력 받기

            // 패스워드가 비어있지 않은지 확인
            if (password.isEmpty()) {
                System.out.println("패스워드는 비워둘 수 없습니다. 다시 입력해주세요.");
            } else if (password.equals(password2)) { // 패스워드와 확인 입력이 일치하는지 확인
                System.out.println("패스워드가 일치합니다");
                break; // 패스워드가 일치하면 루프 종료
            } else {
                System.out.println("패스워드가 일치하지 않습니다. 다시 입력해주세요.");
            }
        }
        // 기능 추가
        // ============================================================================

        String regDate = DateUtil.getCurrentDateTime();

        System.out.println("이름 : " + name + "\n이메일 : " + email +
                "\n패스워드 : " + password);
        System.out.println("가입 날짜 : " + regDate);
        System.out.println("회원 가입 완료되었습니다.");

    }

    public static void login(Scanner scanner) {
        System.out.print("로그인 이메일을 입력해주세요 > ");
        String logemail = scanner.next();

        System.out.print("로그인 패스워드를 입력해주세요 > ");
        String logpassword = scanner.next();

        System.out.println("로그인 이메일 정보 : " + logemail);
        System.out.println("로그인 패스워드 정보 : " + logpassword);
        System.out.println("로그인 완료되었습니다. 현재 임시로 단순 출력용입니다.");
    }

}
