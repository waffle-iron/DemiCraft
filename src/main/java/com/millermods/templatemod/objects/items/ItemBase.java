package com.millermods.templatemod.objects.items;

import com.millermods.templatemod.Main;
import com.millermods.templatemod.init.ItemInit;
import com.millermods.templatemod.Main;
import com.millermods.templatemod.init.ItemInit;
import com.millermods.templatemod.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.TUTORIAL);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
