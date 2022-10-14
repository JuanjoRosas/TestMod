package net.rinlax.TestMod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TEST_MOD_TAB = new CreativeModeTab("testmodtab") {
        @Override
        public ItemStack makeIcon(){
            return new ItemStack(ModItems.COBALT_INGOT.get());
        }
    };
}
