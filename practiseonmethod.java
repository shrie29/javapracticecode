public class practiseonmethod {

    static int natural(int n){
        if(n==1){
            return 1;
        }
        return n + natural(n-1);
    }



    static void pattern1(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }



    static void multi(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d X %d=%d\n",n,i,n*i);

        }
    }
    public static void main(String[]args){
       // multi(5);
        //pattern1(5);



        System.out.println(+natural(6));



    }
}
