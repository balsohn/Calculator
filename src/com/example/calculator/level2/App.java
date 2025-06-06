package com.example.calculator.level2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            // Scanner를 통해서 양의 정수 입력받기
            System.out.print("첫 번째 숫자를 입력해주세요: ");
            int num1;
            try {
                num1 = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력 가능합니다. 다시 시도해주세요.");
                sc.nextLine();
                continue;
            }

            System.out.print("두 번째 숫자를 입력해주세요: ");
            int num2;
            try {
                num2 = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력 가능합니다. 다시 시도해주세요.");
                sc.nextLine();
                continue;
            }

            // 사칙연산 기호 입력받기
            System.out.print("사칙연산 기호(➕,➖,✖️,➗) 을 입력해주세요: ");
            char operator = sc.nextLine().charAt(0);
            try {
                int result = calculator.calculate(num1, num2, operator);
                System.out.println("계산 결과: " + result);
                System.out.println("-------------------");
                if (calculator.getResults().size() > 5) {
                    calculator.removeFristResult();
                }
                System.out.println("모든 결과(최대 5개): " + calculator.getResults());
                System.out.println("-------------------");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            // 추가 계산 여부 확인
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String command = sc.nextLine();

            // 'exit'를 입력하면 반복 종료
            if (command.equalsIgnoreCase("exit")) {
                break;
            }
        }

        sc.close();
        System.out.println("계산기를 종료합니다.");
    }

}
