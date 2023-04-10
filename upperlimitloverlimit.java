import java.util.*;
class limit{
    int N,R1,R2,x;

    public void hulu(){
        Scanner scan= new Scanner(System.in);
        System.out.println("enter size of array");
        N=scan.nextInt();
        int []arr=new int[N];
        System.out.println("enter elmts of array");
        for(int i=0;i<N;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("set range");
        R1=scan.nextInt();
        R2=scan.nextInt();
        System.out.println("result");
        for(int j=0;j<N;j++){
        if(R1<=arr[j] && R2>=arr[j]) {
            System.out.print(arr[j]+", ");
        }
        }
    }
}
public class upperlimitloverlimit {
    public static void main(String[]args){
limit l= new limit();
l.hulu();
    }
}
