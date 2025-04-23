package com.example.calculator.level1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        // Scanner를 통해서 양의 정수 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력해주세요: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력해주세요: ");
        int num2 = sc.nextInt();

        // 사칙연산 기호 입력받기
        System.out.print("사칙연산 기호(➕,➖,✖️,➗) 을 입력해주세요: ");
        String operator = sc.nextLine();

        int result = 0;
        switch (operator.charAt(0)) {
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
                if (operator.length() == 1) {
                    System.out.println("올바른 연산자를 입력해주세요.");
                    break;
                } else {
                    System.out.println("연산자 기호는 하나만 입력 가능합니다.");
                    break;
                }
        }

        System.out.println("계산 결과: " + result);

        sc.close();
        System.out.println("계산기를 종료합니다.");
    }


}
