package binarysearchtree;

public class TreeNode {
	private TreeNode leftChild;
	private TreeNode rightChild;
	private Integer data;
	
	public TreeNode(int data) {
		this.data=data;
	}
	
	public TreeNode get(int value) {
		if (value == data) {
			return this;
		}
		if(value<data) {
			if (leftChild!=null) {
				return leftChild.get(value);
			}
		} else {
			if (rightChild!=null) {
				return rightChild.get(value);
			}
		}
		return null;
		
	}
	
	public int min() {
		if(leftChild==null) {
			return data;
		} else {
			return leftChild.min();
		}
	}
	
	public int max() {
		if(rightChild==null) {
			return data;
		} else {
			return rightChild.max();
		}
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
	
	public void traverseInOrder() {
		if (leftChild!=null) {
			leftChild.traverseInOrder();
		}
		System.out.print(data+" ");
		if (rightChild!=null) {
			rightChild.traverseInOrder();
		}
		
	}
	public String getData() {
		return this!=null? data.toString(): "-1";
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
	
/*	public String toString() {
		return this.data;	
	}*/
	
}
