package com.system.minestory;

import com.system.minestory.pets.GuiContainerFood;
import com.system.minestory.pets.MSPetCook;
import com.system.minestory.scrolls.GuiContainerScroll;
import com.system.minestory.scrolls.MSItemEnchant;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class MSGuiHandler implements IGuiHandler {
	  public static final int PET_FOOD = 0;
	  public static final int ENCHANT_SCROLL = 1;

	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	if (ID == 0)
		return new GuiContainerFood(new MSPetCook(player.inventory, world)); 
	else if (ID == 1)
      return new GuiContainerScroll(new MSItemEnchant(player.inventory, world)); 
    return null;
	}

	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == 0)
			return new MSPetCook(player.inventory, world); 
		else if (ID == 1)
			return new MSItemEnchant(player.inventory, world); 
		return null;
	}
}

