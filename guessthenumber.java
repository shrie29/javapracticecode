
import java.util.Scanner;
import java.util.Random;
class guess{
    int n,r;

    public void ruru(){
        Random rand= new Random();
        r = rand.nextInt(100);
        while(true) {

            Scanner scan= new Scanner(System.in);
            System.out.println("enter ur numbr");
            n = scan.nextInt();

           // System.out.println(+r);
            if(n<r){
                System.out.println("the number is small");
            }
                else if(n>r){
                    System.out.println("numr is bigger then rand");
                }
                else if(n==r) {
                System.out.println("u win");
                break;}

            }
        }
    }

public class guessthenumber {


    public static void main(String[]args){


guess run= new guess();

        run.ruru();



    }
}
