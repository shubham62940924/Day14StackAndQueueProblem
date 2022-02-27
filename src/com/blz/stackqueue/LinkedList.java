/*
		 * @Purpose :  Add Element ,Display Element, Append Element, Calculating size of Linked list
		 * 
		 * @Param :count
		 * 
		 * @Function :Node is a interface
		 * 
		 * @Return :Sysout count to print size
		 */

package com.blz.stackqueue;

import java.util.Scanner;

public class LinkedList {

	Scanner scanner = new Scanner(System.in);

	Node head;

	class Node {
		Object data;
		Node next;

		public Node(Object data) {
			this.data = data;
		}
	}

	// Add Elements
	public void addFirst(Object data) {
		Node newNode = new Node(data);
		if (head == null)
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}

	// Display Elements
	public void display() {
		if (head == null)
			System.out.println("No elements to display");
		else {
			Node temp = head;
			while (temp.next != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}

	// Create Linked List
	public void addLast(Object data) {
		Node newNode = new Node(data);
		if (head == null)
			head = newNode;
		else if (head.next == null)
			head.next = newNode;
		else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public void addMiddle(Object data, Object data1) {
		Node newNode = new Node(data);

		if (head == null)
			head = newNode;
		else {
			Node temp = head;
			while (temp.data != data1) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}

	public void deleteFirst() {
		if (head == null)
			System.out.println("No elements present to delete");
		else
			head = head.next;
	}

	public void deleteLast() {
		if (head == null)
			System.out.println("No elements present to delete");
		else if (head.next == null)
			head = null;
		else {
			Node temp = head;// creating temp object assigning head to it
			while (temp.next.next != null)
				temp = temp.next;
			temp.next = null;
		}
	}

	public void searchElement(Object data) {
		byte flag = 0;
		if (head == null)
			System.out.println("No elements present to search");
		else {
			Node temp = head;
			while (temp != null) {
				if (data.equals(temp.data)) {
					flag = 1;
					System.out.println(data + " is present in linked list");
					break;
				}
				temp = temp.next;
			}
			if (flag == 0)
				System.out.println(data + " is absent in linked list");
		}
	}

	public void deleteElement(Object data) {
		if (head == null)
			System.out.println("Linked list is empty so cant delete");
		else if (head.data == data) {
			head = null;
		} else {
			Node temp = head;
			while (temp.next.data != data) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
	}

	public int getSize() {
		int count = 0;
		if (head == null)
			return count;
		else {
			Node temp = head;
			while (temp != null) {
				count++;
				temp = temp.next;
			}
			System.out.println("Size is " + count);
			return count;
		}
	}

}
