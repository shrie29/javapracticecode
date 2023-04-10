package com.flipkart;
import java.util.Scanner;

public class newarray {
    public static void main(String[]args){

        Scanner scan= new Scanner(System.in);
        String [] element= {"a11","a12","a13","a21","a22","a23"};

        int [][] matrix = new int[2][3];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++) {
                System.out.print("enter the element ");
                System.out.println(element[i]);
                matrix[i][j] = scan.nextInt();
            }

        }




    }
}
