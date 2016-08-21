public class MirrorBinaryTree{
	public BinaryTree mirrorBinaryTree(BinaryTree orignalTree,BinaryTree mirrorTree){
		mirrorTree.value=orignalTree.value;
		if(orignalTree.left!=null){
			mirrorTree.right=orignalTree.left;
			mirrorBinaryTree(orignalTree.left,mirrorTree.right);
		}
		if(orignalTree.right!=null){
			mirrorTree.left=orignalTree.right;
			mirrorBinaryTree(orignalTree.right,mirrorTree.left);
		}
		return mirrorTree;
	}
}