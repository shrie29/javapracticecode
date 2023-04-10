package com.company;

class cls extends Thread{
    public void run() {
        while(true) {
            System.out.println("i am running");
            System.out.println("123456789");
        }

    }
}
   class cls2 extends Thread{
       public void run() {
           while(true) {
               System.out.println("shriesh");
               System.out.println("tripathi");
           }
       }
   }

public class threading {
    public static void main(String[]args){
cls s= new cls();
cls2 d= new cls2();
s.start();
d.start();


    }
}
