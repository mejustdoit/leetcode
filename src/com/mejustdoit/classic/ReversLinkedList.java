package com.mejustdoit.classic;

import com.mejustdoit.datastruct.Node;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * 知识点：
 * 1. RandomAccess 随机访问接口
 * 2. Collections针对不同数量级别的反转对应不同算法。
 * 3. 添加变量去承接原生的引用传递，可以更好地捕捉异常
 * 4. ListIterator实现，其中这些非线程安全实现fail_fast方式
 * 5. 工业化实现链表反转
 *
 *
 *
 */
public class ReversLinkedList {

    public static Node reversWithHeadInsert(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node dummy = new Node(-1);
        Node cur = head;
        while(head != null){
            Node tmp = head.next;
            head.next = dummy.next;
            dummy.next = head;
            head = tmp;
        }
        return dummy.next;
    }


    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        Collections.reverse(list);
        System.out.println(list);

        Node list_node1 = new Node(1);
        Node list_node2 = new Node(2);
        Node list_node3 = new Node(3);
        Node list_node4 = new Node(4);
        list_node1.next = list_node2;
        list_node2.next = list_node3;
        list_node3.next = list_node4;
        prinList(list_node1);

        System.out.println("----------------------------------反转后----------------------------------");
        Node head = reversWithHeadInsert(list_node1);
        prinList(head);

    }

    public static void prinList(Node head){
        System.out.print("[ ");
        while(head != null){
            System.out.print(head.value + ", ");
            head = head.next;
        }
        System.out.println("]");
    }
}
