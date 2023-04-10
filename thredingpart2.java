class four implements Runnable{
    public void run(){
        while(true){
            System.out.println("hhhhhhhhhh");
        }
    }
}
class five implements Runnable{
    public void run(){
        while(true){
            System.out.println("ffffffffff");
        }
    }
}
public class thredingpart2 {
    public static void main(String[]args){
        four f= new four();
                Thread q=new Thread(f);
        five k= new five();
                Thread w= new Thread(k);

                q.start();
                w.start();

    }
}
