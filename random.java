package com.company;
import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[]args){
        Random rand= new Random();
        Scanner scan= new Scanner(System.in);

        System.out.println("enter your name");
        String name= scan.nextLine();
        String welcome= "welcome +name+";
        System.out.println(welcome.replace("+name+",name));
        while(true) {
            System.out.println("choose between rock-paper & scissor , press '1' for rock  '2' for paper '3' for scissor");
            int choose = scan.nextInt();
            int a = rand.nextInt(3) + 1;

            switch (a) {
                case 1:
                    if(choose==1){System.out.println("rock");}
                    System.out.println("rock");
                    if(a==1 && choose==1){System.out.println("draw");}

                    break;
                case 2:
                    if(choose==2){System.out.println("paper");}
                    System.out.println("paper");
                    if(a==2 && choose==2){System.out.println("draw");}
                    break;
                case 3:
                    if(choose==3){System.out.println("scissor");}
                    System.out.println("scissor");
                    if(a==3 && choose==3){System.out.println("draw");}
                    break;

            }
        }
    }
}
