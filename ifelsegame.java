package com.driving;
import java.util.Scanner;

public class ifelsegame {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("write your age");
        int age= scan.nextInt();
        if(age>18 || age<10){
            System.out.println("you can drive");
        }
        else {
            System.out.println("no boy not nw");

        }

    }
}
