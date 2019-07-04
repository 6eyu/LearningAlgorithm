package com.learn.sorting.categories;

public class Selection {

    public void sort(Comparable[] a) {
        int n = a.length;

        for(int i = 0; i < n; i++) {
            int selected = i;
            for(int j = i + 1; j < n; j++){
                if (less(a[j], a[selected])) {
                    selected = j;
                }
            }
            exchange(a, i, selected);
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
