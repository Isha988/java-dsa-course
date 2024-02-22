/*
    Question 1 :
    Palindrome Linked List
    We have a singly linked list of characters,
    write a function that returns true if the given list is a palindrome, else false.

    Input: A->B->C->B->A
    Output : Yes It is Palindrome
 */
package T23Stacks2;

import java.util.Stack;

public class Q1PalindromeLL {
    static class Node {
        char val;
        Node next;

        Node(char val, Node next){
            this.val = val;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        Node last = new Node('A', null);
        Node n3 = new Node('B', last);
        Node n2 = new Node('C', n3);
        Node n1 = new Node('B', n2);
        Node head = new Node('A', n1);

        System.out.println(isPalindrome(head));
    }

    // O(n)
    static boolean isPalindrome(Node head){
        Stack<Character> stack = new Stack<>();
        Node temp = head;

        // filling stack with linked list
        while(temp != null){
            stack.push(temp.val);
            temp = temp.next;
        }

        // checking for palindrome
        while(head != null){
            if(head.val != stack.pop()){
                return false;
            }
            head = head.next;
        } 

        return true;

    }
}
