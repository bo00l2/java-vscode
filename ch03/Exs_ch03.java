package ch03;

import java.util.Scanner;

public class Exs_ch03 {

    // 기본 예외 처리 방법
    // try{ } 예외가 발생할 수 있는 코드 블록 : 실험장 -> catch로 던짐
    // catch(예외타입 e) {}
    // finally {} 예외 발생 여부와 상관없이 항상 실행되는 코드 블록

    public static void ex3_9_exception() {
        int a = 10;
        int b = 0;
        try {
            // 정상인 경우 : 순서 1 -> 2 -> 4
            // 예외인 경우 : 순서 1 -> 3 -> 4
            int result = a / b;// 1
            System.out.println("결과 : " + result);// 2
        } catch (ArithmeticException e) {
            // 3
            System.out.println("0으로 나눌 수 없음. 예외 메시지: " + e.getMessage());
        } finally {
            // 4
            System.out.println("예외 처리 블록이 끝났습니다.");
        }

    }

    // 배열 타입으로 리턴
    public static void ex3_8() {
        // 기본 1차원 ㄴ배열
        // int[] numbers = new int[5];
        int[] numbers2 = { 1, 2, 3, 4, 5 };
        // 첫번째, 각 요소의 값을 하나씩 접근
        // numbers2의 인덱스 3 조회
        int value = numbers2[3];
        System.out.println("numbers2[3]의 값은: " + value);

        // 두번째, 향상된 for문 이용해서, 배열의 각 요소 출력
        for (int number : numbers2) {
            System.out.print(number + " ");
        }
    }

    // int [] : 리턴 타입 정수를 요소로 가지는
    // public static int[] ex3_8_return(){
    // int[] numbers2 = { 1, 2, 3, 4, 5 };
    // return number[];
    // }

    public static void ex3_7(Scanner scanner) {

        // 디버깅(검사), 순서도로 확인해보기
        int intArray[];
        intArray = new int[5];
        int max = 0; // 현재 가장 큰 수
        System.out.println("양수 5개를 입력하세요.");
        for (int i = 0; i < 5; i++) {
            intArray[i] = scanner.nextInt();
            // 입력 받은 정수를 배열에 저장
            if (intArray[i] > max)
                max = intArray[i]; // max 변경
        }
        System.out.print("가장 큰 수는 " + max + "입니다.");
    }

    // 회원 추가 관련 프로그램 UI 그리는 메소드
    public static void ex_user_ui(Scanner scanner) {
        int menu;

        do {
            System.out.println("회원 관리 프로그램 예시");
            System.out.println("===========================================");
            System.out.println("1. 회원 추가, 2. 회원 조회, 3. 회원 수정, 4. 회원 삭제, 5. 더미 데이터 추가, 6. 회원 검색, 0. 종료");
            System.out.println("===========================================");
            System.out.println("메뉴를 선택하세요(0~4): ");
            menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    Exs_ch3_2_user_array_doc.addUser(scanner);
                    break;
                case 2:
                    Exs_ch3_2_user_array_doc.updateUser(scanner);
                    break;
                case 3:
                    Exs_ch3_2_user_array_doc.viewUser();
                    break;
                case 4:
                    Exs_ch3_2_user_array_doc.deleteUser(scanner);
                    break;
                case 5:
                    Exs_ch3_2_user_array_doc.addDummyUser();
                    break;
                case 6:
                    Exs_ch3_2_user_array_doc.searchUser(scanner);
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 메뉴 선택입니다. 다시 시도하세요.");
                    break;
            }
        } while (menu != 0);
    }

    public static void ex3_6_3() {
        // 이중 배열
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("matrix[" + i + "] [" + j + "] :" + matrix[i][j] + "  "); // 각 요소 출력
            }
        }
        System.out.println();
    }

    public static void ex3_6_2() {
        int[] num = { 1, 2, 3, 4, 5 };

        for (int number : num) {
            System.out.println(number + " ");
        }
        System.out.println();
    }

    public static void ex3_6(Scanner scanner) {
        int intArray[];
        intArray = new int[5];
        int max = 0; // 현재 가장 큰 수
        System.out.println("양수 5개를 입력하세요.");
        for (int i = 0; i < 5; i++) {
            intArray[i] = scanner.nextInt();
            // 입력 받은 정수를 배열에 저장
            if (intArray[i] > max)
                max = intArray[i]; // max 변경
        }
        System.out.print("가장 큰 수는 " + max + "입니다.");
    }

    public static void ex3_5(Scanner scanner) {
        // continue 문 확인
        System.out.println("정수를 5개 입력하세요.");
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int n = scanner.nextInt();
            if (n <= 0)
                continue; // 0이나 음수인 경우 더하지 않고 다음 반복으로 진행
            else
                sum += n; // 양수인 경우 덧셈
        }
        System.out.println("양수의 합은 " + sum);
    }

    public static void ex3_4() {
        for (int i = 1; i < 10; i++) { // 단에 대한 반복. 1단에서 9단
            for (int j = 1; j < 10; j++) { // 각 단의 곱셈
                System.out.print(i + "*" + j + "=" + i * j); // 구구셈 출력
                System.out.print('\t'); // 하나씩 탭으로 띄기
            }
            System.out.println(); // 한 단이 끝나면 다음 줄로 커서 이동
        }
    }

    public static void ex3_3() {
        char a = 'a';
        do {
            System.out.print(a);
            a = (char) (a + 1);
        } while (a <= 'z');
    }

    // 퀴즈
    // 사용자로부터 문자를 입력받아, q가 나올 때까지 문자의 개수를 세는 프로그램 작성
    public static void StrQuiz(Scanner scanner) {

        String total = "";
        int count = 0;
        String word;

        System.out.println("문자를 입력하세요 (q를 입력하면 종료): ");
        while (true) {
            word = scanner.next();
            total += word;
            count++;
            if (word.equals("q")) {
                break;
            }
        }

        System.out.println("문자의 개수 : " + count);
    }

    // ex3-2, while 문
    // 0이 입력되면 while문 종료, 입력한 숫자들의 합 구하기
    public static void ex3_2(Scanner scanner) {

        int sum = 0;
        int input;

        System.out.println("숫자를 입력하세요 (0을 입력하면 종료): ");
        while (true) {
            input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            sum += input;
        }

        System.out.println("입력한 숫자의 합 : " + sum);
    }

    // ex3-1
    // 기본 for 이용해서, 1~10까지의 합을 구하기
    // 입력값에 원하는 숫자를 입력시, 1~n까지의 합을 구하는 메소드로 변경
    public static int getSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.print("1~10까지의 합 : " + sum);
        return sum;
    }
}
