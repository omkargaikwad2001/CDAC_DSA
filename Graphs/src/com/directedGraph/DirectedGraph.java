package com.directedGraph;

import java.util.Scanner;

public class DirectedGraph {

    private int[][] arr;
    private int nofnodes;
    Scanner sc = new Scanner(System.in);

    public DirectedGraph() {
        System.out.print("Enter number of vertices: ");
        nofnodes = sc.nextInt();
        arr = new int[nofnodes][nofnodes];
    }

    // Create Graph
    public void createGraph() {
        System.out.println("\nEnter adjacency (0 or 1) for directed graph:");
        for (int i = 0; i < nofnodes; i++) {
            for (int j = 0; j < nofnodes; j++) {
                while (true) {
                    System.out.print("Edge from " + (i + 1) + " to " + (j + 1) + ": ");
                    int val = sc.nextInt();
                    if (val == 0 || val == 1) {
                        arr[i][j] = val;
                        break;
                    } else {
                        System.out.println("Invalid! Enter only 0 or 1.");
                    }
                }
            }
        }
    }

    // Display Adjacency Matrix
    public void displayMatrix() {
        System.out.println("\nAdjacency Matrix:");
        for (int i = 0; i < nofnodes; i++) {
            for (int j = 0; j < nofnodes; j++) {
                System.out.print("  " + arr[i][j]);
            }
            System.out.println();
        }
    }

    // Find Indegree of all vertices
    public void findIndegree() {
        System.out.println("\nIndegree of each vertex:");
        for (int j = 0; j < nofnodes; j++) {
            int indegree = 0;
            for (int i = 0; i < nofnodes; i++) {
                indegree += arr[i][j];  // column sum
            }
            System.out.println("Vertex " + (j + 1) + " → Indegree = " + indegree);
        }
    }

    // Find Outdegree of all vertices
    public void findOutdegree() {
        System.out.println("\nOutdegree of each vertex:");
        for (int i = 0; i < nofnodes; i++) {
            int outdegree = 0;
            for (int j = 0; j < nofnodes; j++) {
                outdegree += arr[i][j];  // row sum
            }
            System.out.println("Vertex " + (i + 1) + " → Outdegree = " + outdegree);
        }
    }

    public static void main(String[] args) {
        DirectedGraph g = new DirectedGraph();
        g.createGraph();
        g.displayMatrix();
        g.findIndegree();
        g.findOutdegree();
    }
}
