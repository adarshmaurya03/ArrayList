package ArrayList;
import java.util.*;
public class Arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(34);
        list.add(24);
        list.add(4);
        list.add(90);
        System.out.println(list);
        System.out.println(list.size());
        list.remove(3);
        System.out.println(list);
        System.out.println(list.set(3,56));
        System.out.println(list);
        System.out.println(list.contains(56));
        System.out.println(list.contains(4));
        Collections.sort(list);
        System.out.println(list);
    }
}