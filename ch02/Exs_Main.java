package ch02;

import java.util.Scanner;
import ch03.Exs_ch03;

public class Exs_Main {
    public static void main(String[] args) {

        Exs.getSeason();
        System.out.println("계절 예시");

        String result = Exs.getTernaryExam(75);
        System.out.println("삼항 연산자 예시 : " + result);

        Exs.getIncDecExam();
        System.out.println("------------------------");
        Exs.getTypeExam();

        System.out.println("파이널 상수를 이용한 원 면적 구하기");

        // String result = Exs.getCircleArea(5.0);
        // System.out.println(result);
    }
}
