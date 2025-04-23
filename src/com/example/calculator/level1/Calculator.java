package com.example.calculator.level1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Scanner를 통해서 양의 정수 입력받기
            System.out.print("첫 번째 숫자를 입력해주세요: ");
            int num1;
            try {
                num1 = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력 가능합니다. 다시 시도해주세요.");
                continue;
            }

            System.out.print("두 번째 숫자를 입력해주세요: ");
            int num2;
            try {
                num2 = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력 가능합니다. 다시 시도해주세요.");
                continue;
            }

            // 사칙연산 기호 입력받기
            System.out.print("사칙연산 기호(➕,➖,✖️,➗) 을 입력해주세요: ");
            char operator = sc.nextLine().charAt(0);

            int result = 0;
            boolean calculateSuccess = true;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("올바른 사칙연산 기호(➕,➖,✖️,➗) 를 입력해주세요.");
                    calculateSuccess = false;
                    break;
            }

            // 연산 성공했을경우 결과 출력
            if (calculateSuccess) {
                System.out.println("계산 결과: " + result);
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
