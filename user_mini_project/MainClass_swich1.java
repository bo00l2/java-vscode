package user_mini_project;

import java.util.Scanner;

import ch03.Exs_ch03;

public class MainClass_swich1 {
    public static void main(String[] args) {
        // 공용으로 사용할 스캐너 생성
        Scanner scanner = new Scanner(System.in);
        // 재사용 클래스 이름 : Exs_ch03, 화면 그리는 정적 메소드 : ex_user_ui
        Exs_ch03.ex_user_ui(scanner);

        // 두번째, switch 형태의 조건문
    }
}
