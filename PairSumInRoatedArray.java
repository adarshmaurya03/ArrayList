package ArrayList;
import java.util.*;

public class PairSumInRoatedArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int target = 5;
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(pairs(list, target));

    }

    public static boolean pairs(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                lp = i + 1;
                rp = i;
                break;
            }

        }

        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % list.size();
            } else {
                rp = (list.size() + rp - 1) % list.size();
                ;
            }
        }
        return false;
    }

}
