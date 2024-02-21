package com.system.minestory;

import com.system.minestory.pets.MSPetTab;
import com.system.minestory.pots.MSPotTab;
import com.system.minestory.scrolls.MSScrollTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class MineStory {
	  @Instance
	  public static MineStory instance;
	  
	  @SidedProxy(clientSide = Reference.CLIENTSIDE, serverSide = Reference.SERVERSIDE)
	  public static CommonProxy proxy;

	  public static final CreativeTabs MineStoryPets = new MSPetTab();
	  public static final CreativeTabs MineStoryScrolls = new MSScrollTab();
	  public static final CreativeTabs MineStoryPotions = new MSPotTab();
	  
	  @EventHandler
	  public void preinit(FMLPreInitializationEvent event) {
	    System.out.println("preinit");
	  }
	  
	  @EventHandler
	  public void init(FMLInitializationEvent event) {
	    System.out.println("init");
	    NetworkRegistry.INSTANCE.registerGuiHandler(instance, (IGuiHandler)new MSGuiHandler());
	  }
	  
	  @EventHandler
	  public void postinit(FMLPostInitializationEvent event) {
	    System.out.println("postinit");
	  }
	}
