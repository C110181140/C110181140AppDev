package com.example.myapplication;

public class W03_4 {
    public static void main(String[] args) {
        int total2;
        total2 = sumN2N(5,15);
        System.out.println(total2);
    }
    static int sumN2N(int begin, int end){
        int i;
        int total = 0;
        for(i = begin;i<=end;i++) {
            total += i;
        }
        return total;
    }
}
