package com.system.minestory.pots;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.mojang.realmsclient.gui.ChatFormatting;
import com.system.minestory.ItemModel;
import com.system.minestory.MineStory;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class MSPotBase extends ItemFood implements ItemModel {
	
	//Types = Health, Absorption, Experience, Level, Milk, Exhaustion
	public String potType;
	
	public Integer potValue;
	
	public MSPotBase(String unlocal, String type, Integer value) {
		super(0,0,false);
	  setUnlocalizedName(unlocal.toLowerCase());
	  setRegistryName(unlocal.toLowerCase());
	  setCreativeTab(MineStory.MineStoryPotions);
	  setAlwaysEdible();
	  potType = type;
	  potValue = value;
	  maxStackSize = 32;
	  MSPotItem.Potions.add(this);
	}

	@Override
    public int getMaxItemUseDuration(ItemStack stack){
			return 16;
    }
	
	@Override
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.DRINK;
    }
	
	@Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
    }
    
	@Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
		EntityPlayer player = (EntityPlayer)entityLiving;
		if(stack.getItem() instanceof MSPotBase) {
			MSPotBase petHand = (MSPotBase) stack.getItem();
			switch(petHand.potType) {
				case "Health":
					if(player.getHealth() + potValue < player.getMaxHealth()) {
						player.setHealth(player.getHealth() + potValue);
					} else {
						player.setHealth(player.getMaxHealth());
					}
					stack.shrink(1);
					return stack;
				case "Absorption":
					player.setAbsorptionAmount(player.getAbsorptionAmount() + potValue);
					stack.shrink(1);
					return stack;
				case "Experience":
					player.addExperience(potValue);
					stack.shrink(1);
					return stack;
				case "Level":
					player.addExperienceLevel(potValue);
					stack.shrink(1);
					return stack;
				case "Milk":
					if(potValue == 0) {
						player.clearActivePotions();
					}
					else if(potValue == 1) {
						Collection<PotionEffect> effects = player.getActivePotionEffects();
						Collection<PotionEffect> selectedEffects = new ArrayList<PotionEffect>();
						Object[] effectArray = effects.toArray();
						for(int i = 0; i < effects.size(); i++) {
							PotionEffect potion = ((PotionEffect)effectArray[i]);
							if(potion.getPotion().isBadEffect() == true) {
								selectedEffects.add(potion);
							}
						}
						effects.removeAll(selectedEffects);
					}
					else if(potValue == 2) {
						Collection<PotionEffect> effects = player.getActivePotionEffects();
						Collection<PotionEffect> selectedEffects = new ArrayList<PotionEffect>();
						Object[] effectArray = effects.toArray();
						for(int i = 0; i < effects.size(); i++) {
							PotionEffect potion = ((PotionEffect)effectArray[i]);
							if(potion.getPotion().isBadEffect() == false) {
								selectedEffects.add(potion);
							}
						}
						effects.removeAll(selectedEffects);
					}
					stack.shrink(1);
					return stack;
				case "Saturation":
					player.addExhaustion(potValue);
					stack.shrink(1);
					return stack;
			}
		}
		stack.shrink(1);
		return stack;
    }
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
	{
	     super.addInformation(stack, worldIn, tooltip, flagIn);
	     MSPotBase potStack = (MSPotBase) stack.getItem();
			switch(potStack.potType) {
		case "Health":
	    	tooltip.add(ChatFormatting.YELLOW + "Restores " + potStack.potValue + " health");
		   return;
		case "Absorption":
	    	tooltip.add(ChatFormatting.YELLOW + "Adds " + potStack.potValue + " absorption hearts");
			return;
		case "Experience":
	    	tooltip.add(ChatFormatting.YELLOW + "Grants " + potStack.potValue + " experience");
			return;
		case "Level":
	    	tooltip.add(ChatFormatting.YELLOW + "Grants " + potStack.potValue + " level(s)");
			return;
		case "Milk":
			String milkType = "no";
			if(potStack.potValue == 0) {
				milkType = "all";
			}
			else if(potStack.potValue == 1) {
				milkType = "all negative";
			}
			else if(potStack.potValue == 2) {
				milkType = "all positive";
			}
	    	tooltip.add(ChatFormatting.YELLOW + ("Clears " + milkType + " potion effects"));
			return;
		case "Saturation":
	    	tooltip.add(ChatFormatting.YELLOW + "Restores " + potStack.potValue + " saturation");
			return;
		 }
	}

	@Override
	public void registerModels() {
		MineStory.proxy.registerItemRenderer(this, 0, "inventory");
	}
	  
}


