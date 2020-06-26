package com.zuniorteam.bowling;

import com.zuniorteam.bowling.core.dto.PitchResult;
import com.zuniorteam.bowling.core.frame.Frame;
import com.zuniorteam.bowling.core.frame.impl.NormalFrame;
import com.zuniorteam.bowling.core.pitch.Pitch;
import com.zuniorteam.bowling.core.user.User;
import com.zuniorteam.bowling.core.value.FrameNumber;
import com.zuniorteam.bowling.core.value.PinSize;
import com.zuniorteam.bowling.core.value.PitchType;
import com.zuniorteam.bowling.view.Input;
import com.zuniorteam.bowling.view.Output;
import com.zuniorteam.bowling.view.console.ConsoleInput;
import com.zuniorteam.bowling.view.console.ConsoleOutput;
import com.zuniorteam.bowling.view.console.parser.InputParser;

import java.util.ArrayList;
import java.util.List;

import static com.zuniorteam.bowling.core.pitch.Pitch.END;

public class GameBoard {

    private final InputParser inputParser = new InputParser();

    private final Input input = new ConsoleInput();
    private final Output output = new ConsoleOutput();

    public void startGame() {
        final User user = inputParser.getUser(input.readUsername());
        final String username = user.getUsername();

        final Frame firstFrame = new NormalFrame(FrameNumber.FIRST);
        final Pitch firstPitch = new Pitch(firstFrame, PitchType.FIRST);

        playPitch(firstPitch, username, new ArrayList<>());
    }

    private void playPitch(Pitch pitch, String username, List<PitchResult> pitchResults) {
        if(END.equals(pitch)){
            return;
        }

        final PinSize fallenPinSize = inputParser.getFallenPin(input.readFallenPin(pitch.getFrameNumber()));
        final PitchResult playResult = pitch.play(fallenPinSize);
        pitchResults.add(playResult);

        output.writeScore(username, pitchResults);

        playPitch(pitch.next(), username, pitchResults);
    }

}
