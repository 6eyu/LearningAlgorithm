package com.learn.sorting.categories;

public class Merge {

    private Comparable[] aux;


    public void topDownSort(Comparable[] a) {
        aux = new Comparable[a.length];

    }

    private void topDown() {

    }



    private void merge(Comparable[] a, int lo, int mid, int hi) {

        int i = lo;
        int j = mid + 1;

        for(int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        for(int k = lo; k <= hi; k++) {
            if      (i > mid)               a[k] = aux[j++];
            else if (j > hi)                a[k] = aux[i++];
            else if (less(aux[j], aux[i]))  a[k] = aux[j++];
            else                            a[k] = aux[i++];
        }
    }

    private boolean less(Comparable v, Comparable selected) {
        return v.compareTo(selected) < 0;
    }

}
