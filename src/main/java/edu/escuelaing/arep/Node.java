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
 * 
 */
public class Node {
    double data;
    Node next;

    /**
     *Contructor of the class
     * @param data
     * @param next
     */
    public Node(double data, Node next) {
        this.data = data;
        this.next = next;
    }

    /**
     *
     * @return double
     */
    public double getData() {
        return data;
    }

    /**
     *
     * @param data
     */
    public void setData(double data) {
        this.data = data;
    }

    /**
     *this function return a node
     * @return Node
     */
    public Node getNext() {
        return next;
    }

    /**
     *this function set the value of a node
     * @param next
     */
    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" + "data=" + data + ", next=" + next + '}';
    }
    
    
    
}
