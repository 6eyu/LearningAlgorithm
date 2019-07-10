package com.learn.sorting;

public class SortCompare {
    public static double time(String alg, Double[] a) {
        if(alg.equals("Insertion"))
            return 0;
        return 0.0;
    }

    public static double timeRandomInput(String alg, int N, int T) {
        double total = 0.0;
        Double[] a = new Double[N];
        for(int t = 0; t < T; t++) {
            for(int i = 0; i < N; i++) {
                a[i] = Math.random();
            }
            total += time(alg, a);
        }
        return total;
    }

    public static void main(String[] args) {
        String alg1 = args[0];
        String alg2 = args[1];
        int N = Integer.parseInt(args[2]);
        int T = Integer.parseInt(args[3]);
        double t1 = timeRandomInput(alg1, N, T);
        double t2 = timeRandomInput(alg2, N, T);
        System.out.println("For" + N + " random Doubles " + alg1+ " is");
        System.out.println(t2/t1 + " times faster than " +  alg2);
    }
}
