package generator;

/**
 * generateValue로 만들어진 숫자를 저장해두는 클래스
 */
public class GeneratedValue {
    private int value;

    public GeneratedValue(int generatedValue) {
        this.value = generatedValue;
    }

    public int getValue() {
        return value;
    }
}
