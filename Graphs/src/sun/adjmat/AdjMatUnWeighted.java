package sun.adjmat;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class AdjMatUnWeighted {

	private int vertCount;
	private int edgeCount;
	private int adjmat[][];

	public AdjMatUnWeighted(int vertCount) {

		edgeCount = 0;
		this.vertCount = vertCount;
		adjmat = new int[this.vertCount][this.vertCount];

	}

	public void accept(Scanner sc) {
		System.out.print("Enter number of edges: ");
		edgeCount = sc.nextInt();

		for (int i = 0; i < edgeCount; i++) {
			System.out.println("Enter edge (src dest): ");
			int src = sc.nextInt();
			int dest = sc.nextInt();
			adjmat[src][dest] = 1;
			adjmat[dest][src] = 1; // for dircted graph delete this line
		}
	}

	public void display() {
		for (int i = 0; i < vertCount; i++) {
			for (int j = 0; j < vertCount; j++) {
				System.out.print(adjmat[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void bfsTrav(int start) {

		System.out.println("BFS: ");
		boolean[] marked = new boolean[vertCount];
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(start);
		marked[start] = true;

		while (!q.isEmpty()) {
			int trav = q.poll();
			System.out.print(trav + ", ");
			for (int dest = 0; dest < vertCount; dest++) {
				if (adjmat[trav][dest] != 0 && !marked[dest]) {
					q.offer(dest);
					marked[dest] = true;
				}
			}
		}
		System.out.println();

	}

	public void dfsTrav(int start) {

		System.out.println("DFS: ");
		boolean[] marked = new boolean[vertCount];
		Stack<Integer> s = new Stack<Integer>();
		s.push(start);
		marked[start] = true;

		while (!s.isEmpty()) {
			int trav = s.pop();
			System.out.print(trav + ", ");
			for (int dest = 0; dest < vertCount; dest++) {
				if (adjmat[trav][dest] != 0 && !marked[dest]) {
					s.push(dest);
					marked[dest] = true;
				}
			}
		}
		System.out.println();

	}
	
	public boolean isConnected() {

		int start = 0;
		int count = 0;
		
		boolean[] marked = new boolean[vertCount];
		Stack<Integer> s = new Stack<Integer>();
		s.push(start);
		marked[start] = true;
		count++;
		while (!s.isEmpty()) {
			int trav = s.pop();
			for (int dest = 0; dest < vertCount; dest++) {
				if (adjmat[trav][dest] != 0 && !marked[dest]) {
					s.push(dest);
					marked[dest] = true;
					count++;
					if(count==vertCount) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public void dfsSpanningTree(int root) {

		System.out.println("DFS: ");
		boolean[] marked = new boolean[vertCount];
		Stack<Integer> s = new Stack<Integer>();
		s.push(root);
		marked[root] = true;

		while (!s.isEmpty()) {
			int trav = s.pop();

			for (int dest = 0; dest < vertCount; dest++) {
				if (adjmat[trav][dest] != 0 && !marked[dest]) {
					s.push(dest);
					marked[dest] = true;
					System.out.println(trav + " -> "+ dest);
				}
			}
		}
		System.out.println();

	}
	
	public int[] singleSourceShortstPath(int start) {

		System.out.println("BFS Shortest path: ");
		int [] dist = new int[vertCount];
		boolean[] marked = new boolean[vertCount];
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(start);
		marked[start] = true;
		dist[start] = 0;

		while (!q.isEmpty()) {
			int trav = q.poll();
//			System.out.print(trav + ", ");
			for (int dest = 0; dest < vertCount; dest++) {
				if (adjmat[trav][dest] != 0 && !marked[dest]) {
					q.offer(dest);
					marked[dest] = true;
					dist[dest] = dist[trav]+1;
				}
			}
		}
		
		return dist;
		
	}



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of vertices ");
		int vertCount = sc.nextInt();

		AdjMatUnWeighted mat = new AdjMatUnWeighted(vertCount);
		mat.accept(sc);
		mat.display();

		mat.bfsTrav(0);
		mat.dfsTrav(0);
		
		System.out.println(mat.isConnected());
		
		mat.dfsSpanningTree(0);
		
		int start = 0;
		int dist[] = mat.singleSourceShortstPath(start);
		
		for(int i=0;i<vertCount;i++) {
			System.out.println("Distance of vertex "+i+" from vertex "+start+" = "+dist[i]);
		}

		sc.close();
	}

}
