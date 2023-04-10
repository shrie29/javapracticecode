package com.company;
import java.util.Scanner;
public class stringggg {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
       /* String name= "ShRiesh";
        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.replace('h','w'));
        System.out.println(name.replace("sh","uu"));
        System.out.println(name.length());
        System.out.println(name.indexOf("ie"));*/
        String str= "hi how are you +name+";
        System.out.println("write your name");
        String name= scan.nextLine();
       str=str.replace("+name+",name);
        System.out.println(str);
        int s= 55;
        System.out.println("hi baby "+ s + " gaaad doge?");

    }
}
