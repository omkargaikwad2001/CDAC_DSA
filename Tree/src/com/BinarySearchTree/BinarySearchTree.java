package com.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {

	private Node root;

	public BinarySearchTree() {
		root = null;
	}

	// create node
	public Node createNewNode(int data) {
		Node newNode = new Node();
		newNode.setData(data);
		return newNode;
	}

	// get root
	public Node getRoot() {
		if (root != null) {
			return root;
		}
		System.out.println("Tree is empty...");
		return null;
	}

	// add
	public void add(int data) {

		Node newNode = createNewNode(data);

		Node temp = root;

		if (root == null) {
			root = newNode;
		} else {

			while (true) {

				if (newNode.getData() < temp.getData()) {

					if (temp.getLeft() == null) {
						temp.setLeft(newNode);
						System.out.println("\tNode added to left of " + temp.getData());
						break;
					} else {
						temp = temp.getLeft();
						continue;
					}

				} else if (newNode.getData() > temp.getData()) {

					if (temp.getRight() == null) {
						temp.setRight(newNode);
						System.out.println("\tNode added to right of " + temp.getData());
						break;
					} else {
						temp = temp.getRight();
						continue;
					}

				} else {

					System.out.println("Duplicate data not allowed...");

				}

			}
		}
	}

	// preorder
	public void pre_order(Node temp) {

		if (temp != null) {
			System.out.print(temp.getData() + " ");
			pre_order(temp.getLeft());
			pre_order(temp.getRight());
		}

	}

	// inorder
	public void in_order(Node temp) {

		if (temp != null) {
			in_order(temp.getLeft());
			System.out.print(temp.getData() + " ");
			in_order(temp.getRight());
		}

	}

	// postorder
	public void post_order(Node temp) {

		if (temp != null) {
			post_order(temp.getLeft());
			post_order(temp.getRight());
			System.out.print(temp.getData() + " ");
		}

	}

	public int height(Node temp) {

		if (temp == null) {
			return -1;
		}

		int hl = height(temp.getLeft());
		int hr = height(temp.getRight());
		int max = hl > hr ? hl : hr;
		return max + 1;

	}

	public int height() {
		return height(root);
	}

	public void degreeOfNode(Node temp) {

		if (temp == null) {
			return;
		}

		int degree = 0;

		if (temp.getLeft() != null)
			degree++;
		if (temp.getRight() != null)
			degree++;

		System.out.println("Node " + temp.getData() + " degree count = " + degree);

		degreeOfNode(temp.getLeft());
		degreeOfNode(temp.getRight());
	}

	public void deleteAll(Node temp) {
		if (temp == null) {
			return;
		}

		deleteAll(temp.getLeft());
		deleteAll(temp.getRight());
		temp.setLeft(null);
		temp.setRight(null);
		temp = null;

	}

	public void deleteAll() {
		deleteAll(root);
		root = null;
	}

	// BFS

	public Node BFS(int key) {

		Queue<Node> q = new LinkedList<Node>();

		q.offer(root);
		while (!q.isEmpty()) {

			Node temp = q.poll();

			if (temp.getData() == key) {
				return temp;
			}
			if (temp.getLeft() != null) {
				q.offer(temp.getLeft());
			}
			if (temp.getRight() != null) {
				q.offer(temp.getRight());
			}
		}

		return null;
	}

	// DFS

	public Node DFS(int key) {

		Stack<Node> s = new Stack<Node>();

		s.push(root);

		while (!s.isEmpty()) {

			Node trav = s.pop();

			if (key == trav.getData()) {
				return trav;
			}
			if (trav.getRight() != null) {
				s.push(trav.getRight());
			}
			if (trav.getLeft() != null) {
				s.push(trav.getLeft());
			}
		}

		return null;
	}

	public Node binarySearch(int key) {

		Node trav = root;

		while (trav != null) {
			if (key == trav.getData()) {
				return trav;
			}

			if (key < trav.getData()) {
				trav = trav.getLeft();
			} else {
				trav = trav.getRight();
			}
		}

		return null;
	}

	public Node[] binarySearchWithParent(int key) {

		Node parent = null;
		Node trav = root;

		while (trav != null) {
			if (key == trav.getData()) {
				return new Node[] { trav, parent };
			}

			parent = trav;

			if (key < trav.getData()) {
				trav = trav.getLeft();
			} else {
				trav = trav.getRight();
			}
		}

		return new Node[] { null, null };
	}

	// delete node
	public void delete(int val) {

		Node trav, parent;

		// find the node to be deleted along with its parent
		Node[] arr = binarySearchWithParent(val);
		trav = arr[0];
		parent = arr[1];

		// if node is not found throw exception
		if (trav == null) {
			throw new RuntimeException("Node not found");
		}

		// if node has left and right child
		if (trav.getLeft() != null && trav.getRight() != null) {

			// find successer with parent
			parent = trav;
			Node succ = trav.getRight();
			while (succ.getLeft() != null) {
				parent = succ;
				succ = succ.getLeft();
			}

			// overwrite the data of node with successer data
			trav.setData(succ.getData());

			// mark successor node to be deleted
			trav = succ;

		}

		// if node has right child (or node doesnt have left child)
		if (trav.getLeft() == null) {
			if (trav == root) {
				root = trav.getRight();
			} else if (trav == parent.getLeft()) {
				parent.setLeft(trav.getRight());
			} else {
				parent.setRight(trav.getRight());
			}
		}

		// if node has left child (or node doesnt have right child)
		else if (trav.getRight() == null) {
			if (trav == root) {
				root = trav.getLeft();
			} else if (trav == parent.getLeft()) {
				parent.setLeft(trav.getLeft());
			} else {
				parent.setRight(trav.getLeft());
			}
		}
	}

}
