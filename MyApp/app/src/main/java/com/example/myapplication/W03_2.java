package com.example.myapplication;

public class W03_2 {
    public static void main(String[] args) {
        char gpagrade = 'C';
        switch (gpagrade) {
            case'A':
                System.out.println("grade>80");
                break;
            case'B':
                System.out.println("grade>70");
                break;
            case'C':
                System.out.println("grade>60");
                break;
            default:
                System.out.println("no pass");
        }
    }
}
