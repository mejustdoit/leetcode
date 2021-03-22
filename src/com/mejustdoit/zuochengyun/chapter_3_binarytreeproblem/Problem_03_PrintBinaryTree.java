package com.mejustdoit.zuochengyun.chapter_3_binarytreeproblem;

import com.mejustdoit.datastruct.TreeNode;

public class Problem_03_PrintBinaryTree {
    public static void main(String[] args) {
        TreeNode head = new TreeNode(5);
        head.left = new TreeNode(3);
        head.right = new TreeNode(8);
        head.left.left = new TreeNode(2);
        head.left.right = new TreeNode(4);
        head.left.left.left = new TreeNode(1);
        head.right.left = new TreeNode(7);
        head.right.left.left = new TreeNode(6);
        head.right.right = new TreeNode(10);
        head.right.right.left = new TreeNode(9);
        head.right.right.right = new TreeNode(11);

        // recursive
        System.out.println("==============recursive==============");
        System.out.print("pre-order: ");
        preOrderRecur(head);
        System.out.println();
        System.out.print("in-order: ");
        inOrderRecur(head);
        System.out.println();
        System.out.print("pos-order: ");
        posOrderRecur(head);
        System.out.println();

        // unrecursive
        System.out.println("============unrecursive=============");
//        preOrderUnRecur(head);
//        inOrderUnRecur(head);
//        posOrderUnRecur1(head);
//        posOrderUnRecur2(head);

    }
    public static void preOrderRecur(TreeNode head){
        if(head == null){
            return ;
        }
        System.out.println(head.value + " ");
        if(head.left != null){
            preOrderRecur(head.left);
        }
        if(head.right != null){
            preOrderRecur(head.right);
        }
    }

    public static void inOrderRecur(TreeNode head){
        if(head == null){
            return ;
        }
        if(head.left != null){
            inOrderRecur(head.left);
        }
        System.out.println(head.value  + " ");

        if(head.right != null){
            inOrderRecur(head.right);
        }

    }


    public static void posOrderRecur(TreeNode head){
        if(head == null){
            return ;
        }
        if(head.left != null){
            posOrderRecur(head.left);
        }

        if(head.right != null){
            posOrderRecur(head.right);
        }

        System.out.println(head.value  + " ");
    }
}
