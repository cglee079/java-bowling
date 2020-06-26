package com.zuniorteam.bowling.view.console;

import com.zuniorteam.bowling.core.value.FrameNumber;
import com.zuniorteam.bowling.view.Input;

import java.util.Scanner;

public class ConsoleInput implements Input {

    private final Scanner SCANNER = new Scanner(System.in);

    @Override
    public String readUsername() {
        System.out.println("플레이어 이름은(3 english letters)?:");

        return SCANNER.nextLine();
    }

    @Override
    public int readFallenPin(FrameNumber frameNumber) {
        System.out.print(frameNumber + " 프레임 투구 : ");

        final int fallenPin = SCANNER.nextInt();

        SCANNER.nextLine();

        return fallenPin;

    }
}
