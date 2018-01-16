package com.millermods.templatemod.util.handlers;

import com.millermods.templatemod.util.Reference;
import com.millermods.templatemod.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler 
{
	public static SoundEvent ENTITY_CENTAUR_AMBIENT, ENTITY_CENTAUR_HURT, ENTITY_CENTAUR_DEATH;
	
	public static void registerSounds()
	{
		ENTITY_CENTAUR_AMBIENT = registerSound("entity.centaur.ambient");
		ENTITY_CENTAUR_HURT = registerSound("entity.centaur.hurt");
		ENTITY_CENTAUR_DEATH = registerSound("entity.centaur.death");
	}
	
	private static SoundEvent registerSound(String name)
	{
		ResourceLocation location = new ResourceLocation(Reference.MODID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
}
