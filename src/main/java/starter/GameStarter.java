package starter;

import generator.NumberGenerator;
import io.Printer;
import io.Receiver;
import judge.Judge;
import judge.StrikeBallValue;

public class GameStarter {
    public int gameStart() {
        NumberGenerator generator = new NumberGenerator();
        Receiver receiver;
        int randomValue = generator.getGeneratedValue().getValue();
        int inputValue = 0;

        while (randomValue != inputValue) {
            Printer.printInputNum();

            receiver = new Receiver();
            inputValue = receiver.getReceivedValue().getValue();

            Judge.judgeStrikeAndBall(inputValue, randomValue);

            StrikeBallValue judgeResult = Judge.getJudgeResult();

            Printer.printJudgeResult(judgeResult);
        }

        Printer.printGameEnd();

        receiver = new Receiver();

        return receiver.getReceivedValue().getValue();
    }
}
