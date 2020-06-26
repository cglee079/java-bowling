package com.zuniorteam.bowling.view;

import com.zuniorteam.bowling.core.dto.PitchResult;

import java.util.List;

public interface Output {

    void writeScore(String username, List<PitchResult> pitchResults);

}
