package proceedGame;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 게임 시작 후, 임의의 숫자를 만들어내는 클래스
 */
public class NumberGenerator {
    public static final int DIGIT = 3;
    private GeneratedValue generatedValue;

    public NumberGenerator() {
        generatedValue = makeNewNumber();
    }

    private GeneratedValue makeNewNumber() {
        Set<Integer> numSet = new HashSet<>();
        Random random = new Random();
        int randomNum = 0;

        while (numSet.size() < DIGIT) {
            numSet.add(random.nextInt(10));
        }

        return new GeneratedValue(randomNum);
    }

    public GeneratedValue getGeneratedValue() {
        return generatedValue;
    }
}
