package io;

import judge.StrikeBallValue;
import generator.NumberGenerator;

/**
 * 숫자 입력해달라는 말 출력
 * judge의 결과값을 x스트라이크 x볼이라고 그대로 출력
 * 게임 종료 시 게임 종료 문구 출력
 */
public class Printer {
    private Printer(){
    }

    public static void printInputNum() {
        System.out.print(PrintValue.INPUT_NUM.getValue());
    }

    public static void printJudgeResult(StrikeBallValue judgeResult) {
        int bNum = judgeResult.getBall();
        int sNum = judgeResult.getStrike();

        if (bNum != 0)  System.out.print(bNum+PrintValue.BALL_STRING.getValue());
        if (sNum != 0)  System.out.print(sNum+PrintValue.STRIKE_STRING.getValue());
        if (bNum == 0 && sNum == 0) System.out.print(PrintValue.NOTHING.getValue());

        System.out.println();
    }

    public static void printGameEnd() {
        System.out.println(NumberGenerator.DIGIT+PrintValue.GAME_END.getValue());
    }
}
