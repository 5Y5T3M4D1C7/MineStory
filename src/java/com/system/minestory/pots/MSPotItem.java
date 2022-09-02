package com.system.minestory.pots;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;

public class MSPotItem {
	public static final List<Item> Potions = new ArrayList<Item>();

	// Health Potions
	public static final Item phealth_small_red = new MSPotBase("phealth_small_red", "Health", 3);
	public static final Item phealth_small_blue = new MSPotBase("phealth_small_blue", "Health", 3);
	public static final Item phealth_medium_red = new MSPotBase("phealth_medium_red", "Health", 6);
	public static final Item phealth_medium_blue = new MSPotBase("phealth_medium_blue", "Health", 6);
	public static final Item phealth_large_red = new MSPotBase("phealth_large_red", "Health", 9);
	public static final Item phealth_large_blue = new MSPotBase("phealth_large_blue", "Health", 9);

	// Absorption Potions
	public static final Item pabs_small_red = new MSPotBase("pabs_small_red", "Absorption", 2);
	public static final Item pabs_small_blue = new MSPotBase("pabs_small_blue", "Absorption", 4);
	public static final Item pabs_small_white = new MSPotBase("pabs_small_white", "Absorption", 6);
	public static final Item pabs_small_orange = new MSPotBase("pabs_small_orange", "Absorption", 8);

	// Experience Potions
	public static final Item pexp_small_red = new MSPotBase("pexp_small_red", "Experience", 5);
	public static final Item pexp_small_blue = new MSPotBase("pexp_small_blue", "Experience", 6);
	public static final Item pexp_small_purple = new MSPotBase("pexp_small_purple", "Experience", 7);
	public static final Item pexp_small_orange = new MSPotBase("pexp_small_orange", "Experience", 8);
	public static final Item pexp_small_green = new MSPotBase("pexp_small_green", "Experience", 9);

	// Level Potions
	public static final Item plvl_small_blue = new MSPotBase("plvl_small_blue", "Level", 1);
	public static final Item plvl_small_orange = new MSPotBase("plvl_small_orange", "Level", 2);
	public static final Item plvl_small_pink = new MSPotBase("plvl_small_pink", "Level", 3);
	public static final Item plvl_small_black = new MSPotBase("plvl_small_black", "Level", 4);
	public static final Item plvl_small_white = new MSPotBase("plvl_small_white", "Level", 5);

	// Milk Potions
	public static final Item pmilk_small_green = new MSPotBase("pmilk_small_green", "Milk", 0);
	public static final Item pmilk_small_pink = new MSPotBase("pmilk_small_pink", "Milk", 1);
	public static final Item pmilk_small_purple = new MSPotBase("pmilk_small_purple", "Milk", 2);

	// Saturation Potions
	public static final Item psat_small_blue = new MSPotBase("psat_small_blue", "Saturation", 2);
	public static final Item psat_small_red = new MSPotBase("psat_small_red", "Saturation", 4);
	public static final Item psat_small_purple = new MSPotBase("psat_small_purple", "Saturation", 6);
	public static final Item psat_small_green = new MSPotBase("psat_small_green", "Saturation", 8);

}
