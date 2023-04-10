package com.tatasky;
import java.util.Scanner;
public class again {
    public static void main(String[] args){

int num1, num2;
Scanner sc = new Scanner(System.in);
System.out.println("what is your name");
String a= sc.nextLine();
        System.out.println("hello " + a + " how r you");
        System.out.println("enter num1");
        num1= sc.nextInt();
        System.out.println("enter num2");
        num2= sc.nextInt();
        int sum= num1+num2;
       System.out.printf("sum of num1 and num2 is %d",sum);
       System.out.println(sc.hasNextInt());
    }
}
