import java.util.Scanner;
public class catchcatch {
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        int a=1000;
                int b= scan.nextInt();
                try {
                    System.out.println(a / b);
                }
                catch(Exception e){
                    System.out.println("cant devide reason: ");
                    System.out.println(e);
                }
    }
}
