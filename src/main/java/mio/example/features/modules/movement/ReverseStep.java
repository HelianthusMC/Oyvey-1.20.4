package mio.example.features.modules.movement;

import mio.example.features.modules.Module;

public class ReverseStep extends Module {
    public ReverseStep() {
        super("ReverseStep", "step but reversed..", Category.MOVEMENT, true, false, false);
    }

    @Override public void onUpdate() {
        if (nullCheck()) return;
        if (mc.player.isInLava() || mc.player.isTouchingWater() || !mc.player.isOnGround()) return;
        mc.player.addVelocity(0, -1, 0);
    }
}