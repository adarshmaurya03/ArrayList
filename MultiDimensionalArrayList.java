package ArrayList;
import java.util.*;
public class MultiDimensionalArrayList {
  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>>mainlist=new ArrayList<>();
    ArrayList<Integer>list=new ArrayList<>();
    ArrayList<Integer>list2=new ArrayList<>();
    ArrayList<Integer>list3=new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list2.add(5);
    list2.add(6);
    list2.add(7);
    list2.add(8);
    list3.add(9);
    list3.add(10);
    list3.add(11);
    list3.add(12);
    list3.add(12);
    mainlist.add(list);
    mainlist.add(list2);
    mainlist.add(list3);
    for(int i=0;i<mainlist.size();i++){
        ArrayList<Integer>curr=mainlist.get(i);
        for(int j=0;j<curr.size();j++){
            System.out.print(curr.get(j)+" ");
        }
        System.out.println();
    }

  }  
}
