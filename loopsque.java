package com.company;
import java.util.Scanner;
public class loopsque {
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
       /* System.out.println("enter the number of stars you wants");
        int n= scan.nextInt();
        for(int i=n;i>0;i--){
           for(int j=0;j<i;j++){
               System.out.print("hi");
           }

            System.out.print("\n");
        }*/
//sum of first n even natural number
    /*    int i,n;
        int sum=0;
        System.out.println("enter THe number");
        n= scan.nextInt();
        for(i=0;i<n;i++){
            sum = sum + (2*i);

        }
        System.out.print(sum);*/


        int sum=1;
        System.out.println("enter the number");
        int n= scan.nextInt();

        for(int i=n;i>=1;i--){
sum=sum*i;

        }
        System.out.println(+sum);
    }
}
