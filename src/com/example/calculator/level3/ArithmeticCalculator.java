package com.example.calculator.level3;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator<T extends Number> {

    // 연산 결과를 저장하는 컬렉션 타입 필드
    private List<Number> results;

    // 생성자
    public ArithmeticCalculator() {
        this.results = new ArrayList<>();
    }

    public Number calculate(T num1, T num2, char operator) {

        OperatorType operatorType = OperatorType.fromSymbol(operator);
        double doubleNum1 = num1.doubleValue();
        double doubleNum2 = num2.doubleValue();

        double result = operatorType.calculate(doubleNum1, doubleNum2);

        // 소수점 이하가 0인지 확인
        if (result == (int)result) {
            this.results.add((int)result);
            return (int)result;
        } else {
            this.results.add(result);
            return result;
        }

//        // 연산 결과를 컬렉션에 저장
//        results.add(result);
//        // 결과값 반환
//        return result;
    }

    // getter (결과들을 조회하는 메서드)
    public List<Number> getResults() {
        return new ArrayList<>(results);
    }

    // setter (결과값을 변경하는 메서드)
    public void setResults(List<Number> results) {
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
