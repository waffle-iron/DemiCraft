package com.millermods.templatemod.world.types;

import com.millermods.templatemod.init.BiomeInit;
import com.millermods.templatemod.init.BiomeInit;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;

public class WorldTypeCopper extends WorldType
{
	public WorldTypeCopper() 
	{
		super("Copper");
	}
	
	@Override
	public BiomeProvider getBiomeProvider(World world) 
	{
		return new BiomeProviderSingle(BiomeInit.COPPER);
	}
}
