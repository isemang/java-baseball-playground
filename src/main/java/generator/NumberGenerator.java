package generator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 * 게임 시작 후, 임의의 숫자를 만들어내는 클래스
 */
public class NumberGenerator {
    public static final int DIGIT = 3;
    private GeneratedValue generatedValue;

    public NumberGenerator() {
        makeNewNumber();
    }

    private void makeNewNumber() {
        Set<Integer> numSet = new HashSet<>();
        Random random = new Random();
        int randomNum = 0;

        while (numSet.size() < DIGIT) {
            numSet.add(random.nextInt(9) + 1);
        }

        Iterator<Integer> setIter = numSet.iterator();
        int idx = 1;
        while(setIter.hasNext()) {
            randomNum += setIter.next()*idx;
            idx *= 10;
        }

        generatedValue = new GeneratedValue(randomNum);
    }

    public GeneratedValue getGeneratedValue() {
        return generatedValue;
    }
}
