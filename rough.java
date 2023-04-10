import java.util.Scanner;
public class rough{
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        System.out.println("enter num");
        int a=scan.nextInt();
        for(int i=1;i<=10;i++){

            System.out.println(a+"x"+i+"="+a*i);
        }
    }
}