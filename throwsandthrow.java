public class throwsandthrow {
    static int bb(int a, int b) throws ArithmeticException{
        int c=a/b;
        System.out.println(c);
        return 0;
    }
    public static void main(String[]args){

try {
    bb(4, 0);
}
catch(Exception e){
    System.out.println(e);
    System.out.println("cant devide");
}
    }
}
