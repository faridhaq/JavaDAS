package com.faridhaque;

import java.util.Arrays;

public class PriorityQueue {
    private int[] PQ=new int[5];
    private int count;
    public void insert(int item){

        if (count==0){
            PQ[0]=item;
            count++;
        }

        else if (count==PQ.length){
            System.out.println("Priority Queue is full");
        }

        else if (count==1) {
            if (item > PQ[0]){
                PQ[1] = item;
                count++;
        }
            else{
                PQ[1]=PQ[0];
                PQ[0]=item;
                count++;
            }
        }

        else if(count>1){
            int i=count-1;
            if(item>PQ[i]){
                PQ[count]=item;
            count++;
            }
            else{



            while(item<PQ[i]) {
                PQ[i + 1] = PQ[i];
            i--;
            }
                PQ[i+1]=item;
                count++;
            }}
        }




    public void printQ(){
        System.out.println(Arrays.toString(PQ));
        System.out.println(count);
    }


}
