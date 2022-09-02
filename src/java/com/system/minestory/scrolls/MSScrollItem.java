package com.system.minestory.scrolls;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;

public class MSScrollItem {
	
	public static final List<Item> Scrolls = new ArrayList<Item>();

	// 100% Scrolls
	public static final Item scroll_affinity_100 = new MSScrollBase("scroll_affinity_100", generateEnchantList(0), 100);
	public static final Item scroll_bane_100 = new MSScrollBase("scroll_bane_100", generateEnchantList(1), 100);
	public static final Item scroll_binding_100 = new MSScrollBase("scroll_binding_100", generateEnchantList(2), 100);
	public static final Item scroll_protectB_100 = new MSScrollBase("scroll_protectB_100", generateEnchantList(3), 100);
	public static final Item scroll_depth_100 = new MSScrollBase("scroll_depth_100", generateEnchantList(4), 100);
	public static final Item scroll_efficient_100 = new MSScrollBase("scroll_efficient_100", generateEnchantList(5), 100);
	public static final Item scroll_fall_100 = new MSScrollBase("scroll_fall_100", generateEnchantList(6), 100);
	public static final Item scroll_fire_100 = new MSScrollBase("scroll_fire_100", generateEnchantList(7), 100);
	public static final Item scroll_protectF_100 = new MSScrollBase("scroll_protectF_100", generateEnchantList(8), 100);
	public static final Item scroll_burn_100 = new MSScrollBase("scroll_burn_100", generateEnchantList(9), 100);
	public static final Item scroll_luck_100 = new MSScrollBase("scroll_luck_100", generateEnchantList(10), 100);
	public static final Item scroll_frost_100 = new MSScrollBase("scroll_frost_100", generateEnchantList(11), 100);
	public static final Item scroll_infinite_100 = new MSScrollBase("scroll_infinite_100", generateEnchantList(12), 100);
	public static final Item scroll_knocked_100 = new MSScrollBase("scroll_knocked_100", generateEnchantList(13), 100);
	public static final Item scroll_loot_100 = new MSScrollBase("scroll_loot_100", generateEnchantList(14), 100);
	public static final Item scroll_sea_100 = new MSScrollBase("scroll_sea_100", generateEnchantList(15), 100);
	public static final Item scroll_bait_100 = new MSScrollBase("scroll_bait_100", generateEnchantList(16), 100);
	public static final Item scroll_restore_100 = new MSScrollBase("scroll_restore_100", generateEnchantList(17), 100);
	public static final Item scroll_power_100 = new MSScrollBase("scroll_power_100", generateEnchantList(18), 100);
	public static final Item scroll_protectP_100 = new MSScrollBase("scroll_protectP_100", generateEnchantList(19), 100);
	public static final Item scroll_protectA_100 = new MSScrollBase("scroll_protectA_100", generateEnchantList(20), 100);
	public static final Item scroll_recoil_100 = new MSScrollBase("scroll_recoil_100", generateEnchantList(21), 100);
	public static final Item scroll_sharpness_100 = new MSScrollBase("scroll_sharpness_100", generateEnchantList(22), 100);
	public static final Item scroll_breath_100 = new MSScrollBase("scroll_breath_100", generateEnchantList(23), 100);
	public static final Item scroll_silk_100 = new MSScrollBase("scroll_silk_100", generateEnchantList(24), 100);
	public static final Item scroll_smite_100 = new MSScrollBase("scroll_smite_100", generateEnchantList(25), 100);
	public static final Item scroll_sweep_100 = new MSScrollBase("scroll_sweep_100", generateEnchantList(26), 100);
	public static final Item scroll_reflect_100 = new MSScrollBase("scroll_reflect_100", generateEnchantList(27), 100);
	public static final Item scroll_solid_100 = new MSScrollBase("scroll_solid_100", generateEnchantList(28), 100);
	public static final Item scroll_vanish_100 = new MSScrollBase("scroll_vanish_100", generateEnchantList(29), 100);
	// 70% Scrolls
	public static final Item scroll_affinity_70 = new MSScrollBase("scroll_affinity_70", generateEnchantList(0), 70);
	public static final Item scroll_bane_70 = new MSScrollBase("scroll_bane_70", generateEnchantList(1), 70);
	public static final Item scroll_binding_70 = new MSScrollBase("scroll_binding_70", generateEnchantList(2), 70);
	public static final Item scroll_protectB_70 = new MSScrollBase("scroll_protectB_70", generateEnchantList(3), 70);
	public static final Item scroll_depth_70 = new MSScrollBase("scroll_depth_70", generateEnchantList(4), 70);
	public static final Item scroll_efficient_70 = new MSScrollBase("scroll_efficient_70", generateEnchantList(5), 70);
	public static final Item scroll_fall_70 = new MSScrollBase("scroll_fall_70", generateEnchantList(6), 70);
	public static final Item scroll_fire_70 = new MSScrollBase("scroll_fire_70", generateEnchantList(7), 70);
	public static final Item scroll_protectF_70 = new MSScrollBase("scroll_protectF_70", generateEnchantList(8), 70);
	public static final Item scroll_burn_70 = new MSScrollBase("scroll_burn_70", generateEnchantList(9), 70);
	public static final Item scroll_luck_70 = new MSScrollBase("scroll_luck_70", generateEnchantList(10), 70);
	public static final Item scroll_frost_70 = new MSScrollBase("scroll_frost_70", generateEnchantList(11), 70);
	public static final Item scroll_infinite_70 = new MSScrollBase("scroll_infinite_70", generateEnchantList(12), 70);
	public static final Item scroll_knocked_70 = new MSScrollBase("scroll_knocked_70", generateEnchantList(13), 70);
	public static final Item scroll_loot_70 = new MSScrollBase("scroll_loot_70", generateEnchantList(14), 70);
	public static final Item scroll_sea_70 = new MSScrollBase("scroll_sea_70", generateEnchantList(15), 70);
	public static final Item scroll_bait_70 = new MSScrollBase("scroll_bait_70", generateEnchantList(16), 70);
	public static final Item scroll_restore_70 = new MSScrollBase("scroll_restore_70", generateEnchantList(17), 70);
	public static final Item scroll_power_70 = new MSScrollBase("scroll_power_70", generateEnchantList(18), 70);
	public static final Item scroll_protectP_70 = new MSScrollBase("scroll_protectP_70", generateEnchantList(19), 70);
	public static final Item scroll_protectA_70 = new MSScrollBase("scroll_protectA_70", generateEnchantList(20), 70);
	public static final Item scroll_recoil_70 = new MSScrollBase("scroll_recoil_70", generateEnchantList(21), 70);
	public static final Item scroll_sharpness_70 = new MSScrollBase("scroll_sharpness_70", generateEnchantList(22), 70);
	public static final Item scroll_breath_70 = new MSScrollBase("scroll_breath_70", generateEnchantList(23), 70);
	public static final Item scroll_silk_70 = new MSScrollBase("scroll_silk_70", generateEnchantList(24), 70);
	public static final Item scroll_smite_70 = new MSScrollBase("scroll_smite_70", generateEnchantList(25), 70);
	public static final Item scroll_sweep_70 = new MSScrollBase("scroll_sweep_70", generateEnchantList(26), 70);
	public static final Item scroll_reflect_70 = new MSScrollBase("scroll_reflect_70", generateEnchantList(27), 70);
	public static final Item scroll_solid_70 = new MSScrollBase("scroll_solid_70", generateEnchantList(28), 70);
	public static final Item scroll_vanish_70 = new MSScrollBase("scroll_vanish_70", generateEnchantList(29), 70);
	// 50% Scrolls
	public static final Item scroll_affinity_50 = new MSScrollBase("scroll_affinity_50", generateEnchantList(0), 50);
	public static final Item scroll_bane_50 = new MSScrollBase("scroll_bane_50", generateEnchantList(1), 50);
	public static final Item scroll_binding_50 = new MSScrollBase("scroll_binding_50", generateEnchantList(2), 50);
	public static final Item scroll_protectB_50 = new MSScrollBase("scroll_protectB_50", generateEnchantList(3), 50);
	public static final Item scroll_depth_50 = new MSScrollBase("scroll_depth_50", generateEnchantList(4), 50);
	public static final Item scroll_efficient_50 = new MSScrollBase("scroll_efficient_50", generateEnchantList(5), 50);
	public static final Item scroll_fall_50 = new MSScrollBase("scroll_fall_50", generateEnchantList(6), 50);
	public static final Item scroll_fire_50 = new MSScrollBase("scroll_fire_50", generateEnchantList(7), 50);
	public static final Item scroll_protectF_50 = new MSScrollBase("scroll_protectF_50", generateEnchantList(8), 50);
	public static final Item scroll_burn_50 = new MSScrollBase("scroll_burn_50", generateEnchantList(9), 50);
	public static final Item scroll_luck_50 = new MSScrollBase("scroll_luck_50", generateEnchantList(10), 50);
	public static final Item scroll_frost_50 = new MSScrollBase("scroll_frost_50", generateEnchantList(11), 50);
	public static final Item scroll_infinite_50 = new MSScrollBase("scroll_infinite_50", generateEnchantList(12), 50);
	public static final Item scroll_knocked_50 = new MSScrollBase("scroll_knocked_50", generateEnchantList(13), 50);
	public static final Item scroll_loot_50 = new MSScrollBase("scroll_loot_50", generateEnchantList(14), 50);
	public static final Item scroll_sea_50 = new MSScrollBase("scroll_sea_50", generateEnchantList(15), 50);
	public static final Item scroll_bait_50 = new MSScrollBase("scroll_bait_50", generateEnchantList(16), 50);
	public static final Item scroll_restore_50 = new MSScrollBase("scroll_restore_50", generateEnchantList(17), 50);
	public static final Item scroll_power_50 = new MSScrollBase("scroll_power_50", generateEnchantList(18), 50);
	public static final Item scroll_protectP_50 = new MSScrollBase("scroll_protectP_50", generateEnchantList(19), 50);
	public static final Item scroll_protectA_50 = new MSScrollBase("scroll_protectA_50", generateEnchantList(20), 50);
	public static final Item scroll_recoil_50 = new MSScrollBase("scroll_recoil_50", generateEnchantList(21), 50);
	public static final Item scroll_sharpness_50 = new MSScrollBase("scroll_sharpness_50", generateEnchantList(22), 50);
	public static final Item scroll_breath_50 = new MSScrollBase("scroll_breath_50", generateEnchantList(23), 50);
	public static final Item scroll_silk_50 = new MSScrollBase("scroll_silk_50", generateEnchantList(24), 50);
	public static final Item scroll_smite_50 = new MSScrollBase("scroll_smite_50", generateEnchantList(25), 50);
	public static final Item scroll_sweep_50 = new MSScrollBase("scroll_sweep_50", generateEnchantList(26), 50);
	public static final Item scroll_reflect_50 = new MSScrollBase("scroll_reflect_50", generateEnchantList(27), 50);
	public static final Item scroll_solid_50 = new MSScrollBase("scroll_solid_50", generateEnchantList(28), 50);
	public static final Item scroll_vanish_50 = new MSScrollBase("scroll_vanish_50", generateEnchantList(29), 50);
	// 30% Scrolls
	public static final Item scroll_affinity_30 = new MSScrollBase("scroll_affinity_30", generateEnchantList(0), 30);
	public static final Item scroll_bane_30 = new MSScrollBase("scroll_bane_30", generateEnchantList(1), 30);
	public static final Item scroll_binding_30 = new MSScrollBase("scroll_binding_30", generateEnchantList(2), 30);
	public static final Item scroll_protectB_30 = new MSScrollBase("scroll_protectB_30", generateEnchantList(3), 30);
	public static final Item scroll_depth_30 = new MSScrollBase("scroll_depth_30", generateEnchantList(4), 30);
	public static final Item scroll_efficient_30 = new MSScrollBase("scroll_efficient_30", generateEnchantList(5), 30);
	public static final Item scroll_fall_30 = new MSScrollBase("scroll_fall_30", generateEnchantList(6), 30);
	public static final Item scroll_fire_30 = new MSScrollBase("scroll_fire_30", generateEnchantList(7), 30);
	public static final Item scroll_protectF_30 = new MSScrollBase("scroll_protectF_30", generateEnchantList(8), 30);
	public static final Item scroll_burn_30 = new MSScrollBase("scroll_burn_30", generateEnchantList(9), 30);
	public static final Item scroll_luck_30 = new MSScrollBase("scroll_luck_30", generateEnchantList(10), 30);
	public static final Item scroll_frost_30 = new MSScrollBase("scroll_frost_30", generateEnchantList(11), 30);
	public static final Item scroll_infinite_30 = new MSScrollBase("scroll_infinite_30", generateEnchantList(12), 30);
	public static final Item scroll_knocked_30 = new MSScrollBase("scroll_knocked_30", generateEnchantList(13), 30);
	public static final Item scroll_loot_30 = new MSScrollBase("scroll_loot_30", generateEnchantList(14), 30);
	public static final Item scroll_sea_30 = new MSScrollBase("scroll_sea_30", generateEnchantList(15), 30);
	public static final Item scroll_bait_30 = new MSScrollBase("scroll_bait_30", generateEnchantList(16), 30);
	public static final Item scroll_restore_30 = new MSScrollBase("scroll_restore_30", generateEnchantList(17), 30);
	public static final Item scroll_power_30 = new MSScrollBase("scroll_power_30", generateEnchantList(18), 30);
	public static final Item scroll_protectP_30 = new MSScrollBase("scroll_protectP_30", generateEnchantList(19), 30);
	public static final Item scroll_protectA_30 = new MSScrollBase("scroll_protectA_30", generateEnchantList(20), 30);
	public static final Item scroll_recoil_30 = new MSScrollBase("scroll_recoil_30", generateEnchantList(21), 30);
	public static final Item scroll_sharpness_30 = new MSScrollBase("scroll_sharpness_30", generateEnchantList(22), 30);
	public static final Item scroll_breath_30 = new MSScrollBase("scroll_breath_30", generateEnchantList(23), 30);
	public static final Item scroll_silk_30 = new MSScrollBase("scroll_silk_30", generateEnchantList(24), 30);
	public static final Item scroll_smite_30 = new MSScrollBase("scroll_smite_30", generateEnchantList(25), 30);
	public static final Item scroll_sweep_30 = new MSScrollBase("scroll_sweep_30", generateEnchantList(26), 30);
	public static final Item scroll_reflect_30 = new MSScrollBase("scroll_reflect_30", generateEnchantList(27), 30);
	public static final Item scroll_solid_30 = new MSScrollBase("scroll_solid_30", generateEnchantList(28), 30);
	public static final Item scroll_vanish_30 = new MSScrollBase("scroll_vanish_30", generateEnchantList(29), 30);
	// 10% Scrolls
	public static final Item scroll_affinity_10 = new MSScrollBase("scroll_affinity_10", generateEnchantList(0), 10);
	public static final Item scroll_bane_10 = new MSScrollBase("scroll_bane_10", generateEnchantList(1), 10);
	public static final Item scroll_binding_10 = new MSScrollBase("scroll_binding_10", generateEnchantList(2), 10);
	public static final Item scroll_protectB_10 = new MSScrollBase("scroll_protectB_10", generateEnchantList(3), 10);
	public static final Item scroll_depth_10 = new MSScrollBase("scroll_depth_10", generateEnchantList(4), 10);
	public static final Item scroll_efficient_10 = new MSScrollBase("scroll_efficient_10", generateEnchantList(5), 10);
	public static final Item scroll_fall_10 = new MSScrollBase("scroll_fall_10", generateEnchantList(6), 10);
	public static final Item scroll_fire_10 = new MSScrollBase("scroll_fire_10", generateEnchantList(7), 10);
	public static final Item scroll_protectF_10 = new MSScrollBase("scroll_protectF_10", generateEnchantList(8), 10);
	public static final Item scroll_burn_10 = new MSScrollBase("scroll_burn_10", generateEnchantList(9), 10);
	public static final Item scroll_luck_10 = new MSScrollBase("scroll_luck_10", generateEnchantList(10), 10);
	public static final Item scroll_frost_10 = new MSScrollBase("scroll_frost_10", generateEnchantList(11), 10);
	public static final Item scroll_infinite_10 = new MSScrollBase("scroll_infinite_10", generateEnchantList(12), 10);
	public static final Item scroll_knocked_10 = new MSScrollBase("scroll_knocked_10", generateEnchantList(13), 10);
	public static final Item scroll_loot_10 = new MSScrollBase("scroll_loot_10", generateEnchantList(14), 10);
	public static final Item scroll_sea_10 = new MSScrollBase("scroll_sea_10", generateEnchantList(15), 10);
	public static final Item scroll_bait_10 = new MSScrollBase("scroll_bait_10", generateEnchantList(16), 10);
	public static final Item scroll_restore_10 = new MSScrollBase("scroll_restore_10", generateEnchantList(17), 10);
	public static final Item scroll_power_10 = new MSScrollBase("scroll_power_10", generateEnchantList(18), 10);
	public static final Item scroll_protectP_10 = new MSScrollBase("scroll_protectP_10", generateEnchantList(19), 10);
	public static final Item scroll_protectA_10 = new MSScrollBase("scroll_protectA_10", generateEnchantList(20), 10);
	public static final Item scroll_recoil_10 = new MSScrollBase("scroll_recoil_10", generateEnchantList(21), 10);
	public static final Item scroll_sharpness_10 = new MSScrollBase("scroll_sharpness_10", generateEnchantList(22), 10);
	public static final Item scroll_breath_10 = new MSScrollBase("scroll_breath_10", generateEnchantList(23), 10);
	public static final Item scroll_silk_10 = new MSScrollBase("scroll_silk_10", generateEnchantList(24), 10);
	public static final Item scroll_smite_10 = new MSScrollBase("scroll_smite_10", generateEnchantList(25), 10);
	public static final Item scroll_sweep_10 = new MSScrollBase("scroll_sweep_10", generateEnchantList(26), 10);
	public static final Item scroll_reflect_10 = new MSScrollBase("scroll_reflect_10", generateEnchantList(27), 10);
	public static final Item scroll_solid_10 = new MSScrollBase("scroll_solid_10", generateEnchantList(28), 10);
	public static final Item scroll_vanish_10 = new MSScrollBase("scroll_vanish_10", generateEnchantList(29), 10);
	
