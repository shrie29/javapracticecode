import java.util.*;
public class linkedlist {
    public static void main(String[]args){
        LinkedList<Integer> l=new LinkedList<>();
        l.add(1);
        l.add(5);
        l.add(6);

        LinkedList<Integer> k= new LinkedList<>();
        k.addFirst(400);
        k.add(100);
        l.addAll(k);
        //l.peek();

        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }


    }
}
