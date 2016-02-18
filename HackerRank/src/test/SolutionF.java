package test;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;

public class SolutionF {

	class BinaryTree{
		class Node<T>{
			public Node<T> left;
			public Node<T> right;
			public String data;
		}
	}
	public static void bfs(BinaryTree.Node<Integer> root) {
		
		BigInteger bi = new BigInteger("123");
		BinaryTree.Node<Integer> temp; // a binary tree with a inner generic
										// node class
		Queue<BinaryTree.Node<Integer>> queue = new LinkedList<>(); 
		if (root == null) {
			return;
		}
		queue.add(root);
		while (!queue.isEmpty()) {
			temp = queue.poll(); // remove the node from the queue
			// process current node
			System.out.println(temp.data);
			// process the left child first
			if (temp.left != null) {
				queue.add(temp.left);
			}
			// process the right child after the left if not null
			if (temp.right != null) {
				queue.add(temp.right);
			}
		}
	}

}
