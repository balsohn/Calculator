package com.example.calculator.level3;

public enum OperatorType {
    ADD('+') {
        @Override
        public int calculate(int a, int b) {
            return a + b;
        }
    },
    SUB('-') {
        @Override
        public int calculate(int a, int b) {
            return a - b;
        }
    },
    MUL('*') {
        @Override
        public int calculate(int a, int b) {
            return a * b;
        }
    },
    DIV('/') {
        @Override
        public int calculate(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            }
            return a / b;
        }
    };

    private char symbol;

    // 생성자
    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    // Symbol 반환 메서드
    public char getSymbol() {
        return symbol;
    }

    // 추상 메서드 선언
    public abstract int calculate(int a, int b);

    // Symbol로 Enum 상수 찾기
    public static OperatorType fromSymbol(char symbol) {
        for (OperatorType type : OperatorType.values()) {
            if (type.getSymbol() == symbol) {
                return type;
            }
        }
        throw new IllegalArgumentException("올바른 사칙연산 기호(➕,➖,✖️,➗) 를 입력해주세요.");
    }
}
