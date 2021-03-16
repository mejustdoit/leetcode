package com.mejustdoit.basic;

import com.mejustdoit.datastruct.DoubleNode;
import com.mejustdoit.datastruct.Node;

import static com.mejustdoit.zuochengyun.utils.LinkedListUtil.printDoubleLinkedList;
import static com.mejustdoit.zuochengyun.utils.LinkedListUtil.printLinkedList;

public class ReversNodeList {
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        printLinkedList(head1);
        head1 = reverseList(head1);
        printLinkedList(head1);

        DoubleNode head2 = new DoubleNode(1);
        head2.next = new DoubleNode(2);
        head2.next.last = head2;
        head2.next.next = new DoubleNode(3);
        head2.next.next.last = head2.next;
        head2.next.next.next = new DoubleNode(4);
        head2.next.next.next.last = head2.next.next;
        printDoubleLinkedList(head2);
        printDoubleLinkedList(reverseDoubleList(head2));

    }

    /**
     * 反转单链表
     * @param head
     * @return
     */

    public static Node reverseList(Node head){
        Node pre = null;
        Node cur = head;
        Node next = null;
        while(cur != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    /**
     * 反转双链表
     * @param head
     * @return
     */
    public static DoubleNode reverseDoubleList(DoubleNode head){
        DoubleNode pre = null;
        DoubleNode cur = head;
        DoubleNode next = null;
        while (cur != null){
           next = cur.next;
           cur.next = pre;
           cur.last = next;
           pre = cur;
           cur = next;
        }
        return pre;
    }

}
