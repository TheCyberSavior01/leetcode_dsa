package org.limon;

import org.limon.LinkedList.BrowserHistory;
import org.limon.LinkedList.DesignLinkedList;
import org.limon.LinkedList.MergeTwoSotredLinkedList;

public class Main {
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
        browserHistory.visit("google.com");
        browserHistory.visit("facebook.com");
        BrowserHistory.ListNode head = browserHistory.head;
        System.out.println("-----all the nodes------");
        while (head != null) {
            System.out.println(head.homepage);
            head = head.next;
        }
        System.out.println("----moving back-----");
        System.out.println(browserHistory.back(1));
        System.out.println("----visit again----");
        browserHistory.visit("limon.com");
        System.out.println("----moving forward-----");
        System.out.println(browserHistory.forward(1));
        System.out.println("----moving back again----");
        System.out.println(browserHistory.back(1));
        System.out.println("----length--------");
        System.out.println("length: " + browserHistory.length);
    }

}