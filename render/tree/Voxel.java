package render.tree;

public class Voxel 
{
	//The coordinates of the lowest corner of the voxel;
	public float x;
	public float y;
	
	//The width and height of the voxel
	public float width;
	public float height;
	
	//Since the tree can only store size 1/(n^x) voxels using a size class for x is a possible way to define voxel size
	
	public int sizeClass; 
}
