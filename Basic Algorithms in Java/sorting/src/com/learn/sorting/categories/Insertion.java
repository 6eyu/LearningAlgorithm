package com.learn.sorting.categories;

public class Insertion {

    public void sort(Comparable[] a) {
        int num = a.length;

        for(int i = 0; i < num; i++){
            for(int j = i; j > 0 && less(a[j], a[j - 1]); j--){
                exchange(a, j, j - 1);
            }
        }
    }

    private boolean less(Comparable v, Comparable selected) {
        return v.compareTo(selected) < 0;
    }

    private void exchange(Comparable[] a, int i, int selected) {
        Comparable temp = a[i];
        a[i] = a[selected];
        a[selected] = temp;
    }
}
