package binarysearchtree;

public class TreeNode {
	private TreeNode leftChild;
	private TreeNode rightChild;
	private int data;
	
	public TreeNode(int data) {
		this.data=data;
	}
	
	public void insert(int value) {
		if (value==data) {
			return; //we do not support duplicates
		}
		if(value<data) {
			if (leftChild == null) {
				leftChild=new TreeNode(value);
			} else {
				leftChild.insert(value);
			}
		} else if (value>data) {
			if (rightChild==null) {
				rightChild= new TreeNode(value);
			} else {
				rightChild.insert(value);
			}			
		}
		
	}
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data=data;
	}
	
	public TreeNode getLeftNode() {
		return leftChild;
	}
	
	public void setLeftChild(TreeNode leftChild) {
		this.leftChild=leftChild;
	}
	
	public TreeNode getRightNode() {
		return rightChild;
	}
	
	public void setRightChild(TreeNode rightChild) {
		this.rightChild=rightChild;
	}
	
}
