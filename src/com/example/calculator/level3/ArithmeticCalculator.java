package com.example.calculator.level3;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator {

    // 연산 결과를 저장하는 컬렉션 타입 필드
    private List<Integer> results;

    // 생성자
    public ArithmeticCalculator() {
        this.results = new ArrayList<>();
    }

    public int calculate(int num1, int num2, char operator) {

        OperatorType operatorType = OperatorType.fromSymbol(operator);
        int result = operatorType.calculate(num1,  num2);
        // 연산 결과를 컬렉션에 저장
        results.add(result);
        // 결과값 반환
        return result;
    }

    // getter (결과들을 조회하는 메서드)
    public List<Integer> getResults() {
        return new ArrayList<>(results);
    }

    // setter (결과값을 변경하는 메서드)
    public void setResults(List<Integer> results) {
        this.results = results;
    }

    // 가장 오래된 결과 삭제
    public void removeFristResult() {
        if (results.isEmpty()) {
            System.out.println("삭제할 결과가 없습니다.");
        } else {
            results.remove(0);
            System.out.println("가장 오래된 결과가 삭제되었습니다.");
        }
    }
}
