package com.learn.sorting.categories;

public class Shell {

    public void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        int subNum = 4;

        // find an appropriate number of a sub array.
        while (h < N/subNum) {
            h = subNum * h + 1;
        }

        while (h >= 1) {
            for(int i = h; i < N; i++) {
                for(int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exchange(a, j, j - h);
                }
            }
            h = h/subNum ;
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

