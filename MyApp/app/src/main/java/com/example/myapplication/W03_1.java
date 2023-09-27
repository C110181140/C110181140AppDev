package com.example.myapplication;

public class W03_1 {
    public static void main(String[] args) {
        int grade = 50;
        char type = 'm';
        if(grade>=60 && type == 'm'){
            System.out.println("課程:"+type+"\n成績及格:"+grade);
        }
        else{
            System.out.println("不及格");
        }

    }
}
