package io;

public enum PrintValue {
    INPUT_NUM("숫자를 입력해 주세요: "),
    STRIKE_STRING("스트라이크 "),
    BALL_STRING("볼 "),
    NOTHING("낫싱"),
    GAME_END("개의 숫자를 모두 맞히셨습니다! 게임 종료\\n 게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

    private final String printValue;

    PrintValue(String printValue) {
        this.printValue = printValue;
    }

    public String getValue() {
        return printValue;
    }
}
