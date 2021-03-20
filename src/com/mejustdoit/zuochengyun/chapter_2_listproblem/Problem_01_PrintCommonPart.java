package com.mejustdoit.zuochengyun.chapter_2_listproblem;

import com.mejustdoit.datastruct.Node;

import static com.mejustdoit.zuochengyun.utils.LinkedListUtil.printLinkedList;

/**
 * 打印两个有序链表的公共部分
 */
public class Problem_01_PrintCommonPart {
    public static void main(String[] args) {
        Node node1 = new Node(2);
        node1.next = new Node(3);
        node1.next.next = new Node(5);
        node1.next.next.next = new Node(6);

        Node node2 = new Node(1);
        node2.next = new Node(2);
        node2.next.next = new Node(5);
        node2.next.next.next = new Node(7);
        node2.next.next.next.next = new Node(8);

        printLinkedList(node1);
        printLinkedList(node2);
        printLinkedList(printCommonPart(node1, node2));
    }

    public static Node printCommonPart(Node head1, Node head2) {
        Node head = new Node(-1);
        Node cur = head;
        while(head1 != null && head2 != null){
            if(head1.value > head2.value){
                head2 = head2.next;
            }else if( head2.value > head1.value){
                head1 = head1.next;
            }else {
                head.next = head1;
                head1 = head1.next;
                head2 = head2.next;
                head = head.next;
                head.next = null;
            }
        }

        return cur.next;
    }
}
