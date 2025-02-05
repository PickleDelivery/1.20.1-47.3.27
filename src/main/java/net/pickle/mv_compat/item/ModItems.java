package net.pickle.mv_compat.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pickle.mv_compat.MangoVerseCompat;

import java.awt.event.ItemEvent;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MangoVerseCompat.MOD_ID);

    //test item mango
    public static final RegistryObject<Item> MANGOO = ITEMS.register("mangoo",
            () -> new Item(new Item.Properties()));
    //the creative mode tab
    public static final RegistryObject<Item> TEAGOO = ITEMS.register( "teagoo",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
