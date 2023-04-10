public class recurssion {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            n= n* factorial(n-1);
            return n;
        }
    }


    public static void main(String[]args){
        int x=5;
        System.out.println("factorial is: "+factorial(x));

    }
}
