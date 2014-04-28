package render.tree;


//Each tree holds a single voxel, and a list of trees that are 8 sub-voxels of the voxel in the tree
//Tree can be of infinite length allowing any size 1/(n^2) of voxel to be stored and the size of the entire tree is ~n.

public class VoxelTree 
{
	public VoxelTree[] voxelList = new VoxelTree[8];// (0, 0, 0), (0, 1, 0), (1, 0, 0), (1, 1, 0), (0, 0, 1), (0, 1, 1), (1, 0, 1), (1, 1, 1)
	public Voxel slot;
	
	public VoxelTree(Voxel voxel)
	{
		
	}
}
