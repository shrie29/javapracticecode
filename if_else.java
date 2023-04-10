package com.company;
import java.util.Scanner;
public class if_else {
    public static void main(String[]args){

        Scanner scan= new Scanner(System.in);
        System.out.println("enter your age:");
int a= scan.nextInt();
        if(a==11){
            System.out.println("boy, you can drive");
        }
        else {
            System.out.println("no boy not now");
        }
/* int age= scan.nextInt();

      switch(age){
          case 18:
          System.out.println("you are going to be adult!");
          break;

          case 23:
          System.out.println("its your job time!");
          break;

          case 60:
          System.out.println("tirement time!");
          break;

          default:
          System.out.println("kaam khatam");
      }*/






        /*  int age= scan.nextInt();
        if(age>=18){
        System.out.println("boy, you can drive");
        }
        else{
            System.out.println("no boy not now");
        }*/


    }
}
