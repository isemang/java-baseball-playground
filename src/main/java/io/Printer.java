package io;

import judge.StrikeBallValue;
import generator.NumberGenerator;

/**
 * 숫자 입력해달라는 말 출력
 * judge의 결과값을 x스트라이크 x볼이라고 그대로 출력
 * 게임 종료 시 게임 종료 문구 출력
 */
public class Printer {
    private static final PrintValue printValue = new PrintValue();
    private Printer(){
    }

    public static void printInputNum() {
        System.out.print(printValue.INPUT_NUM);
    }

    public static void printJudgeResult(StrikeBallValue judgeResult) {
        int bNum = judgeResult.getBall();
        int sNum = judgeResult.getStrike();

        if (bNum != 0)  System.out.print(bNum+printValue.BALL_STRING);
        if (sNum != 0)  System.out.print(sNum+printValue.STRIKE_STRING);
        if (bNum == 0 && sNum == 0) System.out.print(printValue.NOTHING);

        System.out.println();
    }

    public static void printGameEnd() {
        System.out.println(Integer.toString(NumberGenerator.DIGIT)+printValue.GAME_END);
    }
}
