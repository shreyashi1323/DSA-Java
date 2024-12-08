package interface_collections.java;

import java.util.*;

public class queueInterface {
    static void queueExamples(){
        LinkedList<Integer> q =  new LinkedList<>();
        q.add(1);
        q.offer(9);
        q.add(3);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        System.out.println(q);
    }

    static void PriorityQueue(){
        /*PriorityQueue<Integer> pq = new PriorityQueue<>()*/; //min priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(3);
        pq.add(2);
        pq.add(1);
        System.out.println(pq.peek()); //1 - thw smallest element
        System.out.println(pq); //topmost priority elemnt will be processed first
        System.out.println(pq.poll()); //5
        System.out.println(pq);
        System.out.println(pq.peek()); //7
    }

    static void ArrayDeque(){
        ArrayDeque ad =  new ArrayDeque<>();
        ad.add(100);
        ad.add(200);
        System.out.println(ad);
        ad.addFirst(10);
        ad.addLast(20);
        System.out.println(ad);
        ad.addLast("shreyy"); //can  store homogeneous as well as  heterogeneous typr of data
        System.out.println(ad);
        ad.offer(50);
        ad.offerLast(10);
        ad.offerFirst(1);
        System.out.println(ad);
    }
    public static void dequeExamples(){
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq); //2 1 3 4
        System.out.println(dq.pollFirst()); //2
        System.out.println(dq.pollLast()); //4
        System.out.println(dq); //1 3
    }
    public static void main(String[] args) {
       //queueExamples();
       //PriorityQueue();
        //dequeExamples();
        ArrayDeque();

    }
}
