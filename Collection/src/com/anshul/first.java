package com.anshul;

import java.util.LinkedList;
public class first {
    public static void main(String args[]){

        LinkedList l1=new LinkedList();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.addFirst(5);
        l1.addLast(1000);

        System.out.println(l1);
        l1.add(2,120);
        System.out.println(l1);



    }
}
