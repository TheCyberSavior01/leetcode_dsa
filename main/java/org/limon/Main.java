package org.limon;

import org.limon.LinkedList.DesignLinkedList;
import org.limon.LinkedList.MergeTwoSotredLinkedList;

public class Main {
    public static void main(String[] args) {
        DesignLinkedList designLinkedList = new DesignLinkedList();
        designLinkedList.addAtHead(1);
        designLinkedList.addAtTail(3);
        designLinkedList.addAtIndex(1, 2);
        //System.out.println(designLinkedList.length);
        System.out.println(designLinkedList.get(1));
        designLinkedList.deleteAtIndex(1);
        System.out.println(designLinkedList.get(1));
        //System.out.println(designLinkedList.get(2));
    }

}