import java.util.*;
public class arraylist {
    public static void main(String[]args){
        ArrayList<Integer> l= new ArrayList<>();
        ArrayList<Integer> k= new ArrayList<>();

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(0,5);

        k.add(10);
        k.add(11);
        k.add(12);

        l.addAll(0,k);
        //l.clear();
        l.set(2,66);

        for(int i=0;i<l.size();i++){
            System.out.print(l.get(i));
            System.out.print(" , ");
        }
System.out.println(l.contains(5));
        System.out.println(l.contains(20));

        System.out.println(k.indexOf(12));

    }
}
