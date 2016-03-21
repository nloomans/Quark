/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Quark Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Quark
 * 
 * Quark is Open Source and distributed under the
 * [ADD-LICENSE-HERE]
 * 
 * File Created @ [18/03/2016, 22:32:56 (GMT)]
 */
package vazkii.quark.tweaks;

import vazkii.quark.base.module.Module;
import vazkii.quark.tweaks.feature.AngryCreepers;
import vazkii.quark.tweaks.feature.ArrowSafeMobs;
import vazkii.quark.tweaks.feature.ChickensShedFeathers;
import vazkii.quark.tweaks.feature.DispensersPlaceSeeds;
import vazkii.quark.tweaks.feature.GlassShards;
import vazkii.quark.tweaks.feature.LookDownLadders;
import vazkii.quark.tweaks.feature.SlabsToBlocks;
import vazkii.quark.tweaks.feature.StackableItems;
import vazkii.quark.tweaks.feature.StairsMakeMore;

public class QuarkTweaks extends Module {

	@Override
	public void addFeatures() {
		registerFeature(new StackableItems());
		registerFeature(new LookDownLadders(), "Look down on ladders to descend fast");
//		registerFeature(new RightClickSignEdit()); TODO: Broken until forge fixes PlayerInteractEvent
		registerFeature(new ChickensShedFeathers());
		registerFeature(new AngryCreepers(), "Creepers turn red when they're exploding");
		registerFeature(new GlassShards());
		registerFeature(new StairsMakeMore(), "Stair crafting makes more");
		registerFeature(new SlabsToBlocks(), "Slabs to blocks recipe");
		registerFeature(new ArrowSafeMobs(), "Ridable mobs are immune to rider's arrows");
		registerFeature(new DispensersPlaceSeeds());
	}
	
}