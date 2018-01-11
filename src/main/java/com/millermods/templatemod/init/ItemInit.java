package com.millermods.templatemod.init;

import com.millermods.templatemod.objects.armor.ArmorBase;
import com.millermods.templatemod.objects.items.ItemBase;
import com.millermods.templatemod.objects.tools.*;
import com.millermods.templatemod.util.reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.List;

public class ItemInit {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    // Materials
    public static final ToolMaterial TOOL_EXAMPLE = EnumHelper.addToolMaterial("tool_example", 1, 131, 4.0F, 1.0F, 5);
    public static final ArmorMaterial ARMOR_EXAMPLE = EnumHelper.addArmorMaterial("armor_example", reference.MODID + ":example", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);

    // Items
    public static final Item INGOT_EXAMPLE = new ItemBase("ingot_example");
    public static final Item NUGGET_EXAMPLE = new ItemBase("nugget_example");

    // Tools
    public static final Item AXE_EXAMPLE = new ToolAxe("axe_example", TOOL_EXAMPLE);
    public static final Item HOE_EXAMPLE = new ToolHoe("hoe_example", TOOL_EXAMPLE);
    public static final Item PICKAXE_EXAMPLE = new ToolPickaxe("pickaxe_example", TOOL_EXAMPLE);
    public static final Item SHOVEL_EXAMPLE = new ToolShovel("shovel_example", TOOL_EXAMPLE);
    public static final Item SWORD_EXAMPLE = new ToolSword("sword_example", TOOL_EXAMPLE);

    // Armor
    public static final Item HELMET_EXAMPLE = new ArmorBase("helmet_example", ARMOR_EXAMPLE, 1, EntityEquipmentSlot.HEAD);
    public static final Item CHESTPLATE_EXAMPLE = new ArmorBase("chestplate_example", ARMOR_EXAMPLE,1, EntityEquipmentSlot.CHEST);
    public static final Item LEGGINGS_EXAMPLE = new ArmorBase("leggings_example", ARMOR_EXAMPLE, 2, EntityEquipmentSlot.LEGS);
    public static final Item BOOTS_EXAMPLE = new ArmorBase("boots_example", ARMOR_EXAMPLE ,1, EntityEquipmentSlot.FEET);

}
