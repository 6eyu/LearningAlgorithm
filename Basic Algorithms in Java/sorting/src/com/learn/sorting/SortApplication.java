package com.learn.sorting;

import com.learn.sorting.categories.Shell;

public class SortApplication {
    public static void main(String[] args) {

        Shell shell = new Shell();

        String[] a = {"B","G","H","D","A","K","C","I","J","E","F"};

        shell.sort(a);

        for(String s : a) {
            System.out.print(s);
        }

    }
}

