package com.example.calculator.level2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    // 연산 결과를 저장하는 컬렉션 타입 필드
    private final List<Integer> results;

    // 생성자
    public Calculator() {
        this.results = new ArrayList<>();
    }

    public int calculate(int num1, int num2, char operator) {
        int result;
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
                    throw new IllegalArgumentException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                result = num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("올바른 사칙연산 기호(➕,➖,✖️,➗) 를 입력해주세요.");

        }

        // 연산 결과를 컬렉션에 저장
        results.add(result);

        // 결과값 반환
        return result;
    }

    // getter
    public List<Integer> getResults() {
        return new ArrayList<>();
    }
}
