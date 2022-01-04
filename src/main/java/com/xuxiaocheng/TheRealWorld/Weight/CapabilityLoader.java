package com.xuxiaocheng.TheRealWorld.Weight;

import com.xuxiaocheng.TheRealWorld.Weight.capability.CapabilityWeight;
import com.xuxiaocheng.TheRealWorld.Weight.capability.IWeight;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class CapabilityLoader {
    @CapabilityInject(IWeight.class)
    public static Capability<IWeight> weightCapability;

    public static void register() {
        CapabilityManager.INSTANCE.register(IWeight.class, new CapabilityWeight.Storage(), new CapabilityWeight.Factory());
    }

    @SubscribeEvent
    public static void onCapabilityAttach(AttachCapabilitiesEvent<Entity> event) {
        if (event.getObject() instanceof EntityPlayer) {
            ICapabilitySerializable<NBTTagCompound> provider = new CapabilityWeight.PlayerProvider();
            event.addCapability(new ResourceLocation(Reference.MOD_ID + ":weight"), provider);
        }
    }

    @SubscribeEvent
    public static void onPlayerClone(PlayerEvent.Clone event) {
        Capability<IWeight> capability = CapabilityLoader.weightCapability;
        Capability.IStorage<IWeight> storage = capability.getStorage();
        if (event.getOriginal().hasCapability(capability, null) && event.getEntityPlayer().hasCapability(capability, null)) {
            NBTBase nbt = storage.writeNBT(capability, event.getOriginal().getCapability(capability, null), null);
            storage.readNBT(capability, event.getEntityPlayer().getCapability(capability, null), null, nbt);
        }
    }
}
