package mio.example.features.modules.player;

import com.google.common.eventbus.Subscribe;
import mio.example.event.impl.PacketEvent;
import mio.example.features.modules.Module;
import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.ExplosionS2CPacket;

public class Velocity extends Module {
    public Velocity() {
        super("Velocity", "", Category.PLAYER, true, false, false);
    }

    @Subscribe private void onPacketReceive(PacketEvent.Receive event) {
        if (event.getPacket() instanceof EntityVelocityUpdateS2CPacket || event.getPacket() instanceof ExplosionS2CPacket) event.cancel();
    }
}
