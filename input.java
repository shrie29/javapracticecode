package com.company;
import java.util.Scanner;
public class input {
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        String line= "hello <|name|> ,have a good day";

        System.out.println("enter your name here");
        String a= scan.nextLine();
        System.out.println(line.replace("<|name|>",a));



        System.out.println("thanks");








    }
}
