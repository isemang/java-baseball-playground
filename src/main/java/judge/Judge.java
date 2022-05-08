package judge;

import proceedGame.NumberGenerator;

import java.util.HashSet;
import java.util.Set;

/**
 * receiver에서 입력받은 숫자의 볼, 스트라이크 여부를 계산하는 클래스
 */
public class Judge {
    private static StrikeBallValue judgeResult;

    private Judge() {
    }

    private void judgeStrikeAndBall(int inputNum, int outputNum) {
        int strikeNum = 0;
        int ballNum = 0;

        String[] num1Arr = Integer.toString(inputNum).split("");
        String[] num2Arr = Integer.toString(outputNum).split("");

        Set<String> num2Set = new HashSet<>();

        for (int i = 0; i < num1Arr.length; i++) {
            strikeNum += strikeCnt(num1Arr[i], num2Arr[i]);

            num2Set.add(num2Arr[i]);
        }

        for (String str : num1Arr) {
            ballNum += ballCnt(str, num2Set);
        }

        judgeResult = new StrikeBallValue(strikeNum, ballNum-strikeNum);
    }

    //return 1 = strike, 0 = no strike
    private int strikeCnt(String num1, String num2) {
        if(num1.equals(num2)) return 1;

        return 0;
    }

    //return 1 = ball, 0 = no ball
    private int ballCnt(String num1, Set<String> num2Set) {
        if(num2Set.contains(num1)) return 1;

        return 0;
    }

    public static StrikeBallValue getJudgeResult() {
        return judgeResult;
    }
}
//123 & 321 -> bNum = 3, sNum = 0 결과: 0s 3-0b
//312 & 321 -> bNum = 3, sNum = 1 결과: 1s 3-1b
//321 & 321 -> bNum = 3, sNum = 3 결과: 3s 3-3b
//456 & 321 -> bNum = 0, sNum = 0 결과: 0s 0-0b
//453 & 321 -> bNum = 1, sNum = 0 결과: 0s 1-0b