package com.system.minestory.scrolls;

import java.util.ArrayList;
import java.util.List;

import com.mojang.realmsclient.gui.ChatFormatting;
import com.system.minestory.ItemModel;
import com.system.minestory.MineStory;
import com.system.minestory.Reference;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class MSScrollBase extends Item implements ItemModel{

	public String scrollName;
	
	public Integer scrollChance;
	
	public List<Enchantment> scrollEnchant = new ArrayList<Enchantment>();
	
	public MSScrollBase(String unlocal, List<Enchantment> enchantment, Integer chance) {
		setUnlocalizedName(unlocal.toLowerCase());
		setRegistryName(unlocal.toLowerCase());
		setCreativeTab(MineStory.MineStoryScrolls);
		scrollChance = chance;
		scrollEnchant = enchantment;
		scrollName = unlocal;
		maxStackSize = 16;
		MSScrollItem.Scrolls.add(this);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn){
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		playerIn.setActiveHand(handIn);
		playerIn.openGui(Reference.MODID, 1, worldIn, playerIn.getPosition().getX(), playerIn.getPosition().getY(), playerIn.getPosition().getZ());
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn){
		tooltip.add(ChatFormatting.DARK_GREEN + "Right-click to enchant.");
		tooltip.add(ChatFormatting.GREEN + (scrollChance + "% chance of success!"));
	}
	
	@Override
	public void registerModels() {
		MineStory.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
