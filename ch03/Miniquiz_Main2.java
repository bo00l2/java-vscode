package ch03;

import java.util.Scanner;

public class Miniquiz_Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 사용자로부터 정수 5개 입력받아 배열에 저장하고 역순 출력
        // Exs_ch03.Reverse(scanner);

        // 3x3 배열을 만들어 모든 요소에 1~9 채우고 출력
        // Exs_ch03.Ninearray();

        // 문자열 배열을 메서드로 받아 가장 긴 문자열을 반환
        Miniquiz_func2.Longstr(scanner);

        Miniquiz_func2.generateRandomStrings(5);
    }

}
