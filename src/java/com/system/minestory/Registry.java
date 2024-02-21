package com.system.minestory;

import com.system.minestory.pets.MSPetBase;
import com.system.minestory.pets.MSPetItem;
import com.system.minestory.pots.MSPotItem;
import com.system.minestory.scrolls.MSScrollItem;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

@EventBusSubscriber
public class Registry {
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(MSPetItem.Pets.toArray(new Item[0]));
		event.getRegistry().registerAll(MSScrollItem.Scrolls.toArray(new Item[0]));
		event.getRegistry().registerAll(MSPotItem.Potions.toArray(new Item[0]));
	}
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		for (Item item : MSPetItem.Pets) {
			if(item instanceof ItemModel) {
				((ItemModel)item).registerModels();
			}
		}
		for (Item item : MSScrollItem.Scrolls) {
			if(item instanceof ItemModel) {
				((ItemModel)item).registerModels();
			}
		}
		for (Item item : MSPotItem.Potions) {
			if(item instanceof ItemModel) {
				((ItemModel)item).registerModels();
			}
		}
	} 
	
	@SubscribeEvent
	  public static void onLivingEvent(PlayerTickEvent event) {
	for (int i = 0;i<9;i++) {
		EntityPlayer ePlayer = event.player;
		if(ePlayer.inventory.getStackInSlot(i).getItem() instanceof MSPetBase) {
			ItemStack petStack = ePlayer.inventory.getStackInSlot(i);
			MSPetBase atem = (MSPetBase)petStack.getItem();
			NBTTagCompound nbt = petStack.getTagCompound();
			Integer petLevel;
			if(nbt == null) {
				petLevel = 0;
			} else {
				petLevel = nbt.getInteger("petLevel");
			}
			switch(atem.petType) {
			case "shroom":
				ePlayer.addPotionEffect(new PotionEffect(MobEffects.HASTE, 2, petLevel));
				return;
			case "snail":
				ePlayer.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 2, petLevel));
					return;
			case "mush":
				ePlayer.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, 2, petLevel));
					return;
			case "pig":
				ePlayer.addPotionEffect(new PotionEffect(MobEffects.SPEED, 2, petLevel));
					return;
			case "slime":
				ePlayer.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 2, petLevel));
					return;
			case "tea":
				ePlayer.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 2, petLevel));
					return;
			case "golem":
				ePlayer.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 2, petLevel));
					return;
			case "cellion":
				ePlayer.addPotionEffect(new PotionEffect(MobEffects.GLOWING, 2, petLevel));
					return;
			case "eye":
				ePlayer.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 2, petLevel));
					return;
			case "boogie":
				ePlayer.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 2, petLevel));
					return;
			case "bat":
				ePlayer.addPotionEffect(new PotionEffect(MobEffects.LEVITATION, 2, petLevel));
					return;
			case "rooster":
				ePlayer.addPotionEffect(new PotionEffect(MobEffects.LUCK, 2, petLevel));
					return;
			case "stump":
				ePlayer.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 2, petLevel));
					return;
			case "cap":
				ePlayer.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 2, petLevel));
					return;
			case "yeti":
				ePlayer.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 2, petLevel));
					return;
			case "fish":
				ePlayer.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 2, petLevel));
					return;
			default:
				return;
			}
		}
	}
	}
}
