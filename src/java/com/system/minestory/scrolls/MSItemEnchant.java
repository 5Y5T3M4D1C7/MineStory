package com.system.minestory.scrolls;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IContainerListener;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class MSItemEnchant extends Container{

	public static InventoryPlayer player;
	private final World scrollWorld;
	public static InventoryEnchantScroll scrollMatrix;
	public static ItemStack scrollItem;
	
	public MSItemEnchant(InventoryPlayer inventory, World world) {
		scrollWorld = world; player = inventory; scrollItem = inventory.getCurrentItem();
		scrollMatrix = new InventoryEnchantScroll(this);
		addSlotToContainer(new Slot((IInventory)scrollMatrix, 0, 40, 30));
	for (int k = 0; k < 3; k++) 
		for (int i1 = 0; i1 < 9; i1++) 
			addSlotToContainer(new Slot((IInventory)inventory, i1 + k * 9 + 9, 8 + i1 * 18, 84 + k * 18)); 
	for (int l = 0; l < 9; l++)
		addSlotToContainer(new Slot((IInventory)inventory, l, 8 + l * 18, 142));
	}
	
	public boolean levelUp() {
		player.player.closeScreen();
		return true;
	}
	
	public static Double getRandomNum(Integer min, Integer max) {
		return (Math.floor(Math.random() * (max - min + 1)) + min);
	}

		@Override
	public void addListener(IContainerListener listener)
	{
	super.addListener(listener);
	listener.sendAllContents(this, this.getInventory());
	this.detectAndSendChanges();
	}

	@Override
	public void onContainerClosed(EntityPlayer playerIn){
		super.onContainerClosed(playerIn);
		if (!this.scrollWorld.isRemote){
			if(scrollMatrix.getStackInSlot(0) != ItemStack.EMPTY && scrollMatrix.getStackInSlot(0) != new ItemStack(Items.AIR)) {
				ItemStack itemStack = scrollMatrix.getStackInSlot(0);
				if(itemStack.isItemEnchantable()) {
					MSScrollBase itemScroll = (MSScrollBase)scrollItem.getItem();
					if(getRandomNum(0, 99) > 99 - itemScroll.scrollChance) {
						playerIn.sendMessage(new TextComponentString("Enchantment Success!"));
						int c = itemScroll.scrollEnchant.size();
						for (int i = 0; i < c; i++) {
							itemStack.addEnchantment(itemScroll.scrollEnchant.get(i), 1);
						}
					} else {
						playerIn.sendMessage(new TextComponentString("Enchantment Failed!"));
					}
					playerIn.inventory.addItemStackToInventory(itemStack);
					scrollItem.shrink(1);
				}
			}
			this.clearContainer(playerIn, this.scrollWorld, scrollMatrix);
	}	}
  
	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return true;
	}
}

