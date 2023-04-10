import java.util.Scanner;
public class hackker {
    public static void main(String[]args){

        Scanner scan= new Scanner(System.in);
       /* int N= scan.nextInt();
        if(N%2==1){
            System.out.println("Weird");
        }
        else if(N%2==0 && N>=2 && N<=5){
            System.out.println("Not Weird");
        }
        else if(N%2==0 && N>=6 && N<=20){
            System.out.println("Weird");

        }
        else if(N%2==0 && N>20){
            System.out.println("Not Weird");
        }*/
        int i=scan.nextInt();
        double d=scan.nextDouble();
        String s=scan.next();



        System.out.println("string: " + s );
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }
}
