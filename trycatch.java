class lulu extends Thread{
    public void run(){
        try {
            Thread.sleep(500);
        }
        catch (Exception e){
            System.out.println(e);
        }
        while(true) {
            System.out.println("hello");
        }
    }
}
class kuku extends Thread{
    public void run(){
        while(true) {
            System.out.println(" bhai");
        }
    }
}

public class trycatch {
    public static void main(String[]args){
        lulu l= new lulu();
        kuku k= new kuku();
l.start();
k.start();

    }
}
