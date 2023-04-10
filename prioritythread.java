class priority extends Thread{
    priority(String name){
        super(name);

    }
    public void run(){

        System.out.println("thread name is " +getName());



    }
}
public class prioritythread {
    public static void main(String[]args){
        priority p = new priority("shriesh");
        priority q = new priority("pelu");
        priority s = new priority("huhu");
        priority t = new priority("kuu");
        priority u = new priority("jha");

        t.setPriority(Thread.MAX_PRIORITY);


        p.start();
        q.start();
        u.start();
        s.start();
        t.start();


    }
}
