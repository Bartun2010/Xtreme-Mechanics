package com.bartun2010.xtreme_mechanics.item;

import com.bartun2010.xtreme_mechanics.XtremeMechanics;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Moditems {

     public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(XtremeMechanics.MODID);

     public static final DeferredItem<Item> CELESTIALWRENCH = ITEMS.register("celestial_wrench",
             () -> new Item(new Item.Properties()));
     public static final DeferredItem<Item>  RAWCELESTIUM = ITEMS.register("raw_celestium",
            () -> new Item(new Item.Properties()));

     public static void register(IEventBus eventBus) {
         ITEMS.register(eventBus);
     }
}
