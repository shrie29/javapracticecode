import java.util.Scanner;
class didi extends Exception{
    public String toString(){
        return "kuch gdbd hai";
    }
    public String getMessage(){
        return "sch me bhai kuch to gdbd hai";
    }
}


public class exceptionclassthrow {
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        System.out.println("enter num");
        int a= scan.nextInt();
        if(a<10){
            try {
                System.out.println("nested");
                    try {
                        throw new didi();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

            }
            catch(Exception e){
                System.out.println(e);
            }
        }


    }
}
