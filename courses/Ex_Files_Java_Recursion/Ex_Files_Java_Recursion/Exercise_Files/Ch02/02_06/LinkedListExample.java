/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistexample;

/**
 *
 * @author Producer
 */

public class LinkedListExample {

    static Node head;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node node1 = new Node("Jeep Wrangler", null);
        Node node2 = new Node("Ford F150", null);
        Node node3 = new Node("Nissan Sentra", null);
        node1.next = node2;
        node2.next = node3;
        node3.next = null;
        printList(node1);
       
    }
    private static void printList(Node n)
    {
        if(n != null)
        {
            printList(n.next);
            System.out.println(n.value + " ");
        }
    }
   
}


