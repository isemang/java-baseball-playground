package io;

import judge.StrikeBallValue;
import judge.Judge;
import proceedGame.NumberGenerator;

import static io.PrintConstant.*;

/**
 * 숫자 입력해달라는 말 출력
 * judge의 결과값을 x스트라이크 x볼이라고 그대로 출력
 * 게임 종료 시 게임 종료 문구 출력
 */
public class Printer {

    private Printer(){
    }

    public static void printInputNum() {
        System.out.print(INPUT_NUM);
    }

    public static void printJudgeResult() {
        StrikeBallValue judgeResult = Judge.getJudgeResult();
        System.out.println(judgeResult.getBall() + "" + BALL_STRING + judgeResult.getStrike() + STRIKE_STRING);
    }

    public static void printGameEnd() {
        System.out.println(Integer.toString(NumberGenerator.DIGIT)+GAME_END);
    }
}