	private static List<Enchantment> generateEnchantList(int index){
		List<Enchantment> enchant = new ArrayList<Enchantment>();
		switch(index) {
			case 0:
				enchant.add(Enchantments.AQUA_AFFINITY);
				return enchant;
			case 1:
				enchant.add(Enchantments.BANE_OF_ARTHROPODS);
				return enchant;
			case 2:
				enchant.add(Enchantments.BINDING_CURSE);
				return enchant;
			case 3:
				enchant.add(Enchantments.BLAST_PROTECTION);
				return enchant;
			case 4:
				enchant.add(Enchantments.DEPTH_STRIDER);
				return enchant;
			case 5:
				enchant.add(Enchantments.EFFICIENCY);
				return enchant;
			case 6:
				enchant.add(Enchantments.FEATHER_FALLING);
				return enchant;
			case 7:
				enchant.add(Enchantments.FIRE_ASPECT);
				return enchant;
			case 8:
				enchant.add(Enchantments.FIRE_PROTECTION);
				return enchant;
			case 9:
				enchant.add(Enchantments.FLAME);
				return enchant;
			case 10:
				enchant.add(Enchantments.FORTUNE);
				return enchant;
			case 11:
				enchant.add(Enchantments.FROST_WALKER);
				return enchant;
			case 12:
				enchant.add(Enchantments.INFINITY);
				return enchant;
			case 13:
				enchant.add(Enchantments.KNOCKBACK);
				return enchant;
			case 14:
				enchant.add(Enchantments.LOOTING);
				return enchant;
			case 15:
				enchant.add(Enchantments.LUCK_OF_THE_SEA);
				return enchant;
			case 16:
				enchant.add(Enchantments.LURE);
				return enchant;
			case 17:
				enchant.add(Enchantments.MENDING);
				return enchant;
			case 18:
				enchant.add(Enchantments.POWER);
				return enchant;
			case 19:
				enchant.add(Enchantments.PROJECTILE_PROTECTION);
				return enchant;
			case 20:
				enchant.add(Enchantments.PROTECTION);
				return enchant;
			case 21:
				enchant.add(Enchantments.PUNCH);
				return enchant;
			case 22:
				enchant.add(Enchantments.RESPIRATION);
				return enchant;
			case 23:
				enchant.add(Enchantments.SHARPNESS);
				return enchant;
			case 24:
				enchant.add(Enchantments.SILK_TOUCH);
				return enchant;
			case 25:
				enchant.add(Enchantments.SMITE);
				return enchant;
			case 26:
				enchant.add(Enchantments.SWEEPING);
				return enchant;
			case 27:
				enchant.add(Enchantments.THORNS);
				return enchant;
			case 28:
				enchant.add(Enchantments.UNBREAKING);
				return enchant;
			case 29:
				enchant.add(Enchantments.VANISHING_CURSE);
				return enchant;
		}
		return enchant;
	}
}
