package com.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphBFSandDFS {

   	private int[][] arr;
    private int nofnodes;
    Scanner sc = new Scanner(System.in);

    public GraphBFSandDFS() {
        System.out.print("Enter number of vertices: ");
        nofnodes = sc.nextInt();
        arr = new int[nofnodes][nofnodes];
    }

    public void createGraph() {
        for (int i = 0; i < nofnodes; i++) {
            System.out.println("\nEnter adjacency for vertex " + (i + 1) + ":");
            for (int j = 0; j < nofnodes; j++) {
                while (true) { // keep asking until valid input
                    System.out.print("\t" + (i + 1) + " -> " + (j + 1) + " (0/1): ");
                    int value = sc.nextInt();
                    if (value == 0 || value == 1) {
                        arr[i][j] = value;
                        break; // exit while loop if valid
                    } else {
                        System.out.println("\tInvalid! Please enter 0 or 1 only.");
                    }
                }
            }
        }
    }

    public void adjacencyMatrix() {
        System.out.println("\nAdjacency Matrix:");
        for (int i = 0; i < nofnodes; i++) {
            for (int j = 0; j < nofnodes; j++) {
                System.out.print("  " + arr[i][j]);
            }
            System.out.println();
        }
    }

    // ---------------- DFS -----------------
    public void DFS() {
        boolean[] visited = new boolean[nofnodes];
        System.out.println("\nDFS Traversal:");
        for (int i = 0; i < nofnodes; i++) {
            if (!visited[i])
                dfsRecursive(i, visited);
        }
    }

    private void dfsRecursive(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print((v + 1) + " ");
        for (int j = 0; j < nofnodes; j++) {
            if (arr[v][j] == 1 && !visited[j]) {
                dfsRecursive(j, visited);
            }
        }
    }

    // ---------------- BFS -----------------
    public void BFS() {
        boolean[] visited = new boolean[nofnodes];
        Queue<Integer> q = new LinkedList<>();

        System.out.println("\nBFS Traversal:");
        for (int i = 0; i < nofnodes; i++) {
            if (!visited[i]) {
                q.add(i);
                visited[i] = true;

                while (!q.isEmpty()) {
                    int v = q.poll();
                    System.out.print((v + 1) + " ");

                    for (int j = 0; j < nofnodes; j++) {
                        if (arr[v][j] == 1 && !visited[j]) {
                            q.add(j);
                            visited[j] = true;
                        }
                    }
                }
            }
        }
    }

    // ---------------- MAIN -----------------
    public static void main(String[] args) {
        GraphBFSandDFS g = new GraphBFSandDFS();
        g.createGraph();
        g.adjacencyMatrix();
        g.DFS();
        g.BFS();
    }
}