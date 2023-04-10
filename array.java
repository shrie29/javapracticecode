package com.company;
import java.util.Scanner;
public class array {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("hii bro");
        int sum;
        String [] name= {"physics","chemistry","math","hindi","english"};
        //char [] name={'P','C','M','H','E'};

        int []marks;
        marks= new int[5];
          for (int i=0;i<5;i++){
              System.out.print("enter your marks ");
              System.out.println(name[i]);
              marks[i]= scan.nextInt();
          }
          sum=marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
          System.out.printf("total obtained marks is %d ",sum);
    }
}
