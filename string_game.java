package com.company;
import java.util.Scanner;
public class string_game {
    public static void main(String[] args){

        Scanner scan= new Scanner(System.in);

        String name= "SHRiesh";
        System.out.println(name);

        int value= name.length();
        String lc= name.toLowerCase();
        String uc = name.toUpperCase();



        System.out.println(value);
        System.out.println(lc);
        System.out.println(uc);

        String a= scan.nextLine();
        System.out.println(a.toUpperCase());
        System.out.println(name.replace("Rie","khu"));
    }
}
