package com.xuxiaocheng.TheRealWorld.Ore.worldgen;

import com.xuxiaocheng.TheRealWorld.Ore.Reference;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class WorldDenyIronOre {
    @SubscribeEvent
    public void denyGenIronOre(OreGenEvent.GenerateMinable event) {
        if (event.getType() == OreGenEvent.GenerateMinable.EventType.IRON) {
            event.setResult(Event.Result.DENY);
        }
    }
}
