package com.learn.sorting.categories;

public class Quick {
    public void sort(Comparable[] a) {

    }

    private void quick() {

    }

    private int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        Comparable v = a[lo];
        while(true) {
            while(less(a[++i], v)) if(i == hi) break;
            while(less(v, a[--j])) if(j == lo) break;
            if(i >= j) break;
            exchange(a, i, j);
        }
        exchange(a, lo, j);
        return j;
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
