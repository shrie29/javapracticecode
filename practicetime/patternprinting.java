package practicetime;
import java.util.Scanner;

public class patternprinting {
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();

        /*for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }*/

        /*
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
*/
       /* for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 || i==n || j==n) {
                    System.out.print("*");
                }
                    else{
                        System.out.print(" ");
                    }
                }System.out.print("\n");
            }*/
        for(int i=1;i<=n;i++){
            for(int j=n;j<=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }


        }

    }

