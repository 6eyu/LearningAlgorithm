package com.learn.sorting.categories;

public class Merge {

    private Comparable[] aux;


    public void topDownSort(Comparable[] a) {
        aux = new Comparable[a.length];
        topDown(a, 0, a.length - 1);
    }

    private void topDown(Comparable[] a, int lo, int hi) {
        if(hi <= lo) return;
        int mid = lo + (hi - lo)/2;
        topDown(a, lo, mid);
        topDown(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }


    public void bottomUpSort(Comparable[] a) {
        int n = a.length;
        aux = new Comparable[n];
        for(int sz = 1; sz < n; sz = sz + sz) {
            for(int lo = 0; lo < n - sz; lo += sz + sz) {
                merge(a, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, n - 1));
            }
        }
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
