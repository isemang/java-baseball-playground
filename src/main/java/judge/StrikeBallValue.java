package judge;

/**
 * 몇 스트라이크 몇 볼인지 기록하는 클래스
 */
public class StrikeBallValue {
    private int strike;
    private int ball;

    public StrikeBallValue(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }
}
