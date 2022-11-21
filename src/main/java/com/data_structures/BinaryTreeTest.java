package com.data_structures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeTest {

    private TreeNode root;

    private static class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    private void createBinaryTree() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);

        root = t1;
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.right = t6;
    }

    public void inOrderWithoutRecursion() {
        Stack<TreeNode> nodes = new Stack<>();
        TreeNode current = root;
        while (!nodes.isEmpty() || current != null) {
            if (current != null) {
                nodes.push(current);
                current = current.left;
            } else {
                TreeNode node = nodes.pop();
                System.out.printf("%s ", node.data);
                current = node.right;
            }
        }
    }

    public void RecursivePreOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        RecursivePreOrder(root.left);
        RecursivePreOrder(root.right);
    }

    public void RecursiveInOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        RecursivePreOrder(root.left);
        System.out.print(root.data + " ");
        RecursivePreOrder(root.right);
    }

    public void RecursivePostOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        RecursivePreOrder(root.left);
        RecursivePreOrder(root.right);
        System.out.print(root.data + " ");

    }

    public void IterativePreOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");

            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    public void IterativeInOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;

        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    public void IterativePostOrder(TreeNode root) {
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                TreeNode temp = stack.peek().right;
                if (temp == null) {
                    temp = stack.pop();
                    System.out.print(temp.data + " ");
                    while (!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        System.out.print(temp.data + " ");
                    }
                } else {
                    current = temp;
                }
            }

        }
    }

    public void LevelOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");

            if (temp.left != null)
                queue.offer(temp.left);
            if (temp.right != null)
                queue.offer(temp.right);
        }
    }


    public static void main(String[] args) {
        BinaryTreeTest bt = new BinaryTreeTest();

        bt.createBinaryTree();
//        bt.inOrderWithoutRecursion();
//        System.out.println("");
//        bt.RecursivePreOrder(bt.root);
        System.out.println("");
        bt.IterativePreOrder(bt.root);

        System.out.println("");
        bt.RecursiveInOrder(bt.root);

        System.out.println("");
        bt.IterativeInOrder(bt.root);

        System.out.println("");
        bt.RecursivePostOrder(bt.root);

        System.out.println("");
        bt.IterativePostOrder(bt.root);

        System.out.println("");
        bt.LevelOrderTraversal(bt.root);
    }
}
