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
public class Node {
    String value; 
    Node next; 

    public Node () { 
        value = ""; 
        next = null; 
    } 

    public Node (String value, Node next) { 
        this.value = value; 
        this.next = next; 
    } 

    public String toString () { 
        return value + ""; 
    } 
} 

