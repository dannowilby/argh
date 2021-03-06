package wilby.argh.multiblock.tileentity;

import net.minecraft.nbt.NBTTagCompound;
import wilby.argh.multiblock.MultiblockBricker;

public class TileEntityBricker extends TileEntityMultiblock
{
	
	public TileEntityBricker() 
	{
		super("bricker");
	}
	
	public NBTTagCompound writeToNBT(NBTTagCompound compound)
	{
		super.writeToNBT(compound);
		
		return compound;
	}
	
	public void readFromNBT(NBTTagCompound compound)
	{
		super.readFromNBT(compound);
	}
	
}
