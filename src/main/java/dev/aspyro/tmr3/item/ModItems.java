package dev.aspyro.tmr3.item;

import dev.aspyro.tmr3.TooManyResources;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TooManyResources.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
