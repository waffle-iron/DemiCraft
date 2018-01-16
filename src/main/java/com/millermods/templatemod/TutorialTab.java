package com.millermods.templatemod;

import com.millermods.templatemod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TutorialTab extends CreativeTabs
{
	public TutorialTab(String label) { super("tutorialtab"); }
	public ItemStack getTabIconItem() { return new ItemStack(ItemInit.INGOT_COPPER);}
}
