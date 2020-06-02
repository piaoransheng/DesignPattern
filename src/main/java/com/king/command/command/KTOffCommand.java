package com.king.command.command;

import com.king.command.KTReceiver;
import com.king.command.LightReceiver;

public class KTOffCommand implements Command {
    KTReceiver ktReceiver;

    public KTOffCommand(KTReceiver ktReceiver) {
        this.ktReceiver = ktReceiver;
    }

    @Override
    public void execute() {
        ktReceiver.off();
    }

    @Override
    public void undo() {
        ktReceiver.on();
    }
}
