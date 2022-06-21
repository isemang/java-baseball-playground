package main;

import io.Printer;
import io.Receiver;
import judge.Judge;
import judge.StrikeBallValue;
import generator.NumberGenerator;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        int randomValue = generator.getGeneratedValue().getValue();
        int inputValue = 0;

        while (randomValue != inputValue) {
            Receiver receiver = new Receiver();
            inputValue = receiver.getReceivedValue().getValue();

            Judge.judgeStrikeAndBall(inputValue, randomValue);

            StrikeBallValue judgeResult = Judge.getJudgeResult();

            Printer.printJudgeResult(judgeResult);
        }

        Printer.printGameEnd();
    }
}
