package com.xuxiaocheng.TheRealWorld.Weight;

import com.xuxiaocheng.TheRealWorld.Core.log.LogBase;
import com.xuxiaocheng.TheRealWorld.Weight.capability.IWeight;
import com.xuxiaocheng.TheRealWorld.Weight.config.ConfigMain;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class Event {
    @SubscribeEvent
    public static void onLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
        checkItem(event.player);
    }

    @SubscribeEvent
    public static void onRespawn(PlayerEvent.PlayerRespawnEvent event) {
        checkItem(event.player);
    }

    @SubscribeEvent
    public static void onPickupItem(PlayerEvent.ItemPickupEvent event) {
        checkItem(event.player);
    }

    @SubscribeEvent
    public static void onCrafted(PlayerEvent.ItemCraftedEvent event) {
        checkItem(event.player);
    }

    @SubscribeEvent
    public static void onSmelted(PlayerEvent.ItemSmeltedEvent event) {
        checkItem(event.player);
    }

    private static int tick = 0;
    @SubscribeEvent
    public static void onTicks(TickEvent.ClientTickEvent.PlayerTickEvent event) {
        if (++tick < ConfigMain.ticks)
            return;
        tick = 0;
        checkItem(event.player);
    }

    private static int times = 0;
    public static void checkItem(EntityPlayer player) {
        double weight = 0D;
        InventoryPlayer inventory = player.inventory;
        for (int i = 0; i < inventory.mainInventory.size(); i++)
            weight += WeightLoader.getItemsWeight(inventory.mainInventory.get(i));
        for (int i = 0; i < inventory.armorInventory.size(); i++)
            weight += WeightLoader.getItemsWeight(inventory.armorInventory.get(i));
        weight += WeightLoader.getItemsWeight(inventory.offHandInventory.get(0));
        WeightLoader.set(weight);
        Log.logger(LogBase.LOGGER_LEVEL.ALL, "Weigh: " + weight);

        int level = Speed.getLevel(weight);
        if (level != 0) {
            Potion potion = Potion.getPotionById(2); //slowness
            if (potion == null)
                return;
            PotionEffect effect = new PotionEffect(potion, ConfigMain.ticks + 1, level, false, false);
            player.addPotionEffect(effect);
        }

        if (++times < 5)
            return;
        times = 0;
        if (player.hasCapability(CapabilityLoader.weightCapability, null)) {
            IWeight iWeight = player.getCapability(CapabilityLoader.weightCapability, null);
            if (iWeight == null) {
                Log.logger(LogBase.LOGGER_LEVEL.ERROR, "Add weight failed.");
                return;
            }
            iWeight.setWeight(weight);
        } else
            Log.logger(LogBase.LOGGER_LEVEL.ERROR, "Find Weight Capability failed.");
    }
}
