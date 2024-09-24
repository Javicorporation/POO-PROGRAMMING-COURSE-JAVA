package com.listorarraylist.test;

import com.listorarraylist.base.UsoArrayList;
import com.listorarraylist.base.UsoList;

public class Test {
    public static void main(String[] args) {

        UsoArrayList arraylist = new UsoArrayList();
        UsoList list = new UsoList();

        System.out.println("arraylist");
        arraylist.usoDeArrayList();
        System.out.println();
        System.out.println("list");
        list.usoDeArrayList();

    }
}
