package com.example.myapplication;

public class W03_3 {
    public static void main(String[] args) {
        int total = 0;
        String str = "";
        for(int i =1; i<=10;i++){
            str += "|" + i;
            total += i;
        }
        System.out.println(str += "|=" + total);
    }
}
