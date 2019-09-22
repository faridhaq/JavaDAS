package com.faridhaque;

import java.util.Arrays;

public class QueueReverser {

    private int[] que=new int[5];
    private int count;

    public void enqueue(int item){
        que[count++]=item;

    }

    public int deque(){
        return que[0];

    }
    public void reverse(int k){


    }

    @Override
    public String toString(){
        return Arrays.toString(que);
    }
}