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

        if(isLeaf(root))
            return 0;
        return 1 + Math.max(height(root.leftChild),height(root.rightChild));
    }



public int min(){
        return min(root);
}

    private int min(Node root){
        if(isLeaf(root))
            return root.value;

        var left=min(root.leftChild);
        var right=min(root.rightChild);

        return Math.min(Math.min(left,right),root.value);

    }



    private boolean isLeaf(Node node){
        return node.leftChild==null && node.rightChild==null;
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
