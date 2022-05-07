package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("set의 size메소드를 활용, set의 크기를 확인한다")
    public void confirm_set_size() {
        int size = numbers.size();
        int num = 3;

        assertThat(size).isEqualTo(num);
    }

    @ParameterizedTest
    @DisplayName("contains 메소드 활용, set에 특정값이 존재하는지 확인한다")
    @ValueSource(ints = {1, 2, 3})
    void contains_test(int input) {
        assertThat(numbers.contains(input)).isTrue();
    }

    @ParameterizedTest
    @DisplayName("1,2,3은 contains - true, 4,5는 conatins - false")
    @CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false"}, delimiter = ':')
    void contains_true_false_test(String input, String expected) {
        int num = Integer.parseInt(input);
        boolean contains = numbers.contains(num);

        assertThat(String.valueOf(contains)).isEqualTo(expected);
    }
}
