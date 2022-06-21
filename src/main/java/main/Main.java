package main;

import starter.GameStarter;

public class Main {
    public static void main(String[] args) {
        int gameStartNum = 1;

        while (gameStartNum == 1) {
            GameStarter gameStarter = new GameStarter();
            gameStartNum = gameStarter.gameStart();
        }
    }
}
