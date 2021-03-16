package com.mejustdoit.basic;

import com.mejustdoit.datastruct.Node;

import static com.mejustdoit.zuochengyun.utils.LinkedListUtil.printLinkedList;

public class GetMidNodeList {
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(6);
        head1.next.next.next.next.next.next = new Node(7);
        printLinkedList(head1);
        System.out.println(getMidNodeList(head1).value);
        System.out.println(getMidsNodeList(head1).value);

    }

    /**
     * 获取中间节点
     * @param head
     * @return
     */
    public static Node getMidNodeList(Node head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }
        Node low = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            low = low.next;
            fast = fast.next.next;
        }
        return low;
    }

    /**
     * 获取中间偏后节点
     * @param head
     * @return
     */
    public static Node getMidsNodeList(Node head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }
        Node low = head.next;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            low = low.next;
            fast = fast.next.next;
        }
        return low;
    }
}
