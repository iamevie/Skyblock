package de.ekalliardos.skyblock.item;

import de.ekalliardos.skyblock.ModCreativeModeTab;
import de.ekalliardos.skyblock.SkyblockMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SkyblockMod.MOD_ID);

    public static final RegistryObject<Item> STEAL_ALLOY = ITEMS.register("steal_alloy", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SKABLOCK_TAB)));
    public static final RegistryObject<Item> STEAL_POWDER = ITEMS.register("steal_powder", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SKABLOCK_TAB)));
    public static final RegistryObject<Item> STEAL_NUGGET = ITEMS.register("steal_nugget", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SKABLOCK_TAB)));

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);

    }
}
