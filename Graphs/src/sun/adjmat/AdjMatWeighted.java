package sun.adjmat;

import java.util.Scanner;

public class AdjMatWeighted {
	
	public static final int INF = 999; //Integer.MAX_VALUE; 
	private int vertCount;
	private int edgeCount;
	private int adjmat[][];

	public AdjMatWeighted(int vertCount) {

		edgeCount = 0;
		this.vertCount = vertCount;
		adjmat = new int[this.vertCount][this.vertCount];
		
		for(int i=0;i<vertCount;i++) {
			for(int j=0;j<vertCount;j++) {
				adjmat[i][j]=INF;
			}
		}
	}

	public void accept(Scanner sc) {
		System.out.print("Enter number of edges: ");
		edgeCount = sc.nextInt();

		for (int i = 0; i < edgeCount; i++) {
			System.out.println("Enter edge (src dest wt): ");
			int src = sc.nextInt();
			int dest = sc.nextInt();
			int wt = sc.nextInt();
			adjmat[src][dest] = wt;
			adjmat[dest][src] = wt;	//for dircted graph delete this line
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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of vertices ");
		int vertCount = sc.nextInt();

		AdjMatWeighted mat = new AdjMatWeighted(vertCount);
		mat.accept(sc);
		mat.display();

		sc.close();
	}

}
