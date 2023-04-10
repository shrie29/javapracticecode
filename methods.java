package com.company;
import java.util.Scanner;

public class methods {
    static void foo(){
        System.out.println("hi baby");

    }
    static void foo(int a){
        int w=45;
        System.out.println("bolo kitna number: "+w+" ye?");
    }

    static int logic(int x ,int y){
        int z=x+y;
        return z;
    }
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        System.out.println("enter num1");
 int a=scan.nextInt();
        System.out.println("enter num2");
 int b=scan.nextInt();
   int z;
   z=logic(a,b);
   System.out.println("z is: "+z);
   foo();
   foo(a);
    }
}
