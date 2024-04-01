package com.BJSHUB;

import java.util.ArrayList;
import java.util.LinkedList;

public class B {
    public static void main(String[] args) {

        ArrayList a1 =new ArrayList();
        a1.add(10);
        a1.add(10.5f);
        a1.add("anshul");
        a1.add(true);
        System.out.println(a1);

        //

//        ArrayList <Integer> a1 =new ArrayList(); //Only int
//        a1.add(10);
//        a1.add(10.5f);
//        a1.add("anshul");
//        a1.add('a');
//        a1.add(true);
        System.out.println(a1);

        //
//        ArrayList <Character> a1 =new ArrayList(); //Only char wrapper class
//        a1.add(10);
//        a1.add(10.5f);
//        a1.add("anshul");
//        a1.add('a');
//        a1.add(true);
        System.out.println(a1);




        // Linkedlist


        LinkedList l=new LinkedList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.addFirst(5);
        l.addLast(60);
        System.out.println(l);

        l.add(2,15);
        System.out.println(l);

        System.out.println(l.element()+"element");
        System.out.println(l);
        System.out.println(l.peek() +"peek");
        System.out.println(l);

        System.out.println(l.poll()+"poll");
        System.out.println(l);


        System.out.println(l.peekFirst()+" "+ l.peekLast());
        System.out.println(l);


        System.out.println(l.pollFirst()+" "+l.pollLast());
        System.out.println(l);

        System.out.println(l.get(1));

        LinkedList l2=new LinkedList();

        l2.push(10);
        l2.push(11);
        l2.push(12);
        l2.push(13);
        l2.push(14);
        System.out.println(l2);

        System.out.println(l2.pop());
        System.out.println(l2.pop());

        System.out.println(l2);

        //arrayDeque  first or last mai bus cahnge kr skte hai
    }
}
