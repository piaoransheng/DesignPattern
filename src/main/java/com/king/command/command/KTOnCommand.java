package com.king.command.command;

import com.king.command.KTReceiver;
import com.king.command.LightReceiver;

public class KTOnCommand implements Command {
    KTReceiver ktReceiver;

    public KTOnCommand(KTReceiver ktReceiver) {
        this.ktReceiver = ktReceiver;
    }

    @Override
    public void execute() {
        ktReceiver.on();
    }

    @Override
    public void undo() {
        ktReceiver.off();
    }
}
