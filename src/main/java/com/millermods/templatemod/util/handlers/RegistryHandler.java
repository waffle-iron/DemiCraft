package com.millermods.templatemod.util.handlers;

import com.millermods.templatemod.init.BlockInit;
import com.millermods.templatemod.init.ItemInit;
import com.millermods.templatemod.util.interfaces.IHasModel;
import com.millermods.templatemod.world.gen.WorldGenCustomOres;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {

        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));

    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {

        event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));

    }


    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {

        for(Item item : ItemInit.ITEMS) {
            if(item instanceof IHasModel) {
                ((IHasModel)item).registerModels();
            }
        }

        for(Block block : BlockInit.BLOCKS) {
            if(block instanceof IHasModel) {
                ((IHasModel)block).registerModels();
            }
        }

    }

    public static void otherRegistries() {
        GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
    }
}
