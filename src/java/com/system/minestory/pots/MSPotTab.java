package com.system.minestory.pots;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MSPotTab extends CreativeTabs {
	  public MSPotTab() {
	    super("MineStoryPotions");
	  }
	  
	  public ItemStack getTabIconItem() {
	    ItemStack tabItem = new ItemStack(MSPotItem.phealth_medium_red, 1);
	    return tabItem;
	  }
}