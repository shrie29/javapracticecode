package com.company;
import java.util.Scanner;
public class switchmyboi {
    public static void main(String[]args){

        Scanner scan= new Scanner(System.in);
        System.out.println("dalo");
        //String str= scan.nextLine();
        int age= scan.nextInt();
         switch(age){
             case 18:
                 System.out.println("gandu boi");
                 break;
             case 55:
                 System.out.println("gand marao");
                 break;
             /*case "mai chutiya hu":
                 System.out.println("han bhai tum ho");
                 break;*/

             default:
                 System.out.println("gandi gandi");
         }
    }
}
