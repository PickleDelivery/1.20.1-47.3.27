package net.pickle.mv_compat.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.pickle.mv_compat.MangoVerseCompat;

import java.awt.event.InputEvent;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MangoVerseCompat.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MANGOVERSE_TAB = CREATIVE_MODE_TABS.register("mangoverse_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MANGOO.get()))
                    .title(Component.translatable("creativetab.mangoverse_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.MANGOO.get());
                        pOutput.accept(ModItems.TEAGOO.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
