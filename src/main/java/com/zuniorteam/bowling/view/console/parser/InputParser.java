package com.zuniorteam.bowling.view.console.parser;

import com.zuniorteam.bowling.core.user.User;
import com.zuniorteam.bowling.core.value.PinSize;

public class InputParser {
    public User getUser(String username) {
        return new User(username);
    }

    public PinSize getFallenPin(int fallenPin) {
        return PinSize.of(fallenPin);
    }
}
