package com.system.minestory.scrolls;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MSScrollTab extends CreativeTabs {
	  public MSScrollTab() {
	    super("MineStoryScrolls");
	  }
	  
	  public ItemStack getTabIconItem() {
	    ItemStack tabItem = new ItemStack(MSScrollItem.scroll_sharpness_100, 1);
	    return tabItem;
	  }
}