package com.system.minestory.pets;

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
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class MSPetBook extends ItemFood implements ItemModel {
	
	public String petName;
	
	public MSPetBook(String unlocal) {
		super(0,0,false);
	  setUnlocalizedName(unlocal.toLowerCase());
	  setRegistryName(unlocal.toLowerCase());
	  setCreativeTab(MineStory.MineStoryPets);
	  setAlwaysEdible();
	  maxStackSize = 16;
	  petName = unlocal;
	  MSPetItem.Pets.add(this);
	}
	
	public static Double getRandomNum(Integer min, Integer max) {
	    return (Math.floor(Math.random() * (max - min + 1)) + min);
	}

	@Override
    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 4;
    }
	
	@Override
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.BLOCK;
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
		if(stack.getItem() instanceof MSPetBook) {
			MSPetBook petHand = (MSPetBook) stack.getItem();
			switch(petHand.petName) {
				case "book_blue":
					player.inventory.addItemStackToInventory(MSPetBook.randomPet("basic"));
					stack.shrink(1);
					return stack;
				case "book_dark":
					player.inventory.addItemStackToInventory(MSPetBook.randomPet("unique"));
					stack.shrink(1);
					return stack;
				case "book_purple":
					player.inventory.addItemStackToInventory(MSPetBook.randomPet("book"));
					stack.shrink(1);
					return stack;
				case "book_silver":
					player.inventory.addItemStackToInventory(MSPetBook.randomPet("rare"));
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
	     MSPetBook petStack = (MSPetBook) stack.getItem();
			switch(petStack.petName) {
		case "book_blue":
	    	tooltip.add(ChatFormatting.LIGHT_PURPLE + "Right-click to obtain");
	    	tooltip.add(ChatFormatting.LIGHT_PURPLE + "one randomly selected");
	    	tooltip.add(ChatFormatting.LIGHT_PURPLE + "MineStory basic Pet!");
	    	tooltip.add(ChatFormatting.LIGHT_PURPLE + "[ Currently Broken ]");
		   return;
		case "book_dark":
	    	tooltip.add(ChatFormatting.LIGHT_PURPLE + "Right-click to obtain");
	    	tooltip.add(ChatFormatting.LIGHT_PURPLE + "one randomly selected");
	    	tooltip.add(ChatFormatting.LIGHT_PURPLE + "Minestory unique Pet!");
			return;
		case "book_silver":
	    	tooltip.add(ChatFormatting.LIGHT_PURPLE + "Right-click to obtain");
	    	tooltip.add(ChatFormatting.LIGHT_PURPLE + "one randomly selected");
	    	tooltip.add(ChatFormatting.LIGHT_PURPLE + "MineStory rare Pet!");
			return;
		case "book_purple":
	    	tooltip.add(ChatFormatting.LIGHT_PURPLE + "Right-click to obtain");
	    	tooltip.add(ChatFormatting.LIGHT_PURPLE + "one randomly selected");
	    	tooltip.add(ChatFormatting.LIGHT_PURPLE + "MineStory book Pet!");
			return;
	     }
	}
	
	public static ItemStack randomPet(String type) {
		ItemStack returnItem = new ItemStack(MSPetItem.cellion_dark);
//		if(type == "book") {
//			Integer petID = getRandomNum(0, 2).intValue();
//			ItemStack returnPet;
//			switch(petID.toString()) {
//			   case "0":
//					returnPet = new ItemStack(MSPetItem.book_blue);
//					return returnPet;
//			   case "1":
//					returnPet = new ItemStack(MSPetItem.book_silver);
//					return returnPet;
//			   case "2":
//					returnPet = new ItemStack(MSPetItem.book_dark);
//					return returnPet;
//			default:
//				   break;
//			}
//		}
		if(type == "basic") {
			Integer petID = getRandomNum(0, 55).intValue();
			ItemStack returnPet;
			switch(petID.toString()) {
			   case "0":
					returnPet = new ItemStack(MSPetItem.bat_purple);
					return returnPet;
			   case "1":
					returnPet = new ItemStack(MSPetItem.bat_red);
					return returnPet;
			   case "2":
					returnPet = new ItemStack(MSPetItem.boogie_blue);
					return returnPet;
			   case "3":
					returnPet = new ItemStack(MSPetItem.boogie_dark);
					return returnPet;
			   case "4":
					returnPet = new ItemStack(MSPetItem.boogie_lime);
					return returnPet;
			   case "5":
					returnPet = new ItemStack(MSPetItem.boogie_pale);
					return returnPet;
			   case "6":
					returnPet = new ItemStack(MSPetItem.boogie_pink);
					return returnPet;
			   case "7":
					returnPet = new ItemStack(MSPetItem.cap_blue);
					return returnPet;
			   case "8":
					returnPet = new ItemStack(MSPetItem.cap_brown);
					return returnPet;
			   case "9":
					returnPet = new ItemStack(MSPetItem.cap_green);
					return returnPet;
			   case "10":
					returnPet = new ItemStack(MSPetItem.cap_purple);
					return returnPet;
			   case "11":
					returnPet = new ItemStack(MSPetItem.cellion_dark);
					return returnPet;
			   case "12":
					returnPet = new ItemStack(MSPetItem.cellion_gold);
					return returnPet;
			   case "13":
					returnPet = new ItemStack(MSPetItem.cellion_purple);
					return returnPet;
			   case "14":
					returnPet = new ItemStack(MSPetItem.cellion_red);
					return returnPet;
			   case "15":
					returnPet = new ItemStack(MSPetItem.eye_blue);
					return returnPet;
			   case "16":
					returnPet = new ItemStack(MSPetItem.eye_green);
					return returnPet;
			   case "17":
					returnPet = new ItemStack(MSPetItem.eye_yellow);
					return returnPet;
			   case "18":
					returnPet = new ItemStack(MSPetItem.eye_white);
					return returnPet;
			   case "19":
					returnPet = new ItemStack(MSPetItem.fish_blue);
					return returnPet;
			   case "20":
					returnPet = new ItemStack(MSPetItem.fish_purple);
					return returnPet;
			   case "21":
					returnPet = new ItemStack(MSPetItem.golem_blue);
					return returnPet;
			   case "22":
					returnPet = new ItemStack(MSPetItem.golem_brown);
					return returnPet;
			   case "23":
					returnPet = new ItemStack(MSPetItem.golem_grey);
					return returnPet;
			   case "24":
					returnPet = new ItemStack(MSPetItem.golem_white);
					return returnPet;
			   case "25":
					returnPet = new ItemStack(MSPetItem.mush_blue);
					return returnPet;
			   case "26":
					returnPet = new ItemStack(MSPetItem.mush_brown);
					return returnPet;
			   case "27":
					returnPet = new ItemStack(MSPetItem.mush_orange);
					return returnPet;
			   case "28":
					returnPet = new ItemStack(MSPetItem.pig_blue);
					return returnPet;
			   case "29":
					returnPet = new ItemStack(MSPetItem.pig_purple);
					return returnPet;
			   case "30":
					returnPet = new ItemStack(MSPetItem.pig_red);
					return returnPet;
			   case "31":
					returnPet = new ItemStack(MSPetItem.pig_yellow);
					return returnPet;
			   case "32":
					returnPet = new ItemStack(MSPetItem.rooster_dark);
					return returnPet;
			   case "33":
					returnPet = new ItemStack(MSPetItem.rooster_pale);
					return returnPet;
			   case "34":
					returnPet = new ItemStack(MSPetItem.shroom_orange);
					return returnPet;
			   case "35":
					returnPet = new ItemStack(MSPetItem.shroom_red);
					return returnPet;
			   case "36":
					returnPet = new ItemStack(MSPetItem.slime_blue);
					return returnPet;
			   case "37":
					returnPet = new ItemStack(MSPetItem.slime_green);
					return returnPet;
			   case "38":
					returnPet = new ItemStack(MSPetItem.slime_red);
					return returnPet;
			   case "39":
					returnPet = new ItemStack(MSPetItem.slime_silver);
					return returnPet;
			   case "40":
					returnPet = new ItemStack(MSPetItem.slime_yellow);
					return returnPet;
			   case "41":
					returnPet = new ItemStack(MSPetItem.snail_blue);
					return returnPet;
			   case "42":
					returnPet = new ItemStack(MSPetItem.snail_brown);
					return returnPet;
			   case "43":
					returnPet = new ItemStack(MSPetItem.snail_green);
					return returnPet;
			   case "44":
					returnPet = new ItemStack(MSPetItem.snail_purple);
					return returnPet;
			   case "45":
					returnPet = new ItemStack(MSPetItem.snail_red);
					return returnPet;
			   case "46":
					returnPet = new ItemStack(MSPetItem.stump_dark);
					return returnPet;
			   case "47":
					returnPet = new ItemStack(MSPetItem.stump_pale);
					return returnPet;
			   case "48":
					returnPet = new ItemStack(MSPetItem.tea_gold);
					return returnPet;
			   case "49":
					returnPet = new ItemStack(MSPetItem.tea_lime);
					return returnPet;
			   case "50":
					returnPet = new ItemStack(MSPetItem.tea_pink);
					return returnPet;
			   case "51":
					returnPet = new ItemStack(MSPetItem.yeti_blue);
					return returnPet;
			   case "52":
					returnPet = new ItemStack(MSPetItem.yeti_dark);
					return returnPet;
			   case "53":
					returnPet = new ItemStack(MSPetItem.yeti_gold);
					return returnPet;
			   case "54":
					returnPet = new ItemStack(MSPetItem.yeti_pale);
					return returnPet;
			   case "55":
					returnPet = new ItemStack(MSPetItem.yeti_pink);
					return returnPet;
			}
		}
		if(type == "rare") {
			Integer petID = getRandomNum(0, 1).intValue();
			ItemStack returnPet;
			switch(petID.toString()) {
			   case "0":
					returnPet = new ItemStack(MSPetItem.bat_purple);
					return returnPet;
			   case "1":
					returnPet = new ItemStack(MSPetItem.bat_red);
					return returnPet;
			}
		}
		if(type == "unique") {
			Integer petID = getRandomNum(0, 1).intValue();
			ItemStack returnPet;
			switch(petID.toString()) {
			   case "0":
					returnPet = new ItemStack(MSPetItem.bat_purple);
					return returnPet;
			   case "1":
					returnPet = new ItemStack(MSPetItem.bat_red);
					return returnPet;
			}
		}
		return returnItem;
	}

	@Override
	public void registerModels() {
		MineStory.proxy.registerItemRenderer(this, 0, "inventory");
	}
	  
}

