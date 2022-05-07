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


}
