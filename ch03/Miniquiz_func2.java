package ch03;

import java.util.Scanner;

public class Miniquiz_func2 {
    public static void Reverse(Scanner scanner) {
        // 입력한 정수 역순 출력
        int[] num = new int[5];
        System.out.println("정수 5개를 입력하시오 : ");

        for (int i = 0; i < 5; i++) {
            num[i] = scanner.nextInt();
        }

        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
    }

    public static void Ninearray() {
        int[][] Nine = new int[3][3];

        int i, j;
        for (i = 1; i < Nine.length; i++) {
            for (j = 1; j < Nine[i].length; j++) {
                System.out.print(Nine[i][j] + " ");
            }
        }
    }

    public static void Longstr(Scanner scanner) {
        String[] Longstr = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("문자열을 입력하세요 : ");
            Longstr[i] = scanner.nextLine();
        }

        for (int i = 0; i < Longstr.length; i++) {
            System.out.println(Longstr[i]);
        }

        String longest = Longstr[0];
        // 문자열 입력 이후에 초기화를 시켜줘야함

        for (int i = 1; i < Longstr.length; i++) {
            if (Longstr[i].length() > longest.length()) {
                longest = Longstr[i];
            }
        }

        System.out.println("가장 긴 문자열: " + longest);

    }

    // 임의로, 크기가 5개인, 문자열의 길이는 10개이하인, 랜덤한 문자열을 생성하는 메서드
    // 반환 타입 : 문자열 배열 ,
    public static String[] generateRandomStrings(int size) {
        // size : 생성할 문자열의 개수
        String[] randomStrings = new String[size];
        String characters = "abcdefghijklmnopqrstuvwxyz"; // 소문자 알파벳,26

        for (int i = 0; i < size; i++) {
            int length = (int) (Math.random() * 10) + 1; // 1~10 사이의 길이
            // StringBuilder: 문자열인데, 메모리 절약하는 문자열이다.
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < length; j++) {
                int index = (int) (Math.random() * characters.length()); // 0 ~ 25 사이의 랜덤 인덱스
                sb.append(characters.charAt(index)); // 랜덤 문자 추가
            }

            randomStrings[i] = sb.toString(); // 문자열로 변환하여 배열에 저장
        }

        return randomStrings; // 생성된 문자열 배열 반환
    }
}
