package printcommonnodes;

import java.util.ArrayList;

public class Tree {
	TreeNode root;
	int size;
	static class TreeNode{
		int data;
		TreeNode leftChild;
		TreeNode rightChild;
		
		public TreeNode(int data) {
			this.data=data;
		}
		
		public boolean add(int data, TreeNode head) {
			if(head==null) {
				head=new TreeNode(data);
				return true;		
			}
			
			//if(data==head.data) return false; //duplicates not allowed.
			//System.out.println("ADDED "+"data "+data+" head.data "+head.data);
			if(data<head.data) {
				if(head.getLeftChild()!=null) {
				//System.out.println("ADDED1 "+"data "+data+" head.data "+head.data);
				add(data, head.getLeftChild());
				} else {
					head.leftChild= new TreeNode(data);					
				}				
			} 
			if(data>head.data) {
				//System.out.println("ADDED2 "+"data "+data+" head.data "+head.data);
				if(head.getRightChild()!=null) {
				add(data, head.getRightChild());
				} else {
					head.rightChild= new TreeNode(data);					
				}
			}			
			return true;
		}

		private int getData() {
			return this.data;
		}

		private TreeNode getLeftChild() {
			// TODO Auto-generated method stub
			return this.leftChild;
		}
		
		private TreeNode getRightChild() {
			// TODO Auto-generated method stub
			return this.rightChild;
		}

		public static int traverseInOrder(TreeNode node, int min, int max, int res) {
			// TODO Auto-generated method stub
			if(node==null) {
				//System.out.println("NULL");
				return res;
			}
			res=traverseInOrder(node.getLeftChild(), min, max, res);
			if(node.data>= min && node.data<=max) {
				//System.out.println(node.data);
				res=res+1;
			}
			res=traverseInOrder(node.getRightChild(), min, max, res);			
			return res;
		}

		public static int traversePreOrder(TreeNode node, int res) {
			if(node==null) {
				return 0;
			}
			
			res=node.getData()+res*10;
			
			if(node.getLeftChild()==null && node.getRightChild()==null) {
				return res;				
			}
			
			res=traversePreOrder(node.getLeftChild(), res)+traversePreOrder(node.getRightChild(),res);	
			return res;	
		}

		public static ArrayList<Integer> traverseInOrderArray(TreeNode node, ArrayList<Integer> nodes) {
			// TODO Auto-generated method stub
			if(node==null) {
				//System.out.println("NULL");
				return null;
			}
			//System.out.println("FIRST: "+size);
			traverseInOrderArray(node.getLeftChild(), nodes);
			//System.out.println("SECOND: "+size);
			//nodes[size++]=node.data;
			//System.out.println(node.data+" == "+size);
			nodes.add(node.getData());
			traverseInOrderArray(node.getRightChild(), nodes);
			//System.out.println("THIRD: "+size);
			return nodes;
		}
		
	}

	public Tree(int data) {
		size++;
		root= new TreeNode(data);
		
	}
	
	public boolean addNode(int data) {
		size++;		
		return root.add(data, root);	
	}
	
	public int getSize() {
		return size;
	}
	
	public int countNodes(int min, int max) {
		return TreeNode.traverseInOrder(this.root, min , max, 0);		
	}
	
	public int countNodesValues() {
		return TreeNode.traversePreOrder(this.root,0);		
	}


	public ArrayList<Integer> getDataTraveredInOrder(int size) {
		// TODO Auto-generated method stub
		return TreeNode.traverseInOrderArray(this.root, new ArrayList<Integer>(size));
		}

}
