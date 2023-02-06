package de.ekalliardos.skyblock;

import de.ekalliardos.skyblock.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab SKABLOCK_TAB = new CreativeModeTab("skyblock_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.STEAL_ALLOY.get());
        }
    };
}
