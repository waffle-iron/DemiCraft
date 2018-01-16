package com.millermods.templatemod.entity.render;

import com.millermods.templatemod.util.Reference;
import com.millermods.templatemod.entity.EntityCentaur;
import com.millermods.templatemod.entity.model.ModelCentaur;
import com.millermods.templatemod.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCentaur extends RenderLiving<EntityCentaur>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/centaur.png");
	
	public RenderCentaur(RenderManager manager) 
	{
		super(manager, new ModelCentaur(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityCentaur entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityCentaur entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
