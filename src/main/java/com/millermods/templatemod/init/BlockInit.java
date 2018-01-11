package com.millermods.templatemod.init;

import com.millermods.templatemod.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block BLOCK_EXAMPLE = new BlockBase("block_example", Material.IRON);

}
