package com.system.minestory.pets;

import java.util.List;

import com.mojang.realmsclient.gui.ChatFormatting;
import com.system.minestory.ItemModel;
import com.system.minestory.MineStory;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class MSPetBase extends Item implements ItemModel{

	public String petName;
	
	public String petType;
	
	public int petLevel;
	
	public int petLevelMax;
	
	public MSPetBase(String unlocal, String type, int levelMax) {
	  setUnlocalizedName(unlocal.toLowerCase());
	  setRegistryName(unlocal.toLowerCase());
	  setCreativeTab(MineStory.MineStoryPets);
	  petType = type;
	  petLevel = 0;
	  petLevelMax = levelMax;
	  maxStackSize = 1;
	  petName = unlocal;
	  MSPetItem.Pets.add(this);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn){
		MSPetBase petStack = (MSPetBase) stack.getItem();
		if(stack.hasTagCompound()) {
			NBTTagCompound nbt = stack.getTagCompound();
			if(!(nbt == null)) {
				if(nbt.hasKey("petLevel")) {
					tooltip.add(ChatFormatting.GOLD + ("Level " + (nbt.getInteger("petLevel")+1)));
				} else {
					tooltip.add(ChatFormatting.GOLD + "Level 1");
				}
			}
		}else {
			tooltip.add(ChatFormatting.GOLD + "Level 1");
		}
			switch(petStack.petType) {
			
	// Basic Pets
		case "shroom":
			tooltip.add(ChatFormatting.ITALIC + "Haste");
			return;
	  	case "snail":
	  		tooltip.add(ChatFormatting.ITALIC + "Regeneration");
			return;
	  	case "mush":
	  		tooltip.add(ChatFormatting.ITALIC + "Health Boost");
			return;
	  	case "pig":
	  		tooltip.add(ChatFormatting.ITALIC + "Speed");
			return;
	  	case "slime":
	  		tooltip.add(ChatFormatting.ITALIC + "Absorption");
			return;
	  	case "tea":
	  		tooltip.add(ChatFormatting.ITALIC + "Saturation");
			return;
	  	case "golem":
	  		tooltip.add(ChatFormatting.ITALIC + "Fire Resistance");
			return;
	  	case "cellion":
	  		tooltip.add(ChatFormatting.ITALIC + "Glowing");
			return;
	  	case "eye":
	  		tooltip.add(ChatFormatting.ITALIC + "Jump Boost");
			return;
	  	case "boogie":
	  		tooltip.add(ChatFormatting.ITALIC + "Invisibility");
			return;
	  	case "bat":
	  		tooltip.add(ChatFormatting.ITALIC + "Levitation");
			return;
	  	case "rooster":
	  		tooltip.add(ChatFormatting.ITALIC + "Luck");
			return;
	  	case "stump":
	  		tooltip.add(ChatFormatting.ITALIC + "Night Vision");
			return;
	  	case "cap":
	  		tooltip.add(ChatFormatting.ITALIC + "Resistance");
			return;
	  	case "yeti":
	  		tooltip.add(ChatFormatting.ITALIC + "Strength");
			return;
	  	case "fish":
	  		tooltip.add(ChatFormatting.ITALIC + "Water Breathing");
			return;
	  		
	//Rare Pets
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Haste");
//			tooltip.add(ChatFormatting.ITALIC + "Night Vision");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Regeneration");
//			tooltip.add(ChatFormatting.ITALIC + "Night Vision");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Health Boost");
//			tooltip.add(ChatFormatting.ITALIC + "Night Vision");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Speed");
//			tooltip.add(ChatFormatting.ITALIC + "Night Vision");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Absorption");
//			tooltip.add(ChatFormatting.ITALIC + "Night Vision");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Saturation");
//			tooltip.add(ChatFormatting.ITALIC + "Night Vision");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Jump Boost");
//			tooltip.add(ChatFormatting.ITALIC + "Night Vision");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Resistance");
//			tooltip.add(ChatFormatting.ITALIC + "Night Vision");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Strength");
//			tooltip.add(ChatFormatting.ITALIC + "Night Vision");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Haste");
//			tooltip.add(ChatFormatting.ITALIC + "Fire Resistance");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Regeneration");
//			tooltip.add(ChatFormatting.ITALIC + "Fire Resistance");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Health Boost");
//			tooltip.add(ChatFormatting.ITALIC + "Fire Resistance");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Speed");
//			tooltip.add(ChatFormatting.ITALIC + "Fire Resistance");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Absorption");
//			tooltip.add(ChatFormatting.ITALIC + "Fire Resistance");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Saturation");
//			tooltip.add(ChatFormatting.ITALIC + "Fire Resistance");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Jump Boost");
//			tooltip.add(ChatFormatting.ITALIC + "Fire Resistance");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Resistance");
//			tooltip.add(ChatFormatting.ITALIC + "Fire Resistance");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Strength");
//			tooltip.add(ChatFormatting.ITALIC + "Fire Resistance");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Haste");
//			tooltip.add(ChatFormatting.ITALIC + "Glowing");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Regeneration");
//			tooltip.add(ChatFormatting.ITALIC + "Glowing");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Health Boost");
//			tooltip.add(ChatFormatting.ITALIC + "Glowing");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Speed");
//			tooltip.add(ChatFormatting.ITALIC + "Glowing");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Absorption");
//			tooltip.add(ChatFormatting.ITALIC + "Glowing");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Saturation");
//			tooltip.add(ChatFormatting.ITALIC + "Glowing");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Jump Boost");
//			tooltip.add(ChatFormatting.ITALIC + "Glowing");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Resistance");
//			tooltip.add(ChatFormatting.ITALIC + "Glowing");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Strength");
//			tooltip.add(ChatFormatting.ITALIC + "Glowing");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Haste");
//			tooltip.add(ChatFormatting.ITALIC + "Invisibility");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Regeneration");
//			tooltip.add(ChatFormatting.ITALIC + "Invisibility");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Health Boost");
//			tooltip.add(ChatFormatting.ITALIC + "Invisibility");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Speed");
//			tooltip.add(ChatFormatting.ITALIC + "Invisibility");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Absorption");
//			tooltip.add(ChatFormatting.ITALIC + "Invisibility");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Saturation");
//			tooltip.add(ChatFormatting.ITALIC + "Invisibility");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Jump Boost");
//			tooltip.add(ChatFormatting.ITALIC + "Invisibility");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Resistance");
//			tooltip.add(ChatFormatting.ITALIC + "Invisibility");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Strength");
//			tooltip.add(ChatFormatting.ITALIC + "Invisibility");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Haste");
//			tooltip.add(ChatFormatting.ITALIC + "Levitation");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Regeneration");
//			tooltip.add(ChatFormatting.ITALIC + "Levitation");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Health Boost");
//			tooltip.add(ChatFormatting.ITALIC + "Levitation");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Speed");
//			tooltip.add(ChatFormatting.ITALIC + "Levitation");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Absorption");
//			tooltip.add(ChatFormatting.ITALIC + "Levitation");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Saturation");
//			tooltip.add(ChatFormatting.ITALIC + "Levitation");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Jump Boost");
//			tooltip.add(ChatFormatting.ITALIC + "Levitation");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Resistance");
//			tooltip.add(ChatFormatting.ITALIC + "Levitation");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Strength");
//			tooltip.add(ChatFormatting.ITALIC + "Levitation");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Haste");
//			tooltip.add(ChatFormatting.ITALIC + "Luck");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Regeneration");
//			tooltip.add(ChatFormatting.ITALIC + "Luck");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Health Boost");
//			tooltip.add(ChatFormatting.ITALIC + "Luck");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Speed");
//			tooltip.add(ChatFormatting.ITALIC + "Luck");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Absorption");
//			tooltip.add(ChatFormatting.ITALIC + "Luck");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Saturation");
//			tooltip.add(ChatFormatting.ITALIC + "Luck");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Jump Boost");
//			tooltip.add(ChatFormatting.ITALIC + "Luck");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Resistance");
//			tooltip.add(ChatFormatting.ITALIC + "Luck");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Strength");
//			tooltip.add(ChatFormatting.ITALIC + "Luck");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Haste");
//			tooltip.add(ChatFormatting.ITALIC + "Water Breathing");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Regeneration");
//			tooltip.add(ChatFormatting.ITALIC + "Water Breathing");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Health Boost");
//			tooltip.add(ChatFormatting.ITALIC + "Water Breathing");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Speed");
//			tooltip.add(ChatFormatting.ITALIC + "Water Breathing");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Absorption");
//			tooltip.add(ChatFormatting.ITALIC + "Water Breathing");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Saturation");
//			tooltip.add(ChatFormatting.ITALIC + "Water Breathing");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Jump Boost");
//			tooltip.add(ChatFormatting.ITALIC + "Water Breathing");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Resistance");
//			tooltip.add(ChatFormatting.ITALIC + "Water Breathing");
//			return;
//	  	case "undefined":
//			tooltip.add(ChatFormatting.ITALIC + "Strength");
//			tooltip.add(ChatFormatting.ITALIC + "Water Breathing");
//			return;
	  }
	}
	public static Double getRandomNum(Integer min, Integer max) {
	 return (Math.floor(Math.random() * (max - min + 1)) + min);
	}

	@Override
	public void registerModels() {
		MineStory.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
