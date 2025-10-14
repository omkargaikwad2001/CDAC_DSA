package com.MergeSortedLL;

import java.util.LinkedList;

public class MergeLL {

    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<Integer>();
        l1.add(1);
        l1.add(3);
        l1.add(5);
        l1.add(7);
        l1.add(9);

        System.out.println("First LL: " + l1);

        LinkedList<Integer> l2 = new LinkedList<Integer>();
        l2.add(2);
        l2.add(4);
        l2.add(6);
        l2.add(8);
        l2.add(10);

        System.out.println("Second LL: " + l2);

        // merge both lists
        LinkedList<Integer> l3 = mergeSortedLists(l1, l2);

        System.out.println("Merged LL: " + l3);
    }

    // Function to merge two sorted LinkedLists
    public static LinkedList<Integer> mergeSortedLists(LinkedList<Integer> l1, LinkedList<Integer> l2) {

        LinkedList<Integer> merged = new LinkedList<Integer>();

        int i = 0, j = 0;

        // merge like merge sort
        while (i < l1.size() && j < l2.size()) {
            if (l1.get(i) < l2.get(j)) {
                merged.add(l1.get(i));
                i++;
            } else {
                merged.add(l2.get(j));
                j++;
            }
        }

        // add remaining elements
        while (i < l1.size()) {
            merged.add(l1.get(i));
            i++;
        }

        while (j < l2.size()) {
            merged.add(l2.get(j));
            j++;
        }

        return merged;
    }
}
