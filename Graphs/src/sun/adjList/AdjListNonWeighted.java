package sun.adjList;

import java.util.LinkedList;
import java.util.Scanner;


public class AdjListNonWeighted {

	private int vertCount, edgeCount;
	private LinkedList<Integer>[] adjlist;

	public AdjListNonWeighted(int vertexCount) {

		vertCount = vertexCount;
		edgeCount = 0;
			
		adjlist = new LinkedList[vertCount];
		
		for (int i = 0; i < vertexCount; i++) {
			adjlist[i] = new LinkedList<Integer>();
		}

	}

	public void accept(Scanner sc) {
		System.out.print("Enter number of edges: ");
		edgeCount = sc.nextInt();

		for (int i = 0; i < edgeCount; i++) {
			System.out.println("Enter edge (src dest): ");
			int src = sc.nextInt();
			int dest = sc.nextInt();
			adjlist[src].add(dest);
			adjlist[dest].add(src); // for dircted graph delete this line
		}
	}

	public void display() {

		for (int v = 0; v < vertCount; v++) {
			System.out.print("Vert " + v + " : ");
			for (int dest : adjlist[v]) {
				System.out.print(dest + " -> ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of vertices ");
		int vertCount = sc.nextInt();

		AdjListNonWeighted mat = new AdjListNonWeighted(vertCount);
		mat.accept(sc);
		mat.display();

		sc.close();

	}

}
