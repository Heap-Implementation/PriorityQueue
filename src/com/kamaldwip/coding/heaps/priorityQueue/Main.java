package com.kamaldwip.coding.heaps.priorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        pQueue.add(25);
        pQueue.add(-22);
        pQueue.add(1343);
        pQueue.add(54);
        pQueue.add(0);
        pQueue.add(-3492);
        pQueue.add(429);

        Iterator iterator = pQueue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println(pQueue.peek());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.peek());
        System.out.println(pQueue.remove());
        System.out.println(pQueue.peek());
        pQueue.add(-39);
        System.out.println(pQueue.peek());
        Object[] nums = pQueue.toArray();
        for(Object element : nums){
            System.out.println(element);
        }



    }
}
