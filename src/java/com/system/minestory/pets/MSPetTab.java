package com.system.minestory.pets;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MSPetTab extends CreativeTabs {
	  public MSPetTab() {
	    super("MineStoryPets");
	  }
	  
	  public ItemStack getTabIconItem() {
	    ItemStack tabItem = new ItemStack(MSPetItem.pet_food, 1);
	    return tabItem;
	  }
}

