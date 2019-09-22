package com.faridhaque;

import java.util.Arrays;

public class Tree {
    private class Node{

        public Node(int value) {
            this.value = value;
        }
        @Override
        public String toString(){
            return "Node = "+ value;
        }
        private int value;
        private Node leftChild;
        private Node rightChild;
        }

    private Node root;

    public void insert(int value){
        var node=new Node(value);
        if (root==null) {
            root = node;
            return;
        }
        var current=root;
        while (true){
            if (value<current.value) {
                if(current.leftChild==null){
                    current.leftChild=node;
                    break;
                }
                current = current.leftChild;
            }
            else{
                if(current.rightChild==null){
                    current.rightChild=node;
                    break;
                }
                current=current.rightChild;

            }
        }

    }

    public void traversalPreOrder(){
        traversalPreOrder(root);
    }

    public void traversalInOrder(){
        traversalInOrder(root);
    }

    private void traversalInOrder(Node root){
        if(root==null)
            return;
        traversalInOrder(root.leftChild);
        System.out.println(root.value);
        traversalInOrder(root.rightChild);
    }


    private void traversalPreOrder(Node root){
        if (root==null)
            return;
        System.out.println(root.value);
        traversalPreOrder(root.leftChild);
        traversalPreOrder(root.rightChild);
    }

public int height(){
        return height(root);
}
    private int height(Node root){
        if(root==null)
            return -1;

        if(root.leftChild==null && root.rightChild==null)
            return 0;
        return 1 + Math.max(height(root.leftChild),height(root.rightChild));
    }

    public boolean find(int value){
        var current=root;
        while(current!=null) {

            if (value < current.value)
                current = current.leftChild;
            else if (value > current.value)
                current = current.rightChild;
            else
                return true;
        }
        return false;
    }


}
