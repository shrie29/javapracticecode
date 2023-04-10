class pota extends Exception{
        public String toString(){
            return "gy tum";
        }
        public String getMessage() {
            return "gy tum pakka";
        }
}


public class finalyblock {
    static int divide(int a, int j){

        int c=a/j;
        System.out.println(c);
        return c;
    }
    public static void main(String[]args){

try{
    divide(10,0);
    throw new pota();
    }
catch(Exception e) {
    System.out.println(e);

}
finally {
    System.out.println("the end");
}
}
}
