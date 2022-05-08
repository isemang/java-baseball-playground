package io;

import judge.StrikeBallValue;
import judge.Judge;
import proceedGame.NumberGenerator;

/**
 * 숫자 입력해달라는 말 출력
 * judge의 결과값을 x스트라이크 x볼이라고 그대로 출력
 * 게임 종료 시 게임 종료 문구 출력
 */
public class Printer {
    private static final String INPUT_NUM = "숫자를 입력해 주세요: ";
    private static final String STRIKE_STRING = "스트라이크 ";
    private static final String BALL_STRING = "볼 ";
    private static final String GAME_END = "개의 숫자를 모두 맞히셨습니다! 게임 종료\n 게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    private Printer(){
    }

    public static void printInputNum() {
        System.out.print(INPUT_NUM);
    }

    public static void printJudgeResult() {
        StrikeBallValue judgeResult = Judge.getJudgeResult();
        System.out.println(judgeResult.getBall()+BALL_STRING+judgeResult.getStrike()+STRIKE_STRING);
    }

    public static void printGameEnd() {
        System.out.println(Integer.toString(NumberGenerator.DIGIT)+GAME_END);
    }
}
