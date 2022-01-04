package com.xuxiaocheng.TheRealWorld.Weight.capability;

import com.xuxiaocheng.TheRealWorld.Core.log.LogBase;
import com.xuxiaocheng.TheRealWorld.Weight.CapabilityLoader;
import com.xuxiaocheng.TheRealWorld.Weight.Log;
import com.xuxiaocheng.TheRealWorld.Weight.Reference;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.concurrent.Callable;

public class CapabilityWeight {
    public static class Storage implements Capability.IStorage<IWeight> {
        @Nullable
        @Override
        public NBTBase writeNBT(Capability<IWeight> capability, IWeight instance, EnumFacing side) {
            NBTTagCompound compound = new NBTTagCompound();
            compound.setDouble(Reference.MOD_ID + ":weight", instance.getWeight());
            return compound;
        }

        @Override
        public void readNBT(Capability<IWeight> capability, IWeight instance, EnumFacing side, NBTBase nbt) {
            NBTTagCompound compound = (NBTTagCompound) nbt;
            double Weight = 0D;
            if (compound.hasKey(Reference.MOD_ID + ":weight"))
                Weight = compound.getDouble(Reference.MOD_ID + ":weight");
            instance.setWeight(Weight);
        }
    }

    public static class Factory implements Callable<IWeight> {
        @Override
        public IWeight call() {
            return new Implementation();
        }
    }

    private static class Implementation implements IWeight {
        private static Double WEIGHT = 0.0;

        public Double getWeight() {
            return WEIGHT;
        }

        public void setWeight(Double weight) {
            WEIGHT = weight;
        }

        public void addWeight(Double weight) {
            WEIGHT += weight;
        }
    }

    public static class PlayerProvider implements ICapabilitySerializable<NBTTagCompound> {
        private final IWeight weight = new Implementation();
        private final Capability.IStorage<IWeight> storage = CapabilityLoader.weightCapability.getStorage();

        @Override
        public boolean hasCapability(@Nonnull Capability<?> capability, EnumFacing side) {
            return CapabilityLoader.weightCapability.equals(capability);
        }

        @Override
        public <T> T getCapability(@Nonnull Capability<T> capability, EnumFacing facing)
        {
            if (CapabilityLoader.weightCapability.equals(capability))
            {
                @SuppressWarnings("unchecked")
                T result = (T) weight;
                return result;
            }
            return null;
        }

        @Override
        public NBTTagCompound serializeNBT()
        {
            NBTTagCompound compound = new NBTTagCompound();
            NBTBase nbtBase = storage.writeNBT(CapabilityLoader.weightCapability, weight, null);
            if (nbtBase == null) {
                Log.logger(LogBase.LOGGER_LEVEL.ERROR, "NBT Weight write failed.");
                return compound;
            }
            compound.setTag(Reference.MOD_ID + ":weight", nbtBase);
            return compound;
        }

        @Override
        public void deserializeNBT(NBTTagCompound compound)
        {
            NBTBase base = compound.getTag(Reference.MOD_ID + ":weight");
            storage.readNBT(CapabilityLoader.weightCapability, weight, null, base);
        }
    }
}
