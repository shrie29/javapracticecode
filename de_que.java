import java.util.*;

public class de_que {
    public static void main(String[]args){
        ArrayDeque<Integer> d= new ArrayDeque<>();
        d.add(45);
        d.add(50);
        d.add(55);
        d.addFirst(10);
        d.addLast(40);

        System.out.println(d.getFirst());
        System.out.println(d.getClass());
        System.out.println("content" + d);
        d.pollFirst();
        System.out.println(d);
    }
}
