package com.system.minestory.pets;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IContainerListener;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class MSPetCook extends Container{

	public static InventoryPlayer player;
	private final World petWorld;
	public static InventoryPetFood foodMatrix;
	
	public MSPetCook(InventoryPlayer inventory, World world) {
		petWorld = world; player = inventory;
	    foodMatrix = new InventoryPetFood(this);
		addSlotToContainer(new Slot((IInventory)foodMatrix, 0, 40, 30));
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
		if (!this.petWorld.isRemote){
			if(foodMatrix.getStackInSlot(0) != ItemStack.EMPTY && foodMatrix.getStackInSlot(0) != new ItemStack(Items.AIR)) {
				ItemStack petStack = foodMatrix.getStackInSlot(0);
				NBTTagCompound nbt = petStack.getTagCompound();
				if(nbt == null) {
					nbt = new NBTTagCompound();
					petStack.setTagCompound(nbt);
				}
				if(nbt.hasKey("petLevel")) {
					if(petStack.getItem() instanceof MSPetBase) {
						MSPetBase petBase = (MSPetBase)petStack.getItem();
						if(nbt.getInteger("petLevel") < petBase.petLevelMax) {
							nbt.setInteger("petLevel", nbt.getInteger("petLevel") + 1);
							playerIn.sendMessage(new TextComponentString(petStack.getDisplayName() + " is now level " + nbt.getInteger("petLevel") + "!"));
						} else {
							playerIn.sendMessage(new TextComponentString(petStack.getDisplayName() + " is already max level!"));
						}
					}
				} else {
					nbt.setInteger("petLevel", 1);
				}
				petStack.setTagCompound(nbt);
				playerIn.inventory.addItemStackToInventory(petStack);
			}
			this.clearContainer(playerIn, this.petWorld, foodMatrix);
	}	}
  
	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return true;
	}
}

