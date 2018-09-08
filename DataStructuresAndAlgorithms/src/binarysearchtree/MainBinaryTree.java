package binarysearchtree;

public class MainBinaryTree {
	//Every Item in the tree is a node
	//The Node at the top of the tree is the root
	//Every non-root node has one and only parent
	//A leaf node has no children
	//A singleton tree has only one node- the root
	//root
	//edge
	//leaf
	//depth
	//height
	//level
	//ansestors 
	
	//BINARY TREE
	//very node has 0, 1 or 2 children
	//Children are refered to as left side and right side.
	//In practice we use binary search tree.
	//Complete tree
	//         15
	//     22              4
	//19        20    18
	//
	//full Binary tree (this is also complete tree)
	//         15
	//     22              4
	//19        20    18      3
	//
	//BInary search tree (BST)
	//Can perform insertion, deletion and retrieval is O(logN)
	//The left child always has a smaller value than its parent
	//The right child always has a larger value than its parent.
	//This means everything to the left of the rootis less than the value
	//value of the root, and every thing to right of the root is greater than the
	//root
	//Because of that, we can do a Binary search.
	//How do duplicates work in Binary search tree.
	
	//TRAVERSAL
	//Level- Visit nodes on each level.
	//Pre-order - Visit the root of every subtree first.
	//Post-order - Visit the root of every subtree last.
	//In-Order - Visit left Child, then root, then the right child.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree intTree = new Tree();
		intTree.insert(25);
		intTree.insert(20);
		intTree.insert(15);
		intTree.insert(27);
		intTree.insert(30);
		intTree.insert(29);
		intTree.insert(26);
		intTree.insert(22);
		intTree.insert(32);
	}

}
