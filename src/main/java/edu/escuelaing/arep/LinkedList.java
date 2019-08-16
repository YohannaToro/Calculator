/*
 * Copyright (C) 2019 YohannaToro
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.escuelaing.arep;

/**
 *
 * @author YohannaToro
 */
public class LinkedList {
    Node head;

    /**
     *G¡this function return head of linked list
     * @return Node
     */
    public Node getHead() {
        return head;
    }

    /**
     *this function set head of linkedList
     * @param head
     */
    public void setHead(Node head) {
        this.head = head;
    }

    /**
     *this function return the size of linked List
     * @return int
     */
    public int getSize(){
        int count = 0;  
        Node current = head; 
        while (current != null)  
        {  
            count++;  
            current = current.next;  
        }  
        return count; 
    }

    /**
     *this function return value of a node in that position
     * @param index
     * @return diuble
     */
    public double get(int index) 
    { 
        Node current = head; 
        int count = 0; 
        while (current != null) { 
            if (count == index) 
                return current.data; 
                count++; 
            current = current.next; 
        } 
        assert(false); 
        return 0; 
    }
    
    /**
     *Insert a Node into the linked List
     * @param data
     */
    public  void insert(double data){
        Node node= new Node(data,null);        
        if (head==null){
        head=node;
        }else{
            Node n=head;
            while (n.next!=null) {
                n=n.next;
            }
            n.next=node;
        }
    }


    /**
     *
     */
    public void show(){
        Node node=head;
        while (node.next!=null) {
            System.out.println(node.data);
            node=node.next;
            
        }
        System.out.println(node.data);
    }

    /**
     this function delete a node in the linked list
     * @param index
     */
    public void deleteAt(int index){
        if (index==0){
            head=head.next;
        }else{
            Node n=head;
            Node n1=null;
             for (int i =0; i<index-1;i++){
                n=n.next;
             }n1=n.next;
             n.next=n1.next;
             n1=null;
        }
    }

    @Override
    public String toString() {
        return "LinkedList{" + "head=" + head + '}';
    }
    
}
