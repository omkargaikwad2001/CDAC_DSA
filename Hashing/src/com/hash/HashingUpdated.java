package com.hash;

import java.util.LinkedList;

public class HashingUpdated {

	private int size;
	private LinkedList<Entry>[] table;

	// Inner class to store key-value pairs
	static class Entry {
		int key;
		String value;

		Entry(int key, String value) {
			this.key = key;
			this.value = value;
		}
	}

	// Constructor
	public HashingUpdated(int size) {
		this.size = size;
		table = new LinkedList[size];

		// Initialize each bucket (linked list)
		for (int i = 0; i < size; i++) {
			table[i] = new LinkedList<>();
		}
	}

	// Simple hash function: key % size
	private int hash(int key) {
		return key % size;
	}

	// PUT method (insert or update)
	public void put(int key, String value) {
		int index = hash(key);
		LinkedList<Entry> bucket = table[index];

		// Check if key already exists → update value
		for (Entry entry : bucket) {
			if (entry.key == key) {
				entry.value = value;
				System.out.println("Updated key " + key + " with new value: " + value);
				return;
			}
		}

		// Otherwise, add new entry
		bucket.add(new Entry(key, value));
		System.out.println("Inserted key " + key + " with value: " + value);
	}

	// GET method (search)
	public String get(int key) {
		int index = hash(key);
		LinkedList<Entry> bucket = table[index];

		for (Entry entry : bucket) {
			if (entry.key == key) {
				return entry.value;
			}
		}

		return null; // Not found
	}

	// Display the hash table contents
	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.print("Slot " + i + ": ");
			for (Entry entry : table[i]) {
				System.out.print("[" + entry.key + " -> " + entry.value + "] ");
			}
			System.out.println();
		}
	}

	// Main method to test
	public static void main(String[] args) {
		HashingUpdated ht = new HashingUpdated(5); // Create hash table of size 5

		ht.put(1, "Apple");
		ht.put(6, "Banana"); // 6 % 5 = 1 → goes to same slot as 1
		ht.put(11, "Cherry"); // 11 % 5 = 1 → goes to same slot again
		ht.put(2, "Mango");

		System.out.println("\nValue for key 6: " + ht.get(6));
		System.out.println("Value for key 11: " + ht.get(11));
		System.out.println("Value for key 99: " + ht.get(99)); // Not found

		System.out.println("\n--- Hash Table Contents ---");
		ht.display();
	}
}
