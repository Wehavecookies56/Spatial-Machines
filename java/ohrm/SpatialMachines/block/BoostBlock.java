package ohrm.SpatialMachines.block;

import ohrm.SpatialMachines.Reference.Reference;
import ohrm.SpatialMachines.main.SpatialMain;
import ohrm.SpatialMachines.tile.TileEntityBoostBlock;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BoostBlock extends BlockContainer {

	protected BoostBlock() {
		
		super(Material.anvil);
		setBlockName(Reference.MODID + "_" + "BoostBlock");
		setBlockTextureName(Reference.MODID + ":" + "BoostBlock");
		setCreativeTab(SpatialMain.spatialTab);
		this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setHarvestLevel("pickaxe", 1);
		
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		
		return new TileEntityBoostBlock();
		
	}

	@Override
	public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
		
		p_149727_5_.openGui(SpatialMain.instance, 1, p_149727_1_, p_149727_2_, p_149727_3_, p_149727_4_);
		
		return true;
	}
	
}