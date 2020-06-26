package com.zuniorteam.bowling.view;

import com.zuniorteam.bowling.core.value.FrameNumber;

public interface Input{

    String readUsername();

    int readFallenPin(FrameNumber frameNumber);
}
