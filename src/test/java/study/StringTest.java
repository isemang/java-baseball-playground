package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

//String 클래스에 대한 학습 테스트
public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("1,2를 ,로 split했을 때, 1과 2로 잘 분리되는지 확인")
    public void split_1_and_2_by_comma() {
        String str = "1,2";
        String regex = ",";

        String[] arr = str.split(regex);
        assertThat(arr).contains("1", "2");
    }

    @Test
    @DisplayName("1을 ,로 split했을 때, 1만을 포함하는 배열이 반환되는지 확인")
    public void split_1_by_comma() {
        String str = "1";
        String regex = ",";

        String[] arr = str.split(regex);
        assertThat(arr).containsExactly("1");
    }

    @Test
    @DisplayName("abc값이 주어졌을 때, String charAt을 활용해 특정 위치의 문자를 가져온다")
    public void charAt_test() {
        String str = "abc";
        char c = str.charAt(1);

        Assertions.assertThat(c).isEqualTo('b');
    }

    @Test
    @DisplayName("abc값이 주어졌을 때, String charAt의 위치 범위가 벗어난 경우, Exception을 throw한다")
    public void charAt_test_throws_exception() {
        String str = "abc";

        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    str.charAt(4);
                });
    }
}
