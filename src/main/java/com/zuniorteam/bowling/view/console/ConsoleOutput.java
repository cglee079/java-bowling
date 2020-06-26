package com.zuniorteam.bowling.view.console;

import com.zuniorteam.bowling.core.dto.PitchResult;
import com.zuniorteam.bowling.view.Output;
import com.zuniorteam.bowling.view.console.render.ScoreRender;

import java.util.List;

public class ConsoleOutput implements Output {

    @Override
    public void writeScore(String username, List<PitchResult> pitchResults) {
        System.out.println(ScoreRender.rend(username, pitchResults));
    }

}
