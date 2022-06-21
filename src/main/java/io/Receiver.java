package io;

import java.util.Scanner;

/**
 * 입력받을 스캐너를 생성한다.
 * 숫자를 입력해 주세요: 프린트한다
 * 스캐너로 입력받은 숫자를 revievedValue에 저장한다
 * revievedValue를 judge에 던진다
 */
public class Receiver {
    Scanner sc;
    private final ReceivedValue receivedValue;

    public Receiver() {
        sc = new Scanner(System.in);

        receivedValue = new ReceivedValue(Integer.parseInt(sc.nextLine()));
    }

    public ReceivedValue getReceivedValue() {
        return receivedValue;
    }
}
