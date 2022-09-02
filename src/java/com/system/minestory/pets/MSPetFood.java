package com.system.minestory.pets;

import java.util.List;

import com.mojang.realmsclient.gui.ChatFormatting;
import com.system.minestory.ItemModel;
import com.system.minestory.MineStory;
import com.system.minestory.Reference;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class MSPetFood extends Item implements ItemModel {
	
	public MSPetFood(String unlocal) {
		setUnlocalizedName(unlocal.toLowerCase());
		setRegistryName(unlocal.toLowerCase());
		setCreativeTab(MineStory.MineStoryPets);
		maxStackSize = 32;
		MSPetItem.Pets.add(this);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn){
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		playerIn.setActiveHand(handIn);
		itemstack.shrink(1);
		playerIn.openGui(Reference.MODID, 0, worldIn, playerIn.getPosition().getX(), playerIn.getPosition().getY(), playerIn.getPosition().getZ());
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn){
    	tooltip.add(ChatFormatting.LIGHT_PURPLE + "Right-click to open");
    	tooltip.add(ChatFormatting.LIGHT_PURPLE + "the Pet Food Box");
	}
	
	@Override
		public void registerModels() {
			MineStory.proxy.registerItemRenderer(this, 0, "inventory");
		}
	}
