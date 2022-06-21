package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Queue;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;
import java.util.function.Function;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 단위 테스트 실습 - 문자열 계산기
 */
public class StringCalculatorTest {

    String s;
    String[] split;

    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String MULTIPLY = "*";
    private static final String DIVIDE = "/";

    //@BeforeEach
    void setUp() {
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
//        str = "2 + 3 * 4 / 2";
    }

    @ParameterizedTest
    @DisplayName("string을 split 메소드를 이용해 String array로 변환")
    @ValueSource(strings = {"2 + 3 * 4 / 2"})
    void split_test(String str) {
        String regex = " ";
        split = str.split(regex);
        assertThat(split).containsExactly("2", "+", "3", "*", "4", "/", "2");
    }

    @Test
    void calculate_test_success() {
        for (int i = 0; i < split.length; i++) {
            calculateProcess(i);
        }
    }

    void calculateProcess(int idx) {
        if(idx % 2 == 1) {
            confirmArithmetic(Integer.parseInt(split[idx - 1]), Integer.parseInt(split[idx + 1]), split[idx]);
        }
    }

    void confirmArithmetic(int a, int b, String operator) {
        int result;

        if (operator.equals(PLUS)) {
            result = plus(a, b);
        } else if (operator.equals(MINUS)) {
            result = minus(a, b);
        } else if (operator.equals(MULTIPLY)) {
            result = multiply(a, b);
        } else if (operator.equals(DIVIDE)) {
            result = divide(a, b);
        }


    }

    int plus(int a, int b) {
        return a + b;
    }

    int minus(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }
}
/*
단위 테스트 실습 - 문자열 계산기
다음 요구사항을 JUnit을 활용해 단위 테스트 코드를 추가해 구현한다.
요구사항
사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현해야 한다.
문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다. 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
예를 들어 "2 + 3 * 4 / 2"와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.

힌트
문자열을 입력 받은 후(scanner의 nextLine() 메소드 활용) 빈 공백 문자열을 기준으로 문자들을 분리해야 한다.
String value = scanner.nextLine();
String[] values = value.split(" ");
문자열을 숫자로 변경하는 방법
int number = Integer.parseInt("문자열");
 */