package binarysearchtree;

public class Tree {
	
	private TreeNode root;
	
	public void insert(int value) {
		if(root==null) {
			root= new TreeNode(value);
		} else {
			root.insert(value);
		}
	}
	
	public void inorderTraversal() {
		root.traverseInOrder();
	}
	
	public TreeNode getNode(int value) {
		if(root==null) {
			return null;
		} else {
			return (TreeNode) root.get(value);
		}
	}
	
	public int min() {
		if (root == null) {
			return Integer.MIN_VALUE;
		} else {
			return root.min();
		}
	}
	
	public int max() {
		if (root == null) {
			return Integer.MAX_VALUE;
		} else {
			return root.max();
		}
	}
	

}
