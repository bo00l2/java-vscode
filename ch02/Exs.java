package ch02;

import java.util.Scanner;

public class Exs {
    public static void getSeason() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름 : ");
        // String name = scanner.nextLine();

        System.out.println("좋아하는 월 : ");
        int month = scanner.nextInt();

        switch (month) {
            case 3, 4, 5:
                System.out.println("봄");
                break;
            case 6, 7, 8:
                System.out.println("여름");
                break;
            case 9, 10, 11:
                System.out.println("가을");
                break;
            case 12, 1, 2:
                System.out.println("겨울");
                break;
            default:
                break;
        }
        scanner.close();
    }

    public static String getTernaryExam(int score) {
        String result = (score >= 60) ? "합격" : "불합격";
        return result;
    }

    public static void getIncDecExam() {
        int a = 10;

        System.out.println("a++: " + (a++));
        System.out.println("결과 1 a: " + a);
        System.out.println("++a: " + (++a));
        System.out.println("결과 2 a: " + a);
    }

    public static String getTypeExam() {
        // long num1 = 100L; // 8byte
        // long num2 = 100;// 왼쪽 : 8바이트 , 오른쪽 : 정수 4바이트
        // int 타입 100을 long 타입으로 형변환 -> 자동 형변환
        // 작은 쪽 -> 큰 쪽으로 형변환 시에만 문제가 안됨

        // 반대로, 큰 쪽에서 작은 쪽으로 형변환 시에는, 강제로 형변환
        // byte num3 = 127; // 128은 byte 타입의 범위를 벗어남
        int num4 = 128;
        // 강제로 형변환
        // 값의 손실이 발생하거나, 정상적인 출력 안나옴
        byte num5 = (byte) num4;
        System.out.println("num5: " + num5);
        return "곧 결과 반환하거나 출력만 할 예정";
    }

    // 정적 메소드 이용
    // 확인 상황, 파이널 ,상수 확인 및 원 면적 구하는 기능
    // 반지름을 매개변수로 받고, 원의 면적 문자열 타입으로 반환
    public static String getCircleArea(double r) {
        final double PI = 3.14159;
        if (r < 0) {
            return "반지름은 음수가 될 수 없습니다.";
        }
        double area = PI * r * r;
        String result = String.format("반지름 %.2f의 원의 면적은 %.2f입니다.", r, area);
        return result;
    }

}
